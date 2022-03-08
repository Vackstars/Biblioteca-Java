package biblioteca;

public class Emprestimos {
    String dataEmprestimo;
    String horaEmprestimo;
    Livros livro;
    Usuarios usuario;

    void devolverLivro(){
        System.out.println("LIVRO DEVOLVIDO");
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
