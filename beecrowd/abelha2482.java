import java.util.Scanner;

public class abelha2482{


    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

    int n=0,m=0;
    
    n = scanner.nextInt();
    scanner.nextLine();
   
    String[] language = new String[n];
    String[] phrase = new String[n];
    

    for (int i=0;i<n;i++){
        language[i] = scanner.nextLine();
        phrase[i] = scanner.nextLine();

    }

    m = scanner.nextInt();
    scanner.nextLine();

    String[] name = new String[m];
    String[] languagepeople = new String[m];

    for(int i=0; i<m;i++){
        name[i] = scanner.nextLine();
        languagepeople[i] = scanner.nextLine();
        System.out.println(name[i]);

        for(int j=0;j<m;j++){
            if(languagepeople[i].equals(language[j])){
                System.out.println(phrase[j]);
                j=m;
            }
        }
    }
    }

}