package ar.edu.unahur.obj2.profugos;

public class ProfugoComun implements IProfugo{
    private Integer inocencia;
    private Integer habilidad;
    private Boolean nervioso;

    
    public ProfugoComun(Integer inocencia, Integer habilidad, Boolean nervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.nervioso = nervioso;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }
    @Override
    public Integer getHabilidad() {
        return habilidad;
    }
    @Override
    public Boolean esNervioso() {
        return nervioso;
    }
    @Override
    public void volverseNervioso() {
        nervioso = Boolean.TRUE;
    }
    @Override
    public void dejarDeEstarNervioso() {
        nervioso = Boolean.FALSE;
    }
    @Override
    public void reducirHabilidad() {
        habilidad = Math.max(0, inocencia - 5);
    }
    @Override
    public void disminuirInocencia() {
        inocencia = Math.max(0, inocencia - 2);
    }

    
}
