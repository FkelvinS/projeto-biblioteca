public class Pessoa {
    // Atributos
    private String nome;
    private Livro[] livros; // Livros relacionados (podem ser escritos ou emprestados)

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    // Setter opcional, caso queira associar livros
    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
