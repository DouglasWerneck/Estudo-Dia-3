import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = input.nextInt();
        NumberFormat valorReal = NumberFormat.getCurrencyInstance();
        String productValue = valorReal.format(valor);
        System.out.println("O valor em Real é : " + productValue);
        input.close();
    }
}