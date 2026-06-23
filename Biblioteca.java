import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getAdmins() {
        return funcionarios;
    }

    public void setAdmins(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void cadastrarLivro(){

    }

    public void buscarLivro(){
        
    }

    public void listarLivros(){
        
    }

    public void removerLivro(){
        
    }

    public void alterarLivro(){
        
    }

    public void ordenarLivros(){
        
    }

    public void cadastrarCliente(){
        
    }

    public void buscarCliente(){
        
    }

    public void emprestarLivro(){
        
    }

    public void devolverLivro(){
        
    }
}
