/* Faça um programa que leia 3 valores inteiros e apresente o maior seguido da 
   mensagem "eh o maior". Use a seguinte fórmula:

   Entrada
   O arquivo de entrada contém 3 valores inteiros.

   Resultado
   Imprima o maior desses três valores seguido de um espaço e a mensagem “eh o maior”.
 */
import java.util.Scanner;

public class beecrowd_thegreatest_1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int maiorAB = (A + B + Math.abs(A-B))/2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB-C))/2;

        System.out.printf("%d eh o maior\n", maiorABC);
        input.close();
    }
}
