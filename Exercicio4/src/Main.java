import java.util.Scanner;
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do funcionario: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número de horas: ");
        int horas = scanner.nextInt();
        System.out.print("Digite o valor por hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        double salario = horas * valorHora;
        System.out.printf("Numero = %d \nSalario = U$ %.2f", numero, salario);

        scanner.close();

    }
}