/*Responsabilidades:
    Representar qualquer pessoa da biblioteca
    Não sabe cadastrar livros
    Não sabe emprestar
    Apenas guarda informações pessoais
*/

public abstract class Pessoa { //Representa uma Pessoa que vai interagir com o sistema
    private String nome;
    private final String cpf; //Imutabilidade do CPF
    private String tel;

    public Pessoa(String nome, String cpf, String tel) {
        this.nome = nome;
        if(!validarCpf(cpf)){
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
        setTel(tel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("nome invalido");
        }
        if(nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if(tel.length() == 11){
            this.tel = tel;
        }
    }

    private boolean validarCpf(String cpf){

        if(cpf == null){
            return false;
        }

        return cpf.matches("\\d{11}");
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
       "\nCPF: " + cpf +
       "\nTelefone: " + tel;
    }
}
