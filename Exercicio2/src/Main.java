import java.util.Scanner;
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio,2);
        System.out.printf("Área = %.4f", area);
        scanner.close();
    }
}