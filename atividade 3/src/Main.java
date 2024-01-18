public class Main {

    public static void main(String[] args) {
        //priceProduct = $20
        //Comprar somente entre 10 e 15 dolares

        int priceProduct = 20;
        boolean comprar = priceProduct >= 10 && priceProduct <= 15;
        System.out.println(comprar);
    }
}