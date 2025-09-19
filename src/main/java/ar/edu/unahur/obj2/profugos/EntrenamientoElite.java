package ar.edu.unahur.obj2.profugos;

public class EntrenamientoElite extends Decorator{

    public EntrenamientoElite(IProfugo profugoBase) {
        super(profugoBase);
    }

    @Override
    public Boolean esNervioso() {
        return Boolean.FALSE;
    }

}
