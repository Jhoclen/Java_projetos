package desafio9;

public class Main {

    public static void desenharFigura(Figura figura){
        figura.desenhar();
    }

    public static void main(String[] args) {
        
        Figura circulo = new Circulo();
        Figura quadrado = new Quadrado();

        desenharFigura(circulo);
        desenharFigura(quadrado);
    }
    
}
