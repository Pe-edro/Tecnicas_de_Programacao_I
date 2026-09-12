public class conteudo{
    public String titulo;
    public int duracaoMinutos;

    public conteudo(String titulo, int duracaoMinutos){
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibirResumo(){
        System.err.println("Título: " + titulo);
        System.err.println("Duração: " + duracaoMinutos);
    }
}