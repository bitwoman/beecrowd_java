/* Neste problema, a tarefa é ler o código de um produto 1, o número de unidades do produto 1, 
   o preço de uma unidade do produto 1, o código de um produto 2, o número de unidades do 
   produto 2 e o preço para uma unidade de produto 2. Após isso, calcule e mostre o valor a 
   ser pago.

   Entrada
   O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores: dois ]
   inteiros e um valor flutuante com 2 dígitos após o ponto decimal.

   Resultado
   O arquivo de saída deve ser uma mensagem como no exemplo a seguir onde "Valor a pagar" 
   significa Valor a Pagar . Lembre-se do espaço após o símbolo ":" e após o símbolo "R$". 
   O valor deve ser apresentado com 2 dígitos após o ponto.
 */
import java.util.Scanner;

public class beecrowd_simplecalculate_1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int codigoProd1, qtdeUnidadesProd1;
        double precoUnidadeProd1;

        codigoProd1 = input.nextInt();
        qtdeUnidadesProd1 = input.nextInt();
        precoUnidadeProd1 = input.nextDouble();

        int codigoProd2, qtdeUnidadesProd2;
        double precoUnidadeProd2;

        codigoProd2 = input.nextInt();
        qtdeUnidadesProd2 = input.nextInt();
        precoUnidadeProd2 = input.nextDouble();
        
        double totalPagarProd1 = qtdeUnidadesProd1 * precoUnidadeProd1;
        double totalPagarProd2 = qtdeUnidadesProd2 * precoUnidadeProd2;
        double totalPagar = totalPagarProd1 + totalPagarProd2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);
        input.close();
    }
}
