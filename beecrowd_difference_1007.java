/*
 * Leia quatro valores inteiros chamados A, B, C e D. Calcule e imprima a diferença do produto A e B pelo produto de C e D (A * B - C * D).

    Entrada
    O arquivo de entrada contém 4 valores inteiros.

    Resultado
    Imprima DIFERENCA com todas as letras maiúsculas, conforme exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.
 */

 import java.util.Scanner;

public class beecrowd_difference_1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        input.close();

        int subtracaoProdutos = (A * B - C * D);

        System.out.println("DIFERENÇA = " + subtracaoProdutos);
    }
}
