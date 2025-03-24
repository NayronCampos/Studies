/*
As placas usadas nos carros em circulação no Brasil possuem dois padrões com formatos diferentes: algumas placas estão no antigo padrão Brasileiro, enquanto outras estão no novo padrão Mercosul.

O antigo padrão Brasileiro é sempre formado por 8 caracteres:

os três primeiros caracteres são letras maiúsculas (de A a Z);
o quarto caractere é um hífen (-);
os últimos quatro caracteres são dígitos (de 0 a 9).

Por exemplo, OBI-2024 é uma placa válida no antigo padrão Brasileiro.

O novo padrão Mercosul, por sua vez, é sempre formado por 7 caracteres:
os três primeiros caracteres são letras maiúsculas;
o quarto caractere é um dígito;
o quinto caractere é uma letra maiúscula;
os últimos dois caracteres são dígitos.

Assim, OBI2P24 é uma placa válida no novo padrão Mercosul.

Há também um grande contigente de carros em situação irregular – carros com placas falsificadas que não estão nem no antigo padrão Brasileiro, nem no novo padrão Mercosul.
Por exemplo, um carro com a placa OBI-24 está em situação irregular, pois a placa não é válida em nenhum dos dois padrões.

O Departamento Nacional de Trânsito identificou que seus funcionários gastam muito tempo verificando manualmente quais placas estão em qual padrão e quais são falsificadas.

Por isso, eles pediram sua ajuda para automatizar o processo: dada uma placa formada por uma sequência de letras maiúsculas, 
dígitos e hífens, determine se a placa está no antigo padrão Brasileiro, está no novo padrão Mercosul, ou é uma placa falsificada.

Entrada
A entrada é composta de uma única linha, contendo uma sequência de caracteres representando a placa a ser analisada.

Saída
Seu programa deverá imprimir uma linha contendo um único número inteiro:

1, se a placa está no antigo padrão Brasileiro;
2, se a placa está no novo padrão Mercosul;
0, se a placa é falsificada.
*/

/*
Pub.in:
PUC-2024

Pub.out:
1
*/

/*  PUC-2024 = brasileiro 
    PUC8A78
*/

#include <stdio.h>
int main (void){
    
    int maiusc=0, meio=0, fim=0, meioMer=0 ;
    char placa[10];
    scanf("%s", placa);      

    for(int i=0; i<3;i++){
        if(placa[i] >= 'A' && placa[i] <= 'Z'){
            maiusc++;
        }
    }
    if(placa[3]=='-'){
        meio++;
    }
    for(int i=4; i<8;i++){
        if(placa[i] >= '0' && placa[i] <= '9'){
            fim++;
        }
    }

    
    if(placa[3]>='0' && placa[3]<= '9' && placa[4]>='A' && placa[4]<= 'Z' && placa[5]>='0' && placa[5]<= '9' && placa[6]>='0' && placa[6]<= '9'){
        meioMer++;
    }

    if(maiusc==3 && meio ==1 && fim==4){
        printf("1");
    }
    else if(maiusc==3 && meioMer ==1){
        printf("2");
    }
    else{
        printf("0");
    }
          

        return 0;
}