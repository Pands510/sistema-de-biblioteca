//Responsabilidades:
    //Pode estar disponível
    //Pode ser emprestado
    
    //Pode ser devolvido
    //Sabe seu título
    //Sabe seu autor
    //Sabe seu ISBN

public class Livro implements Pesquisavel {
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano, String isbn, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void emprestar(){

    }

    public void devolver(){

    }

    @Override
    public boolean pesquisar(String texto) {

    }
}