package biblioteca;

public class main {
    public static void main(String[] args) {

        Livros livro = new Livros();
        Usuarios usuario = new Usuarios();
        Emprestimos emprestimo = new Emprestimos();

        System.out.println("-------EMPRESTIMO---------");
        livro.setTitulo("Meu Amor");
        usuario.setNome("Enzo");
        usuario.setIdade(21);
        usuario.setSexo("masculino");
        usuario.setTelefone(998960004);
        emprestimo.setDataEmprestimo("21/12/2022");
        emprestimo.setHoraEmprestimo("21:00");

        System.out.println("livro: "+ livro.titulo);
        System.out.println("Usuario: "+ usuario.nome);
        System.out.println("num usuario: "+ usuario.telefone);
        System.out.println("data: "+ emprestimo.dataEmprestimo);
        System.out.println("Hora: "+ emprestimo.horaEmprestimo);
        livro.abrirL();
        usuario.lerLivro();
        livro.fecharL();
        emprestimo.devolverLivro();


    }
}
