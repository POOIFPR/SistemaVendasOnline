import java.util.ArrayList;

public class Video {
    Integer pixelsHorizontal;
    Integer pixelsVertical;
    Double duracaoSegundos;
    ArrayList<String> cores;
    public Video(Integer pixelsHorizontal, Integer pixelsVertical, Double duracaoSegundos, ArrayList<String> cores) {
        this.pixelsHorizontal = pixelsHorizontal;
        this.pixelsVertical = pixelsVertical;
        this.duracaoSegundos = duracaoSegundos;
        this.cores = cores;
    }
}
