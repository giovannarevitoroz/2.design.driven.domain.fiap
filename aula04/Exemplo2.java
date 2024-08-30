package aula04;

import java.util.Random;

public class Exemplo2 {
    public static void main(String[] args) {

        int a = 0,b = 0;
        float resp = 0;

        Random random = new Random();
;
        for (int i = 0; i < 100; i++) {
            try{
                a = random.nextInt();
                b = random.nextInt();

                System.out.printf("a: %d | b: %d \n", a, b);

                resp = 1234 / (a/b);

                System.out.printf("\nResposta " + resp);
            }catch (ArithmeticException ae) {
                System.err.println("ERRO - Exemplo2.main() " + 1);
            }

        }
    }
}
