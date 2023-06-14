package lanchonete;

public class Colaboradores {

    private String nome;

    private int cnpj;
    private String endereco;
    private int telefone;
    private String email;
    private String cargo;
    private String setor;
    private double salario;
    private String daraDeInicioDaEmpresa;

    public Colaboradores(String nome, int cnpj, String endereco, int telefone, String email, String cargo, String setor, double salario, String daraDeInicioDaEmpresa) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
        this.setor = setor;
        this.salario = salario;
        this.daraDeInicioDaEmpresa = daraDeInicioDaEmpresa;
    }

    

    public String Exibe() {
      
        System.out.println(this.nome);
        System.out.println(this.cnpj);
        System.out.println(this.endereco);
        System.out.println(this.telefone);
        System.out.println(this.email);
        System.out.println(this.cargo);
        System.out.println(this.setor);
        System.out.println(this.salario);
        System.out.println(this.daraDeInicioDaEmpresa);
        
        return "";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDaraDeInicioDaEmpresa() {
        return daraDeInicioDaEmpresa;
    }

    public void setDaraDeInicioDaEmpresa(String daraDeInicioDaEmpresa) {
        this.daraDeInicioDaEmpresa = daraDeInicioDaEmpresa;
    }

}
