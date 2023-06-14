package lanchonete;

public class Produtos {

    private String descricao;
    private int codigoDeBarras;
    private int quantidade;
    private double preco;
    private String DataDeCadastro;
    private double estoqueMinimo;

    public Produtos(String descricao, int codigoDeBarras, int quantidade, double preco, String DataDeCadastro, double estoqueMinimo) {
        this.descricao = descricao;
        this.codigoDeBarras = codigoDeBarras;
        this.quantidade = quantidade;
        this.preco = preco;
        this.DataDeCadastro = DataDeCadastro;
        this.estoqueMinimo = estoqueMinimo;
    }
    
       public String Exibe() {
      
        System.out.println(this.descricao);
        System.out.println(this.codigoDeBarras);
        System.out.println(this.quantidade);
        System.out.println(this.preco);
        System.out.println(this.DataDeCadastro);
        System.out.println(this.estoqueMinimo);
        
        return "";
    }
    
    
    Produtos(String pacote_Grande_com_3_kg, int i, int i0, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataDeCadastro() {
        return DataDeCadastro;
    }

    public void setDataDeCadastro(String DataDeCadastro) {
        this.DataDeCadastro = DataDeCadastro;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
  
    
}
