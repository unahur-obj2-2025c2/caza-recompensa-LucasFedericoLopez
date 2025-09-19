package ar.edu.unahur.obj2.profugos;

public abstract class Decorator implements IProfugo{
    private IProfugo profugoBase;

    public Decorator(IProfugo profugoBase) {
        this.profugoBase = profugoBase;
    }

    public IProfugo getProfugoBase() {
        return profugoBase;
    }
    
    @Override
    public Integer getInocencia() {
        return profugoBase.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return profugoBase.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return profugoBase.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugoBase.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugoBase.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad() {
        profugoBase.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoBase.disminuirInocencia();
    }
}
