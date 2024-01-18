public class Main {

    public static void main(String[] args) {
        int valorCarro = 100_000;
        if (valorCarro > 100_000) {
            System.out.println("Não comprar. Carro está a cima da tabela");
        } else if (valorCarro >= 90_000 && valorCarro <= 100_000){
            System.out.println("Comprar o carro");
        } else {
            System.out.println("Não comprar valor abaixo da tabela");
        }
    }
}