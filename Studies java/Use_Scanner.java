import java.util.Scanner;

public class Use_Scanner{

    public static void revers(String x){
        for(int i=x.length() - 1; i>=0; i--){
            System.out.print(x.charAt(i));
        }

    }

    public static String nowrevers(String y){
        String newpalavra = "";
        for(int i=y.length() - 1; i>=0; i--){
            newpalavra = newpalavra + y.charAt(i);
        }
        return newpalavra;

    }

public static void main(String[] args){

    Scanner ler = new Scanner (System.in);
    String palavra = ler.nextLine();
    revers(palavra);
    System.out.println(nowrevers(palavra));

    ler.close();
}

}