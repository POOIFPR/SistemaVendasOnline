import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {        
        Usuario usuario =  new Usuario("Lucas Ribeiro",
         "(45) 2568-6733",
          "01091221944",
           "lucas@email.com",
            "luquinhas1415");

        ArrayList<String> cores = new ArrayList<>();
        cores.add("amarelo");
        cores.add("preto");
        cores.add("azul");
        Foto foto = new Foto(475, 125, cores); 
        Video video = new Video(1920, 1080, 15.00, cores);
        Perfil perfil = new Perfil(foto, "Paranavaí-Pr", new ArrayList<>(), Status.DISPONIVEL, usuario);
        PostFoto postFoto = new PostFoto(perfil, foto, "Com os melhores amigos", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        PostVideo postVideo = new PostVideo(perfil, video, "Com os melhores amigos pt.2", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }
}
