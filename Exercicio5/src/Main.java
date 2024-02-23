import java.util.Scanner;
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Digite a quantidade de peças: ");
        int qtd1 = scanner.nextInt();
        System.out.print("digite o valor unitário de cada peça:");
        double valorPeca1 = scanner.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Digite a quantidade de peças: ");
        int qtd2 = scanner.nextInt();
        System.out.print("digite o valor unitário de cada peça:");
        double valorPeca2 = scanner.nextDouble();

        double valorTotal = (qtd1*valorPeca1) + (qtd2*valorPeca2);
        System.out.printf("Valor a pagar = R$ %.2f" , valorTotal);

        scanner.close();
    }
}