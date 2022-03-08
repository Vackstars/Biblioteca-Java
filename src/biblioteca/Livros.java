package biblioteca;

public class Livros {
    String titulo;
    String autores;
    String area;
    String editora;
    String ano;
    int edicao;
    int numFolhas;
    boolean emprestimo;



    public Livros() {
        emprestimo = false;
    }

    void abrirL(){
        System.out.println("LIVRO ABERTO");
    }

    void fecharL(){
        System.out.println("LIVRO FECHADO");
    }

    public boolean getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



}
