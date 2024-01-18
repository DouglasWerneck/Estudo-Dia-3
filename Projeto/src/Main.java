import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int valor = input.nextInt();
        if(valor < 10){
            System.out.println("Esse numero tem 1 Digito");
        } else if(valor >= 10 && valor < 100){
            System.out.println("Esse numero tem 2 Digitos ");
        } else if(valor >= 100 &&  valor < 1_000){
            System.out.println("Esse numero tem 3 Digitos");
        } else if(valor >= 1_000 &&  valor < 10_000){
            System.out.println("Esse numero tem 4 Digitos");
        } else {
            System.out.println("Esse numero tem 5 ou mais Digitos");
        }
        input.close();
    }
}