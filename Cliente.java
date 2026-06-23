public class Cliente extends Pessoa implements Pesquisavel{

    public Cliente(String nome, String cpf, String tel) {
        super(nome, cpf, tel);
    }

    @Override
    public boolean pesquisa(String texto) {
        
    }
    
}
