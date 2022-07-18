/* O Joãozinho quer calcular e mostrar a quantidade de litros de combustível gasto 
  em uma viagem, usando um carro que faz 12 Km/L. Para isso, ele gostaria que você 
  o ajudasse através de um programa simples. Para realizar o cálculo, é necessário 
  ler o tempo gasto (em horas) e a mesma velocidade média (km/h). Desta forma, você 
  pode obter a distância e, em seguida, calcular quantos litros seriam necessários. 
  Mostre o valor com três casas decimais após o ponto.

  Entrada
  O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem 
  (em horas). A segunda é a velocidade média durante a viagem (em Km/h).

  Resultado
  Imprima quantos litros seriam necessários para fazer esta viagem, com três dígitos 
  após a vírgula. 
 */
import java.util.Scanner;

public class beecrowd_fuelspent_1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        double combustivelCarro = 12.0;
        int tempoGastoViagem = input.nextInt();
        int velocidadeMediaKM = input.nextInt();
        double litrosNecessario = (velocidadeMediaKM/combustivelCarro)*tempoGastoViagem;
    
        System.out.printf("%.3f\n", litrosNecessario);
        input.close();
    }   
}
