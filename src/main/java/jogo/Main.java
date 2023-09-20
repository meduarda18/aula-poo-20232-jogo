package jogo;

public class Main {
    public static void main(String[] args) {
        Personagem raimundo = new Personagem("Raimundo Nonato");
        Personagem madruga = new Personagem("Seu Madruga");
        Arma peixeira = new Arma("Peixeira", 20);
        Arma chinela = new Arma("Chinela havaiana", 5);

        raimundo.setArma(peixeira);
//        madruga.setArma(chinela);

        raimundo.atacar(madruga);
        madruga.atacar(raimundo);
    }
}
