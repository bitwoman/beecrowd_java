/* Imprima o número lido e a quantidade mínima de cada cédula necessária em 
   língua portuguesa, conforme o exemplo dado. Não se esqueça de imprimir o 
   final de linha após cada linha, caso contrário você receberá “Erro de apresentação” .
 */
import java.util.Scanner;

public class beecrowd_banknotes_1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int[] notas = {100, 50, 20, 10, 5,2,1};
        int qtdeNotas = 0;
        
        System.out.printf("%d\n", N);

        if(N > 0 && N < 1000000){
            for(int i=0; i<notas.length; i++){
                qtdeNotas = (N/notas[i]);
                
                System.out.printf("%d nota (s) de R$ %d,00\n", qtdeNotas, notas[i]);
                
                N = N % notas[i];
            }
        }
        input.close();
    }
}