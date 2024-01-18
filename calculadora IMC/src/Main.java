import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua Altura: ");
        double altura = input.nextDouble();
        System.out.print("digite o seu Peso: ");
        double peso =  input.nextDouble();
        double resultado = peso / (altura * altura);
        System.out.println("O seu IMC é " + resultado);
        input.close();
        if(resultado <= 18.5){
            System.out.println("MAGREZA");
        } else if (resultado > 18.8  && resultado <= 24.9){
            System.out.println("NORMAL");
        } else if(resultado > 24.9 && resultado <= 29.9){
            System.out.println("SOBREPESO");
        }else if(resultado > 29.9 && resultado <= 39.9){
            System.out.println("OBESIDADE");
        } else {
            System.out.println("OBESIDADE GRAVE");
        }
    }
}