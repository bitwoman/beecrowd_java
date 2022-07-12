/*Leia 2 variáveis, denominadas A e B e faça a soma dessas duas variáveis, atribuindo seu resultado à variável X. 
  Imprima X como mostrado abaixo. Imprima a linha final após o resultado, caso contrário você receberá “ Erro de 
  apresentação ”.

  Entrada
  O arquivo de entrada conterá 2 números inteiros.

  Resultado
  Imprima a letra X (maiúscula) com um espaço em branco antes e depois do sinal de igual seguido do valor de X, 
  conforme exemplo a seguir.

  Obs.: afinal não se esqueça da linha final.
 */
import java.util.Scanner;

public class beecrowd_extremelybasic_1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = number1 + number2;

        System.out.println("X = " + sum);

        input.close();
    }
}
