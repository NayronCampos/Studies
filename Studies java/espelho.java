import java.util.Scanner;

public class espelho{

    public static void espelho(int x, int y){

        String resp1 = "";
        String resp2 = "";

        for(int i=x; i<=y;i++){
            resp1 += i;
        }
        for(int i=resp1.length() -1; i>=0;i--){
            resp2 += resp1.charAt(i);
        }
        
        System.out.println(resp1 + resp2);
    }
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int inicio, fim;

        while(scanner.hasNextInt()){
        inicio = scanner.nextInt();
        fim = scanner.nextInt();
        espelho(inicio, fim);
        }
    }
}