package ar.edu.unahur.obj2.zonas;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class Zona {
    private String nombre;
    private Set<IProfugo> profugos = new HashSet<>();
    
    public Zona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<IProfugo> getProfugos() {
        return profugos;
    }

    public void removerProfugo(IProfugo profugo) {
        profugos.remove(profugo);
    }

    public void agregarProfugo(IProfugo profugo) {
        profugos.add(profugo);
    }
    
}
