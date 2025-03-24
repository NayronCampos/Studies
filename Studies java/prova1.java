/*
Cláudia trabalha na OBI (Organização dos Bons Informáticos), que recentemente realizou um concurso para contratar novos funcionários.
Agora, Cláudia tem a tarefa de determinar a nota de corte para o concurso. Chamamos de nota de corte a nota mínima necessária para ser aprovado no concurso. 
Ou seja, se a nota de corte do concurso for C, então todos os participantes com uma nota maior ou igual a C serão aprovados no concurso e todos com nota menor que C serão reprovados.
Seu chefe pediu para que Cláudia aprove no mínimo K candidatos do concurso para a próxima fase, mas ela também não quer que a nota de corte seja muito baixa. 
Por isso, Cláudia decidiu que a nota de corte deverá ser a maior nota C que faz com que no mínimo K candidatos sejam aprovados.
Sua tarefa é: dados o número N de candidatos, as notas A1,A2,...,AN dos candidatos e a quantidade mínima de aprovados K, diga qual deve ser a maior nota de corte C para que pelo menos 
K candidatos sejam aprovados.

Entrada
A primeira linha da entrada contém dois inteiros, N e K, representando, respectivamente, o número de participantes e o número mínimo de candidatos que devem ser aprovados. 
A segunda linha da entrada contém N inteiros Ai, representando as notas dos participantes.

Saída
Seu programa deve imprimir uma linha contendo um único inteiro C, a nota de corte que deve ser escolhida por Cláudia.
*/
/*
Pub.in:
3 1
92 83 98

Pub.out:
98
*/

import java.util.Scanner;
import java.util.Arrays;

public class prova1{

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int n =0, k=0, c=0;
    
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] vetor = new int[n];

        for(int i=0;i<n;i++){
            vetor[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            int maior =i;
            for(int j=i+1; j<n; j++){
                if (vetor[i] < vetor[j]){
                    int tmp = vetor[maior];
                    vetor[maior]=vetor[j];
                    vetor[j]=tmp;
                }
            }
            

        }
        System.out.println(Arrays.toString(vetor));
        c = vetor[k-1];
        System.out.println(c);

        
    }
}