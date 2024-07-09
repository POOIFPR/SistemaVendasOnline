import java.util.ArrayList;

public class PostVideo {
    Perfil autorPost;
    Video video;
    String legenda;
    ArrayList<String> hashtags;
    ArrayList<String> comentarios;
    ArrayList<Perfil> marcações;
    public PostVideo() {
    }
    public PostVideo(Perfil autorPost, Video foto, String legenda, ArrayList<String> hashtags,
            ArrayList<String> comentarios, ArrayList<Perfil> marcações) {
        this.autorPost = autorPost;
        this.video = foto;
        this.legenda = legenda;
        this.hashtags = hashtags;
        this.comentarios = comentarios;
        this.marcações = marcações;
    }
}
