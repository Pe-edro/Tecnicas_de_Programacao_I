public class Main {
    public static void main(String[] args) {
        videoaula video = new videoaula("Encapsulamento", 40, "Teams");
        podcast podcast = new podcast("Herança em Java", 25, "Mariana");
 
        video.exibirResumo();
        podcast.exibirResumo();
 
        video.repoduzirVideo();
        podcast.ouvirPodcast();
    }
}