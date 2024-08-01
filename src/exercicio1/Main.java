package exercicio1;

public class Main {

    public static void main(String[] args) {

        // Instanciando objetos da classe Livro
        Livro livro1 = new Livro("1984", "George Orwell", 1949, false);
        Livro livro2 = new Livro("Fahrenheit 451", "Ray Bradbury", 1953, false);

        // Chamando métodos nos objetos
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());

        // Alterando o status de empréstimo do livro1
        livro1.alterarStatusEmprestimo();
        System.out.println("Novo status do livro1: " + livro1.isEmprestado());

        // Comparando dois objetos usando equals()
        if (livro1.equals(livro2)) {
            System.out.println("Os livros são iguais.");
        } else {
            System.out.println("Os livros são diferentes.");
        }
    }
}
