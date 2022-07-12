/*
 * Leia dois valores inteiros. Após isso, calcule o produto entre eles e armazene o resultado em uma variável denominada PROD. 
 * Imprima o resultado como no exemplo abaixo. Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação” .

    Entrada
    O arquivo de entrada contém 2 números inteiros.

    Resultado
    Imprima a mensagem "PROD" e PROD conforme o exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.
 */
import java.util.Scanner;

public class beecrowd_simpleproduct_1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        input.close();

        int prod = number1 * number2;

        System.out.println("PROD = " + prod);
    }
}
