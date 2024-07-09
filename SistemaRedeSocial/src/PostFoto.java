import java.util.ArrayList;

public class PostFoto {
    Perfil autorPost;
    Foto foto;
    String legenda;
    ArrayList<String> hashtags;
    ArrayList<String> comentarios;
    ArrayList<Perfil> marcações;
    public PostFoto() {
    }
    public PostFoto(Perfil autorPost, Foto foto, String legenda, ArrayList<String> hashtags,
            ArrayList<String> comentarios, ArrayList<Perfil> marcações) {
        this.autorPost = autorPost;
        this.foto = foto;
        this.legenda = legenda;
        this.hashtags = hashtags;
        this.comentarios = comentarios;
        this.marcações = marcações;
    }
}
