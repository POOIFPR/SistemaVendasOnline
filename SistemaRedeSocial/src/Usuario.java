public class Usuario {
    String nome;
    String telefone;
    String cpf;
    String email;
    String senha;
    public Usuario(String nome, String telefone, String cpf, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Perfil criarPerfil(){
        return new Perfil();
    }

    public PostFoto postarFoto(){
        return new PostFoto();
    }
    
    public PostVideo postarVideo(){
        return new PostVideo();
    }

    public void atualizarStatus(Perfil perfil, Status status) {
        perfil.setStatus(status);
    }

    public void buscarUsuario(){}

    public void enviarSolicitacaoAmizade(){}

    public void curtirFoto(){}

    public void comentarFoto(){}

    public void enviarMensagemDireta(){}

    public void alterarConfiguracoesPrivacidade(){}
}
