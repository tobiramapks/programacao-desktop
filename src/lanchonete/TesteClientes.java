package lanchonete;

public class TesteClientes {

    public static void main(String[] args) {
        
        Clientes cliente = new Clientes("Joao", "533.252.777-44", "Rua Parsdawsd", 981153565, "joaowdasd@gmail.com", "Aereo", "Sim", "22/02/2019");
        
        System.out.println(cliente.Exibe());
        
        
    }
    
}

//    private String nome;
//    private String cpf;
//    private String endereco;
//    private int celular;
//    private String email;
//    private String estidoEntrega;
//    private String temZap;
//    private String DataDeCadastro;