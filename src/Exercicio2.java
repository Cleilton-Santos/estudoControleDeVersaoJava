import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite sua altura (em metros):");
        double altura = Double.parseDouble(scanner.nextLine().replace(",","."));
        double imc= peso/ (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II(Severa)");
        }else if (imc >= 40) {
            System.out.println("Obesidade grau III(Mórbida)");
        }
        scanner.close();
    }
}