public class videoaula extends conteudo{
    public String plataforma;

    public videoaula(String titulo, int duracaoMinutos, String plataforma){
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }
    public void repoduzirVideo(){
        System.out.println("Reproduzindo na plataforma");
    }
}
