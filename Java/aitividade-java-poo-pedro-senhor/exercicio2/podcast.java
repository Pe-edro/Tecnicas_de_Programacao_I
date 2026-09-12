public class podcast extends conteudo {
    public String apresentador;
 
    public podcast(String titulo, int duracaoMinutos, String apresentador) {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }
 
    public void ouvirPodcast() {
        System.out.println("Podcast apresentado por " + apresentador);
    }
}