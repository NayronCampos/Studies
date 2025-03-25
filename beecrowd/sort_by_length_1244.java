/* Sample Input	Sample Output
4
Top Coder comp Wedn at midnight
one three five
I love Cpp
sj a sa df r e w f d s a v c x z sd fd

midnight Coder comp Wedn Top at
three five one
love Cpp I
sj sa df sd fd a r e w f d s a v c x z

*/

import java.util.Scanner;
import java.util.Arrays;

public class sort_by_length_1244{
    

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int n=0, k=0;
        n = scanner.nextInt();
        scanner.nextLine();
        String[] resp = new String[n];

        while(k<n){
            resp[k] = scanner.nextLine();
           
        for(int i=0;i<n;i++){
            int maior = i;
                for(int j=i+1;j<n;j++){
                    if (resp[i].length() < resp[j].length()){
                        String tmp = resp[maior];
                        resp[maior] = resp[j];
                        resp[j] = tmp;
                    }
                }
        }
         k++;
        }

        for(int i=0;i<n;i++){
        System.out.println(resp[i]);
        }

        scanner.close();

    }
}