import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String opcao;

        do {
            System.out.println("\n1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Listar usuários");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Alugar livro");
            System.out.println("6 - Devolver livro");
            System.out.println("7 - Consultar disponibilidade");
            System.out.println("8 - Listar livros de um usuário");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome do usuário: ");
                    biblioteca.cadastrarUsuario(new Usuario(scanner.nextLine()));
                    break;
                case "2":
                    System.out.print("Título do livro: ");
                    biblioteca.cadastrarLivro(new Livro(scanner.nextLine()));
                    break;
                case "3":
                    biblioteca.listarUsuarios();
                    break;
                case "4":
                    biblioteca.listarLivros();
                    break;
                case "5":
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    biblioteca.alugarLivro(nomeUsuario, tituloLivro);
                    break;
                case "6":
                    System.out.print("Nome do usuário: ");
                    nomeUsuario = scanner.nextLine();
                    System.out.print("Título do livro: ");
                    tituloLivro = scanner.nextLine();
                    biblioteca.devolverLivro(nomeUsuario, tituloLivro);
                    break;
                case "7":
                    System.out.print("Título do livro: ");
                    biblioteca.consultarDisponibilidade(scanner.nextLine());
                    break;
                case "8":
                    System.out.print("Nome do usuário: ");
                    biblioteca.listarLivrosAlugados(scanner.nextLine());
                    break;
                case "0":
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("0"));

        scanner.close();
    }
}
