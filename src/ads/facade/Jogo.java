package ads.facade;

import java.util.Scanner;

public class Jogo {

    Scanner entrada = new Scanner(System.in);
    Facade facade = new Facade();

    public void jogar() {
        boolean i = true;
        while (i == true) {
            System.out.println("\nJogando...");
            System.out.println("insira (1) para pausar ou (2) para voltar ao menu inicial");
            int x = entrada.nextInt();
            switch (x) {
                case 1:
                    opcoes();
                    break;
                case 2:
                    i = false;
                    break;
            }
        }
    }

    public void opcoes() {
        int x;
        boolean i = true;
        while (i == true) {
            System.out.println("\n\n ---------------------- ");
            System.out.println("| 1) Aumentar Volume   |");
            System.out.println("| 2) Diminuir Volume   |");
            System.out.println("| 3) Aumentar Gráfico  |");
            System.out.println("| 4) Diminuir Gráfico  |");
            System.out.println("| 5) Ajustar Controles |");
            System.out.println("| 6) Config. Inicial   |");
            System.out.println("| 7) Sair              |");
            System.out.println(" ---------------------- ");
            x = entrada.nextInt();
            switch (x) {
                case 1:
                    facade.aumentarVolume();
                    break;
                case 2:
                    facade.diminuirVolume();
                    break;
                case 3:
                    facade.aumentarGrafico();
                    break;
                case 4:
                    facade.diminuirGrafico();
                    break;
                case 5:
                    facade.ajustarControles();
                    break;
                case 6:
                    facade.configuracaoInicial();
                    break;
                case 7:
                    i = false;
                    break;
            }
        }
    }
}
