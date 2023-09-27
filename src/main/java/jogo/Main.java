package jogo;

public class Main {
    public static void main(String[] args) {
        Personagem lula = new Personagem("Lula");
        Personagem bolsonaro = new Personagem("Bolsonaro");
        Arma metralhadora = new Arma("Metralhadora", 15);
        Arma vacina = new Arma("Vacina da covid", 20);
        Pocao zeGotinha = new Pocao("Vacina de gotinha", 15);

        lula.setArma(vacina);
        bolsonaro.setArma(metralhadora);

        bolsonaro.atacar(lula);
        lula.atacar(bolsonaro);
        lula.recuperarVida(zeGotinha);
        

//        Scanner teclado = new Scanner(System.in);
//        boolean executando = true;
//
//        while (executando) {
//            System.out.println("Menu");
//            System.out.println("1 - Iniciar");
//            System.out.println("2 - Opções");
//            System.out.println("3 - Sair");
//            System.out.print("Digite uma opção:");
//            int opc = teclado.nextInt();
//
//            switch (opc) {
//                case 1:
//                    System.out.println("Você escolheu Iniciar");
//                    break;
//                case 2:
//                    System.out.println("Você escolheu Opções");
//                    break;
//                case 3:
//                    System.out.println("Você escolheu Sair");
//                    executando = false;
//                    break;
//                default:
//                    System.out.println("Opção inválida");
//                    break;
//            }


//double randNum = Math.random(); // 0 >= num > 1.0
//if (randNum < 0.3) {
//System.out.println("Encontrou um inimigo");
//}
//System.out.println(randNum);
//}

}
}
