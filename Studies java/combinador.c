#include <stdio.h>

    void combinador(char *p, char *pp){

        int tam1 =0, tam2= 0, maior;
        while(p[tam1]!='\0'){
            tam1++;
        }
        while(pp[tam2]!='\0'){
            tam2++;
        }
        if(tam1>tam2){
            maior=tam1;
        }
        else{
            maior=tam2;
        }

        for(int i=0;i<maior;i++){
            if(i<tam1){
            printf("%c",p[i]);}
            if(i<tam2){
            printf("%c",pp[i]);}
        }
        printf("\n");
    }

int main (void){

    char p1[120];
    char p2[120];


    while(scanf("%s %s", p1, p2) == 2){;
    combinador(p1, p2);}

  
}