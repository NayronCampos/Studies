import java.util.Scanner;

public class char_maiusculo{

public static int maiusc (String x){
    int resp =0;

    for(int i=0;i<x.length();i++){
        if(x.charAt(i) >= 'A' && x.charAt(i) <= 'Z'){
            resp++;
        }

    }
    return resp;

}

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    String palavra = "";

    while(!palavra.equals("FIM")){
        palavra = scanner.nextLine();
        System.out.println(maiusc(palavra));
        
    }
    scanner.close();
    
    }


}
/* Crie um método iterativo em Java que receba como parâmetro uma string e retorne seu número de 
caracteres maiúsculos. Em seguida, teste o método anterior usando redirecionamento de entrada e saída. 
A entrada padrão é composta por várias linhas sendo que a última contém a palavra FIM. A saída 
padrão contém um número inteiro para cada linha de entrada.*/
