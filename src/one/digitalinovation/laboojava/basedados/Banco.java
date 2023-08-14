package one.digitalinovation.laboojava.basedados;

import one.digitalinovation.laboojava.entidade.Cliente;
import one.digitalinovation.laboojava.entidade.Cupom;
import one.digitalinovation.laboojava.entidade.Pedido;
import one.digitalinovation.laboojava.entidade.Produto;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Produto> produtos;
    private List<Pedido> pedidos;
    private List<Cliente> clientes;
    private List<Cupom> cupons;

    public Banco() {

        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cupons = new ArrayList<>();

        cupons.add(new Cupom("CUPOM2", 2));
        cupons.add(new Cupom("CUPOM5", 5));
        cupons.add(new Cupom("CUPOM7", 7));
    }

    public Cliente[] getClientes() {
        return clientes.toArray(new Cliente[clientes.size()]);
    }

    public Cupom[] getCupons() {
        return cupons.toArray(new Cupom[cupons.size()]);
    }

    public Pedido[] getPedidos() {
        return pedidos.toArray(new Pedido[pedidos.size()]);
    }

    public Produto[] getProdutos() {
        return produtos.toArray(new Produto[produtos.size()]);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int posicao) {
        produtos.remove(posicao);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(int posicao) {
        pedidos.remove(posicao);
    }

    public void adicionarCliente(Cliente novocliente){
        clientes.add(novocliente);
    }

    public void removerCliente(int posicao){
        clientes.remove(posicao);
    }


}
