import java.util.Scanner;

/* Leia três valores (variáveis ​​A, B e C), que são as notas dos três alunos. 
   Em seguida, calcule a média, considerando que a nota A tem peso 2, a nota B 
   tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 a 10,0, 
   sempre com uma casa decimal.

   Entrada
   O arquivo de entrada contém 3 valores de pontos flutuantes (duplos) com um dígito 
   após o ponto decimal.

   Resultado
   Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo a seguir, com um 
   espaço em branco antes e depois do sinal de igual.
 */


public class beecrowd_average2_1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble() * 2;
        double B = input.nextDouble() * 3;
        double C = input.nextDouble() * 5;
        double somaPesos = 2 + 3 + 5;

        double media = (A+B+C)/somaPesos;

        System.out.printf("MEDIA = %.1f\n", media);
        input.close(); 
    }
}
