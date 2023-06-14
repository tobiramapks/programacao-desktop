package lanchonete;

public class Clientes {

    private String nome;
    private String cpf;
    private String endereco;
    private int celular;
    private String email;
    private String estidoEntrega;
    private String temZap;
    private String DataDeCadastro;

    public Clientes(String nome, String cpf, String endereco, int celular, String email, String estidoEntrega, String temZap, String DataDeCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
        this.estidoEntrega = estidoEntrega;
        this.temZap = temZap;
        this.DataDeCadastro = DataDeCadastro;
    }

    public String Exibe() {
      
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco);
        System.out.println(this.celular);
        System.out.println(this.email);
        System.out.println(this.estidoEntrega);
        System.out.println( this.temZap);
        System.out.println(this.DataDeCadastro);
        return "";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstidoEntrega() {
        return estidoEntrega;
    }

    public void setEstidoEntrega(String estidoEntrega) {
        this.estidoEntrega = estidoEntrega;
    }

    public String getTemZap() {
        return temZap;
    }

    public void setTemZap(String temZap) {
        this.temZap = temZap;
    }

    public String getDataDeCadastro() {
        return DataDeCadastro;
    }

    public void setDataDeCadastro(String DataDeCadastro) {
        this.DataDeCadastro = DataDeCadastro;
    }
    
}
