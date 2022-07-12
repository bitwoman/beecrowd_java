import java.util.Scanner;

/* A fórmula para calcular a área de uma circunferência é definida como A = π . R 2 . 
Considerando para este problema que π = 3,14159 :
Calcule a área usando a fórmula dada na descrição do problema.

Entrada
A entrada contém um valor de ponto flutuante (precisão dupla), que é a variável R .

Resultado
Apresente a mensagem "A=" seguida do valor da variável, como no exemplo abaixo, com 
quatro casas após a vírgula. Use todas as variáveis ​​de precisão dupla. Como todos os 
problemas, não se esqueça de imprimir o final de linha após o resultado, caso contrário 
você receberá "Erro de apresentação". 
 */

public class beecrowd_areaofacircle_1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n = 3.14159;
        double R = input.nextDouble();
        double A = n * (R*R);
        input.close();
        
        System.out.printf("A=%.4f", A);;
    } 
}