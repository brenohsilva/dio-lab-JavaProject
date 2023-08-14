package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;

import java.util.Objects;
import java.util.Optional;

public class ClienteNegocio {

    private Banco bancoDados;

    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }


    public Optional<Cliente> consultar(String cpf) {

        for (Cliente ocliente: bancoDados.getClientes()){
            if (ocliente.getCpf().equalsIgnoreCase(cpf))  {
                System.out.println("Usuario já cadastrado!");
                return Optional.of(ocliente);
            }
        }

        return Optional.empty();
    }

    public void salvar(Cliente novocliente){
        boolean clienteExistente = false;
        for (Cliente clientes: bancoDados.getClientes()){

            if (Objects.equals(clientes.getCpf(), novocliente.getCpf())){
                clienteExistente = true;
                System.out.println("Cliente já cadastrado.");
                break;

            }
        }
        if (!clienteExistente){
            bancoDados.adicionarCliente(novocliente);
            System.out.println("Usuario cadastrado com sucesso.");
        }

    }

    public void excluir(String cpf){
        int clienteExclusao = -1;

        for (int i = 0; i < bancoDados.getClientes().length; i++){
            Cliente cliente = bancoDados.getClientes()[i];

            if (cliente.getCpf().equals(cpf)){
                clienteExclusao = i;
                break;
            }
        }

        if (clienteExclusao != -1){
            bancoDados.removerCliente(clienteExclusao);
        }
    }


}
