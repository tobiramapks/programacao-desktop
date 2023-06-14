package lanchonete;

public class Fornecedores {
    
 private String nomeFantasia;
    private String razaoSocial;
    private int cnpj;
    private String endereco;
    private int telefone;
    private String email;
    private String dataDaUltimaCompra;

    public String Exibe() {
      
        System.out.println(this.nomeFantasia);
        System.out.println(this.razaoSocial);
        System.out.println(this.cnpj);
        System.out.println(this.endereco);
        System.out.println(this.telefone);
        System.out.println(this.email);
        System.out.println( this.dataDaUltimaCompra);
     return "";
    }
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Fornecedores(String nomeFantasia, String razaoSocial, int cnpj, String endereco, int telefone, String email, String dataDaUltimaCompra) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataDaUltimaCompra = dataDaUltimaCompra;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDataDaUltimaCompra() {
        return dataDaUltimaCompra;
    }

    public void setDataDaUltimaCompra(String dataDaUltimaCompra) {
        this.dataDaUltimaCompra = dataDaUltimaCompra;
    }

  
    
}
