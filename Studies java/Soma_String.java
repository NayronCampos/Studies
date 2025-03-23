import java.util.Scanner;


public class Soma_String{

   
    public static int soma(String x){

            int resultado = 0;
            for(int i = x.length() -1; i>=0; i--){
                resultado += x.charAt(i) -'0';
            }
            return resultado;
        }
   
   
    public static void main(String[] args){

        Scanner ler = new Scanner (System.in);
        String concatenacao = ler.nextLine();
        System.out.println(soma(concatenacao));

        ler.close();
    }
}