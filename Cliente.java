//Responsabilidade:
    //Apenas pega livros emprestados
    //Não cadastra livros
    //Não lista livros
    //Não busca livros

public class Cliente extends Pessoa implements Pesquisavel{

    public Cliente(String nome, String cpf, String tel) {
        super(nome, cpf, tel);
    }

    @Override
    public boolean pesquisar(String texto) {
        
    }
    
}
