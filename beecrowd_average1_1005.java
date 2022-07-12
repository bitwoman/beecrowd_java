/* Leia os valores de dois pontos flutuantes de precisão dupla A e B, correspondentes 
 às notas de dois alunos. Após isso, calcule a média do aluno, considerando que a nota 
 A tem peso 3,5 e B tem peso 7,5. Cada nota pode ser de zero a dez, sempre com um dígito 
 após a vírgula. Não se esqueça de imprimir o final da linha após o resultado, caso 
 contrário você receberá “Erro de apresentação” . Não se esqueça do espaço antes e depois 
 do sinal de igual. 
 */
import java.util.Scanner;

public class beecrowd_average1_1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double pesoNotaA = A * 3.5;
        double pesoNotaB = B * 7.5;
        double somaPesos = 3.5 + 7.5;
        double media = (pesoNotaA + pesoNotaB)/somaPesos;
        
        System.out.printf("MEDIA = %.5f\n", media);
        input.close();
    }
}
