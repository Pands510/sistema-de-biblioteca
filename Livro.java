/*Responsabilidades:
    Pode estar disponível
    Pode ser emprestado
    Pode ser devolvido
    Pode responder se corresponde a uma pesquisa.
    
    Sabe seu título
    Sabe seu autor
    Sabe seu ISBN
*/

import java.time.LocalDate;

public class Livro implements Pesquisavel {
    private String titulo;
    private String autor;
    private int ano;
    private final String isbn;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano, String isbn) {
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);

        if (!validarIsbn(isbn)) {
            throw new IllegalArgumentException("ISBN inválido");
        }
        this.isbn = isbn;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null){
            throw new IllegalArgumentException("titulo invalido");
        }
        if(titulo.isBlank()){
            throw new IllegalArgumentException("titulo invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null){
            throw new IllegalArgumentException("autor invalido");
        }
        if(autor.isBlank()){
            throw new IllegalArgumentException("autor invalido");
        }
        this.autor = autor;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        if(ano < 0 || ano > LocalDate.now().getYear()){
            throw new IllegalArgumentException("ano invalido");
        }

        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void emprestar(){
        if(!disponibilidade){
            throw new IllegalStateException("livro ja emprestado");
        }
        disponibilidade = false;
    }

    public void devolver(){
        if(disponibilidade){
            throw new IllegalStateException("livro ja devolvido");
        }
        disponibilidade = true;
    }

    private boolean validarIsbn(String isbn){
        if(isbn == null){
            return false;
        }

        if(isbn.isBlank()){
            return false;
        }

        return isbn.matches("\\d{13}");
    }

    public boolean estaDisponivel(){
        return disponibilidade;
    }
    
    @Override
    public boolean pesquisar(String texto) {
        if(texto == null){
            throw new IllegalArgumentException("texto inserido incorretamente");
        }

        if(texto.isBlank()){
            throw new IllegalArgumentException("texto inserido incorretamente");
        }

        if(titulo.toLowerCase().contains(texto.toLowerCase()) || autor.toLowerCase().contains(texto.toLowerCase()) || isbn.toLowerCase().contains(texto.toLowerCase()) ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Livro:" + 
                "\ntitulo " + titulo +
                "\nautor " + autor +
                "\nano " + ano +
                "\nisbn " + isbn +
                "\ndisponibilidade " + disponibilidade;
    }

}