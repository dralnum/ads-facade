package ads.facade;

public class Facade {
    Controle controle;
    Som som;
    Video video;
    
    Facade() {
        controle = new Controle();
        som = new Som();
        video = new Video();
    }
    
    public void aumentarVolume(){
        som.aumentarVolume();
    }
    
    public void diminuirVolume(){
        som.diminuirVolume();
    }
    
    public void aumentarGrafico(){
        video.aumentarQualidadeGrafica();
    }
    
    public void diminuirGrafico(){
        video.diminuirQualidadeGrafica();
    }
    
    public void ajustarControles(){
        controle.ajustarControles();
    }
    
    public void configuracaoInicial() {
        som.aumentarVolume();
        video.aumentarQualidadeGrafica();
        controle.ajustarControles();
        
    }
}
