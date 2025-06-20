import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //TODO:O usuario digite um numero.
        //TODO:O usuario digite um numero maior que o primeiro.
        //TODO:E o usuario escolha entre par ou impar.
        //TODO:O codigo deve informar todos os numeros pares ou impares entre o primeiro e o segundo numero em ordem decrescente incluindo os numeros digitados.
        System.out.print("Digite o primeiro número: ");
        int number = scanner.nextInt();
        while (true) {
            System.out.print("Informe o numero para verificacao: ");
            var toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um numero maior que %s\n", number);
                continue;
            }
            while (true) {
                System.out.println("Escolha entre par ou impar (p/i): ");
                char choice = scanner.next().toLowerCase().charAt(0);
                if (choice == 'p' || choice == 'i') {
                    for (int i = toVerify; i >= number; i--) {
                        if ((choice == 'p' && i % 2 == 0) || (choice == 'i' && i % 2 != 0)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 'p' para par ou 'i' para ímpar.");
                }
                
            }

            scanner.close();
        }
    }
}
