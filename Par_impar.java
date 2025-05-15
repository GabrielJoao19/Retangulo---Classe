import java.util.Scanner;
public class Par_impar {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int q_n = scanner.nextInt();
        int [] numeros = new int[q_n];
        int cont_impar = 0;
        int cont_par = 0;
        
        int [] n_p = new int[q_n];
        int [] n_i = new int[q_n];
        int soma = 0;
        int soma_par = n_p.length;
        int soma_pares = 0;
        int soma_impar = n_i.length;
        int soma_impares = 0;

        for (int i = 0;i<q_n;i++){
            System.out.println("Digite o numero " + (i+1) + ":");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        for (int i =0;i<q_n;i++){
            System.out.println("Numeros inseridos: " + numeros[i]);
        }

        for (int i =0;i<q_n;i++){
            if (numeros[i] %2 == 0){
                cont_par++;
                n_p[i] = numeros[i];
            }
        }
        
        for (int i =0;i<q_n;i++){
            if (numeros[i] %2 == 1){
                cont_impar++;
                n_i[i] = numeros[i];
            }
        }
        
        for (int i =0;i<soma_par;i++){
            soma_pares = soma_pares + n_p[i];
        }

        double media_par = soma_pares/soma_par;

        for (int i =0;i<soma_impar;i++){
            soma_impares = soma_impares + n_i[i];
        }

        double media_impar = soma_impares/soma_impar;

        System.out.println("Quantidade de numeros pares: " + cont_par);
        System.out.println("Quantiade de numeros impares:" + cont_impar);
        System.out.println("Media dos numeros impares: " + media_impar);
        System.out.println("Media dos numeros pares: " + media_par);
    }
}