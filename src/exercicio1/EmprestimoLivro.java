package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmprestimoLivro {

    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o titulo do seu livro (ou sair para encerrar): ");
            String titulo = scanner.nextLine();

            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o autor do livro");
            String autor = scanner.nextLine();

            System.out.println("Digite o ano de publicação do livro");
            int anoPublicacao = 0;
            try {
                anoPublicacao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: O ano de publicação deve ser um inteiro.");
                continue;
            }

            System.out.println("O livro está emprestado? (true/false): ");
            boolean emprestado = Boolean.parseBoolean(scanner.nextLine());

            Livro livro = new Livro(titulo, autor, anoPublicacao, emprestado);
            livros.add(livro);
        }

        System.out.println("Lista de livros");
        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }
        scanner.close();
    }
}
