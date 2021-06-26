
import java.util.Scanner;

public class roulesMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        //USE O DEBUG PARA VER O COMPORTAMENTO DO VETOR DENTRO DE OUTRO VETOR.
        for (int i = 0; i < n; i++) {//perccore pelas colunas
            for (int j = 0; j < n; j++) {//pecorre pelas linhas com endereco das colunas EX 0.0,0.1,0.2
                matriz[i][j] = sc.nextInt();
            }
        }

        //DIAGONAL PRINCIPAL
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {//=n; matriz.length= tamanho da i
            System.out.print(matriz[i][i] + " ");//diafonal principal e formado por i=0,j=0;i=1,j=1;i=2,j=2;i=3,j=3;
            //ou seja i=j na diagonal entao pecorre pela matriz e imprima as que i=i=j;
        }

        //QUANDTOS NEGATIVOS
        System.out.println();
        int quantosNegativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {//=n matriz[i].length= (tamanho do vetro desse i)= J
                if (matriz[i][j] < 0) {//percorre e sai perguntado se o valor e menor que 0
                    quantosNegativos++;//se for, some a contagem
                }
            }
        }
        System.out.println("Numeros negativos = " + quantosNegativos);


        sc.close();
    }
}

