/*Considere o seguinte algoritmo para gerar uma sequência de números. Comece com um inteiro n. Se n for par, divida por 2.
Se n for ímpar, multiplique por 3 e some 1. Repita esse processo com o novo valor de n, terminando quando n = 1.
Por exemplo, a seguinte sequência de números será gerada quando n é 22:
22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
Embora ainda não exista uma prova, os matemáticos acreditam que esse algoritmo sempre termina com n=1, para qualquer inteiro n.
Bem, para este problema aqui no Huxley, essa propriedade se mantém para qualquer inteiro menor que 1.000.000.
Para uma entrada n, o "tamanho do ciclo" de n é a quantidade de números gerados até o 1 (incluindo o próprio 1).
No exemplo acima, o "tamanho do ciclo" de 22 é 16. 
Dado dois números i e j, determine o máximo "tamanho do ciclo" dentre todos os números entre i e j, incluindo tanto i quanto j. */

import java.util.Scanner;

public class thehuxley{
    public static void main(final String[] args) {
        int X, Y, cont, f, newf, newcont, min, max;
        
        /*Definir os numeros*/
        try (Scanner num = new Scanner(System.in)){
            X = num.nextInt();
            Y = num.nextInt();
        }
        
        /*Definir quem é o maior e o menor*/
        if(Y > X){
            max = Y;
            min = X;
        }else{
            max = X;
            min = Y;
        }
        newcont = 0;

        /*Passar por todos os numeros entre i e j*/
        for(f = min; f != max; f++){
            newf = f;
            cont = 1;
            /*Calcular o numero de ciclos*/
            while(newf != 1){
                if(newf % 2 == 0){
                    newf /= 2;
                }else{
                    newf = (newf * 3) + 1;
                }
                cont ++;
            }
            
            /*Definir numero com maor ciclo*/
            if(cont > newcont){
                newcont = cont;
            }
        }
        
        System.out.printf("%d %d %d\n", X, Y, newcont);
    }
}
