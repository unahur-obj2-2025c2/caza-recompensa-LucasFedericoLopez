package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.cazadores.Cazador;
import ar.edu.unahur.obj2.profugos.IProfugo;

public class Agencia {
    //Singleton
    private static Agencia instance;

    private List<Cazador> cazadores = new ArrayList<>();
    
    private Agencia(List<Cazador> cazadores) {
        this.cazadores = cazadores;
    }

    public static Agencia getInstance() {
        return instance;
    }

    public void agregarCazador(Cazador cazador) {
        cazadores.add(cazador);
    }

    public List<IProfugo> profugosCapturados() {
        return cazadores.stream().flatMap(c -> c.getProfugosCapturados().stream()).toList();
    }

    public IProfugo profugoMasHabilCapturado() {
        return profugosCapturados().stream().max(Comparator.comparing(IProfugo::getHabilidad)).orElse(null);
    }

    public Cazador cazadorConMasCapturas() {
        return cazadores.stream().max(Comparator.comparing(Cazador::cantidadDeProfugosCapturados)).orElse(null);
    }
}
