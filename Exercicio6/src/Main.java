import java.util.Scanner;
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três valores com ponto flutuante");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double areaTriangulo = (a*c)/ 2;
        double areaCirculo = 3.14159 * Math.pow(c,2);
        double areaTrapezio = (a+b) *c/2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("Triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retangulo: %.3f\n", areaRetangulo);

        scanner.close();
    }
}