import java.util.Scanner;

public class thehuxley{

    public static void main(final String[] args) {
        int X, Y, cont, f, newf, newcont, min, max;

        try (Scanner num = new Scanner(System.in)){
            X = num.nextInt();
            Y = num.nextInt();
        }

        if(Y > X){
            max = Y;
            min = X;
        }else{
            max = X;
            min = Y;
        }
        newcont = 0;

        for(f = min; f != max; f++){
            newf = f;
            cont = 1;
            while(newf != 1){
                if(newf % 2 == 0){
                    newf /= 2;
                }else{
                    newf = (newf * 3) + 1;
                }
                cont ++;
            }

            if(cont > newcont){
                newcont = cont;
            }
        }

        System.out.printf("%d %d %d\n", X, Y, newcont);
    }
}
