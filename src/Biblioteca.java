import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Usuario> usuarios;
    public ArrayList<Livro> livros;


    public void listarUsuarios () {
        for (Usuario us: usuarios) {
            System.out.println();
        }
    }
    ;
}
