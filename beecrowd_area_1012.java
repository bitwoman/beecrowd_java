/* Faça um programa que leia três valores de ponto flutuante: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem base A e altura C.
    b) a área do círculo do raio C. (pi = 3,14159)
    c) a área do trapézio que tem A e B por base e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.

    Entrada
    O arquivo de entrada contém três valores duplos com um dígito após o ponto decimal.

    Resultado
    O arquivo de saída deve conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, 
    sempre com uma mensagem correspondente (em português) e um espaço entre os dois pontos e o valor. O valor 
    calculado deve ser apresentado com 3 dígitos após a vírgula. 
 */
import java.util.Scanner;

public class beecrowd_area_1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pi = 3.14159;

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double areaTrianguloRetangulo = (A * C)/2; //base * altura/2
        double areaCirculoRaioC = pi * (C*C); //pi * R²
        double areaTrapezio = ((A + B) * C)/2; //base maior + base menor * altura/2
        double areaQuadrado = B*B; // lado * lado
        double areaRetangulo = A*B; //base * altura

        System.out.printf("TRIANGULO: %.3f\n" +
                          "CIRCULO: %.3f\n" +
                          "TRAPEZIO: %.3f\n" +
                          "QUADRADO: %.3f\n" +
                          "RETANGULO: %.3f\n",
                          areaTrianguloRetangulo, areaCirculoRaioC, areaTrapezio, areaQuadrado, areaRetangulo);
        input.close();
    }
}
