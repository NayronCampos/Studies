import java.util.Scanner;

public class gnoms_3176{


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.nextLine();
            String[] time = new String[n/3];
            String[] name = new String[n];
            int[] age = new int[n];

            for(int i=0; i<n; i++){
                name[i] = scanner.nextLine();
                age[i] = scanner.nextInt();
                scanner.nextLine();
            }
    }
}