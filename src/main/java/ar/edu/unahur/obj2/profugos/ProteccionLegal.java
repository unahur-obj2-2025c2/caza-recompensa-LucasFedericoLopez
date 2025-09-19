package ar.edu.unahur.obj2.profugos;

public class ProteccionLegal extends Decorator{

    public ProteccionLegal(IProfugo profugoBase) {
        super(profugoBase);
    }

    @Override
    public Integer getInocencia() {
        return Math.max(40, getProfugoBase().getInocencia());
    }

    @Override
    public void disminuirInocencia() {
        if (getProfugoBase().getInocencia() > 40) {
            getProfugoBase().disminuirInocencia();
        }
    }

}
