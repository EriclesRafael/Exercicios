package exercicio1;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    // Construtor padrão
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
        this.emprestado = false;
    }

    // Construtor com parâmetros
    public Livro(String titulo, String autor, int anoPublicacao, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = emprestado;
    }

    // Getters e Setters
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao
                + ", emprestado=" + emprestado + "]";
    }

    // Método hashCode()
    @Override
    public int hashCode() {
        return java.util.Objects.hash(titulo, autor, anoPublicacao, emprestado);
    }

    // Método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        return java.util.Objects.equals(titulo, other.titulo) &&
                java.util.Objects.equals(autor, other.autor) &&
                anoPublicacao == other.anoPublicacao &&
                emprestado == other.emprestado;
    }

    // Outro método para alterar o status de empréstimo do livro
    public void alterarStatusEmprestimo() {
        this.emprestado = !this.emprestado;
    }
}
