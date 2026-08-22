public class carro{
    String marca;
    String cor;
    String modelo;
    String combustivel;
    String buzinar;
    boolean ligar;
    int ano;
    int velocidade;

void ano(){
    ano = 2012;
}

void combustivel(){
    combustivel = "flex";
}

void ligar(){
    ligar = true;
    System.out.println("Carro Lingando.");
}

void desligar(){
    ligar = false;
    System.out.println("carro Desligado.");
}

 void acelerar () {
    if (ligar){
        velocidade = velocidade + 10;
    }else{
        System.out.println("Não é possivel acelerar com o carro desligado!");
    }
}
 
void frear () {
    velocidade = velocidade - 10;
}
 
void bater () {
    velocidade = 0;
    System.out.println ("bateu e morreu");
}

void buzinar(){
    System.out.println("bibi");
}

void mostrarDados (){
     System.out.println ("Marca: " + marca);
     System.out.println ("Cor:" + cor);
     System.out.println ("Modelo: " + modelo);
     System.out.println ("Ano: " + ano);
     System.out.println ("Combustivel: " + combustivel);
     System.out.println ("Velocidade: " + velocidade);
     System.out.println ("Liagando: " + ligar);
     System.out.println ();
}
   
}
 