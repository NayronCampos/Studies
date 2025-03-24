import java.util.Scanner;
import java.util.Arrays;

public class prova01{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
         int n;
         String nome[];
         int ouro[];
         int prata[];
         int bronze[];

         n = scanner.nextInt();
         scanner.nextLine();

         for(int i = 0; i<n ; i++){
            nome[i]=scanner.nextLine();
            ouro[i]=scanner.nextInt();
            prata[i]=scanner.nextInt();
            bronze[i]=scanner.nextInt();
         }
         for(int i = 0; i<n ; i++){
            System.out.println(nome[i], ouro[i], prata[i], bronze[i]);
         }




    }
}
