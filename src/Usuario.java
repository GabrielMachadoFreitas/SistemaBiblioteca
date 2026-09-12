import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    Scanner entradaTexto = new Scanner(System.in);
    Scanner entradaNumero = new Scanner(System.in);
    private String nome;
    private int idade;
    private ArrayList<Livro> livros;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", livros=" + livros +
                '}';
    }

        public void cadastrarCliente () {
            System.out.println("Digite o nome do cliente que deseja cadastrar:");
            this.nome = entradaTexto.nextLine();
            System.out.println("Digite a idade do usuario");
            this.idade = entradaNumero.nextInt();
        }

        public void alugarLivros () {
        }

        public void realizarDevolucao () {
        }


    }


