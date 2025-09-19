package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.zonas.Zona;

public abstract class Cazador {
    private Integer experiencia;
    private List<IProfugo> profugosCapturados = new ArrayList<>();
    
    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public List<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }

    public Integer cantidadDeProfugosCapturados() {
        return profugosCapturados.size();
    }

    public void capturarAProfugoEn(Zona zona) {
        List<IProfugo> intimidados = new ArrayList<>();
        for (IProfugo profugo : zona.getProfugos()) {
            if (puedeCapturarA(profugo)) {
                profugosCapturados.add(profugo);
                zona.removerProfugo(profugo);
            } else {
                intimidarA(profugo);
                intimidados.add(profugo);
            }
        }
        Integer minimaHabilidad = intimidados.stream().mapToInt(p -> p.getHabilidad()).min().orElse(0);
        experiencia += minimaHabilidad + (2 * getProfugosCapturados().size());
    }

    public void intimidarA(IProfugo profugo) {
        profugo.disminuirInocencia();
        intimidacionEspecifica(profugo);
    }

    public Boolean puedeCapturarA(IProfugo profugo) {
        return this.getExperiencia() > profugo.getInocencia() && condicionEspecifica(profugo);
    }

    public abstract Boolean condicionEspecifica(IProfugo profugo);
    public abstract void intimidacionEspecifica(IProfugo profugo);


}