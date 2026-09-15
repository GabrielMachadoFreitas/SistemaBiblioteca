import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        if (buscarUsuario(usuario.getNome()) == null) {
            usuarios.add(usuario);
            System.out.println("Usuário cadastrado com sucesso.");
        } else {
            System.out.println("Já existe um usuário com esse nome.");
        }
    }

    public void cadastrarLivro(Livro livro) {
        if (buscarLivro(livro.getTitulo()) == null) {
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso.");
        } else {
            System.out.println("Já existe um livro com esse título.");
        }
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        }

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        }

        for (Livro livro : livros) {
            String situacao = livro.isAlugado() ? "Alugado" : "Disponível";
            System.out.println(livro.getTitulo() + " - " + situacao);
        }
    }

    public void alugarLivro(String nomeUsuario, String tituloLivro) {
        Usuario usuario = buscarUsuario(nomeUsuario);
        Livro livro = buscarLivro(tituloLivro);

        if (usuario == null || livro == null) {
            System.out.println("Usuário ou livro não encontrado.");
        } else if (livro.isAlugado()) {
            System.out.println("Livro não disponível para aluguel.");
        } else {
            livro.setAlugado(true);
            usuario.getLivrosAlugados().add(livro);
            System.out.println("Aluguel realizado com sucesso.");
        }
    }

    public void devolverLivro(String nomeUsuario, String tituloLivro) {
        Usuario usuario = buscarUsuario(nomeUsuario);
        Livro livro = buscarLivro(tituloLivro);

        if (usuario == null || livro == null) {
            System.out.println("Usuário ou livro não encontrado.");
        } else if (!usuario.getLivrosAlugados().contains(livro)) {
            System.out.println("Esse livro não está alugado para esse usuário.");
        } else {
            livro.setAlugado(false);
            usuario.getLivrosAlugados().remove(livro);
            System.out.println("Devolução realizada com sucesso.");
        }
    }

    public void consultarDisponibilidade(String tituloLivro) {
        Livro livro = buscarLivro(tituloLivro);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else if (livro.isAlugado()) {
            System.out.println("Livro não está disponível.");
        } else {
            System.out.println("Livro está disponível.");
        }
    }

    public void listarLivrosAlugados(String nomeUsuario) {
        Usuario usuario = buscarUsuario(nomeUsuario);

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else if (usuario.getLivrosAlugados().isEmpty()) {
            System.out.println("Esse usuário não possui livros alugados.");
        } else {
            for (Livro livro : usuario.getLivrosAlugados()) {
                System.out.println(livro.getTitulo());
            }
        }
    }
}
