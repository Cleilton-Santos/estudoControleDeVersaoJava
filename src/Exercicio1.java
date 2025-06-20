import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int number = scanner.nextInt();
        System.out.println("Tabuada do " + number + ":");
        for(int i = 1; i <= number ; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
