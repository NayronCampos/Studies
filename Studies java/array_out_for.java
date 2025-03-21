import java.util.Arrays;

public class array_out_for{

    public static void main(String[] args){

        //Maneira 01 = array impresso com for.

        System.out.println("Your array:");

        String[] nomes;
        nomes = new String[]{"João", "Camila", "José"};

        for(int i=0; i<3; i++){
        System.out.println("Hey " + nomes[i]);
        }

        //Maneira 02 = array impresso metodo de import java.util.Arrays

        String[] sabores;
        sabores = new String[] {"Chocolate", "Menta", "Banana"};
        
        System.out.println("The degust is: " + Arrays.toString(sabores));
    }

}