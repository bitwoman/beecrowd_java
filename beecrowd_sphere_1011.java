import java.util.Scanner;

/* Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
   A fórmula para calcular o volume é: (4/3) * pi * R 3 . Considere (atribua) para pi o valor 3,14159.

   Dica: Use (4/3.0) ou (4.0/3) em sua fórmula, pois algumas linguagens (incluindo C++) assumem que o 
   resultado da divisão entre dois inteiros é outro inteiro. :)

   Entrada
   A entrada contém um valor de ponto flutuante (precisão dupla).

   Resultado
   A saída deve ser uma mensagem "VOLUME" como no exemplo a seguir com um espaço antes e depois do 
   sinal igual. O valor deve ser apresentado com 3 dígitos após a vírgula.
 */



public class beecrowd_sphere_1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double R = input.nextDouble();
        double pi = 3.14159;
        double volume = (4/3.0) * pi * (R*R*R);


        System.out.printf("VOLUME = %.3f\n", volume);
        input.close();
    }
}
