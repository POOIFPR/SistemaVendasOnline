import java.util.ArrayList;

public class Perfil {
    Foto foto;
    String bio;
    ArrayList<Foto> feed;
    Status status;
    Usuario usuario;
    public Perfil(Foto foto, String bio, ArrayList<Foto> feed, Status status, Usuario usuario) {
        this.foto = foto;
        this.bio = bio;
        this.feed = feed;
        this.status = status;
        this.usuario = usuario;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public Perfil() {
    }
}
