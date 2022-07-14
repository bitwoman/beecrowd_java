/* Leia os quatro valores correspondentes aos eixos x e y de dois pontos do plano, 
   p1 (x1, y1) e p2 (x2, y2) e calcule a distância entre eles, mostrando quatro 
   casas decimais após a vírgula, conforme a fórmula :

   Distância = |/(x2-x1)²+(y2-y1)²

   Entrada
   O arquivo de entrada contém duas linhas de dados. O primeiro contém dois valores 
   duplos:  x1 y1 e o segundo também contém dois valores duplos com um dígito após 
   o ponto decimal: x2 y2 .

   Resultado
   Calcule e imprima o valor da distância usando a fórmula fornecida, com 4 dígitos 
   após o ponto decimal.
 */
import java.util.Scanner;

public class beecrowd_distancebetweentwopoints_1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
    
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distancia = (Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2));
        double raizDaDistancia = Math.sqrt(distancia);
        
        System.out.printf("%.4f\n", raizDaDistancia);
        input.close();
    }
}