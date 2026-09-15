public class Livro {
    private String titulo;
    private boolean alugado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.alugado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
