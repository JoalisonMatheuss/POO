import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz: ");
    int n = in.nextInt();
    int[][] mat = new int[n][n];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        mat[i][j] = in.nextInt();
      }

    }

    System.out.println("Diagonal Principal: ");
    for(int i = 0; i < n; i++){
      System.out.print(mat[i][i] + " ");
    }

    System.out.println("\nElementos negativos: ");
    int cont = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(mat[i][j] < 0){
          cont++;
        }
      }
    }
    System.out.println(cont);

    in.close();
  }
}