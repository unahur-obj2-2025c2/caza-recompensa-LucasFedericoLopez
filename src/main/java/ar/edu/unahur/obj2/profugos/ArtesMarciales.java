package ar.edu.unahur.obj2.profugos;

public class ArtesMarciales extends Decorator{

    public ArtesMarciales(IProfugo profugoBase) {
        super(profugoBase);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, getProfugoBase().getHabilidad() * 2);
    }
}
