package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

public class Caderno extends Produto {

    private Materias materia;

    public Materias getTipo() {
        return materia;
    }
    public void setTipo(Materias tipo) {
        this.materia = tipo;
    }

    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade() * (1 + materia.getFator()));
    }
}
