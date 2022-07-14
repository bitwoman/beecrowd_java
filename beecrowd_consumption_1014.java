/* Calcule o consumo médio de um carro, fornecendo a distância total percorrida (em Km) e 
   o total de combustível gasto (em litros).

   Entrada
   O arquivo de entrada contém dois valores: um valor inteiro X representando a distância 
   total (em Km) e o segundo é um número de ponto flutuante Y  representando o total de 
   combustível irradiado, com um dígito após o ponto decimal.

   Resultado
   Apresente um valor que represente o consumo médio de um carro com 3 dígitos após a 
   vírgula, seguido da mensagem "km/l".
 */
import java.util.Scanner;

public class beecrowd_consumption_1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int X = input.nextInt();
        double Y = input.nextDouble();
        double consumoMedio = X/Y;

        System.out.printf("%.3f km/l\n", consumoMedio);
        input.close();
    }
}
