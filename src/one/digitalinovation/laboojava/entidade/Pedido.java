package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String codigo;
    private Cliente usuario;
    private List<Produto> produtos;
    private Double total;

    public Pedido(){
        this.produtos = new ArrayList<>();
    }

    // GETTERS AND SETTERS
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Cliente getUsuario() {
        return usuario;
    }
    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

    private String getProdutosComprados() {
        StringBuilder produtos = new StringBuilder();
        produtos.append("[");
        for (Produto produto: getProdutos()) {
            produtos.append(produto.toString());
            produtos.append("Qtd:");
            produtos.append(produto.getQuantidade());
            produtos.append(" ");
        }
        produtos.append("]");

        return produtos.toString();
    }

    public String toString(){
        return "Pedido {" +
                "codigo='" + codigo + '\'' +
                ", cliente=" + usuario +
                ", produtos=" + getProdutosComprados() +
                ", total=" + total +
                '}';
    }

}
