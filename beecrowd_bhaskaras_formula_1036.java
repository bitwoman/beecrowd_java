import java.util.Scanner;

/* Leia 3 números de ponto flutuante. Depois, imprima as raízes da fórmula de 
 * bhaskara. Se for impossível calcular as raízes por divisão por zero ou raiz 
 * quadrada de um número negativo, apresenta a mensagem “Impossivel calcular”.
 */


public class beecrowd_bhaskaras_formula_1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double A = input.nextDouble();
        Double B = input.nextDouble();
        Double C = input.nextDouble();

        if(A == 0 || B == 0 || C == 0 ){
            System.out.println("Impossivel calcular\n");
        }else{
            Double delta = ((Math.pow(B, 2)) - 4 * A * C);
            Double sqrtDelta = Math.sqrt(delta);

            if(sqrtDelta < 0){
                System.out.println("Impossivel calcular");
            }else{
                Double R1 = ((-B + sqrtDelta)/2*A);
                Double R2 = ((-B - sqrtDelta)/2*A);

                System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
            }
        }
        input.close();
    }
}
