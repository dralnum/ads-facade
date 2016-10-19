package ads.facade;

import java.util.Scanner;

public class MenuInicial {

    Scanner entrada = new Scanner(System.in);
    Facade facade = new Facade();

    public void comecar() {
        Jogo jogo = new Jogo();
        facade.configuracaoInicial();
        boolean y = true;
        while (y == true) {
            int x;
            System.out.println(" ----------------- ");
            System.out.println("| 1) Iniciar Jogo |");
            System.out.println("| 2) Opções       |");
            System.out.println("| 3) Fechar       |");
            System.out.println(" ----------------- ");
            x = entrada.nextInt();
            switch (x) {
                case 1:
                    jogo.jogar();
                    break;
                case 2:
                    jogo.opcoes();
                    break;
                case 3:
                    y = false;
                    break;

            }
        }
    }

}
