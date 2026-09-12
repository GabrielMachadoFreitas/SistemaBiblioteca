import java.util.Scanner;

public class Livro {
    Scanner entradaTexto = new Scanner(System.in);
    Scanner entradaNumero = new Scanner(System.in);
    private String titulo;
    private boolean disponibilidade;

    public Livro(String titulo, boolean disponibilidade) {
        this.titulo = titulo;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", disponibilidade=" + disponibilidade +
                '}';
    }

    public void cadastrarLivro() {
        System.out.println("Digite o nome do livro que deseja cadastrar:");
        this.titulo = entradaTexto.nextLine();
    }

    public void listarLivro() {}
}
