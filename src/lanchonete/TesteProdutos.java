package lanchonete;

public class TesteProdutos {
    
    public static void main(String[] args) {
        
        Produtos produdo = new Produtos("Pacote Grande com 3 kg", 1429941212, 75, 9.55, "11/04/2022", 9);
        
        System.out.println(produdo.Exibe());
        
        
    }

}

//private String descricao;
//    private int codigoDeBarras;
//    private int quantidade;
//    private double preco;]
//private String DataDeCadastro;
//    private double estoqueMinimo;
