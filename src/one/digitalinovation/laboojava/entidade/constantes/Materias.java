package one.digitalinovation.laboojava.entidade.constantes;

public enum Materias {

    M2(0.2),
    M5(0.5),
    M10(0.10);

    private double fator;

    Materias(double fator){
        this.fator = fator / 100;
    }

    public double getFator() {
        return fator;
    }
}
