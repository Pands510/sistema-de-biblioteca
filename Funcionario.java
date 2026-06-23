public class Funcionario extends Pessoa{
    private String email;
    private String id;
    private double salario;

    public Funcionario(String nome, String cpf, String tel, String email, String id, double salario) {
        super(nome, cpf, tel);
        this.email = email;
        this.id = id;
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
