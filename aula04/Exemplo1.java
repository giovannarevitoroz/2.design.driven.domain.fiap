package aula04;

public class Exemplo1 {
    public static void main(String[] args) {
        int a, b, result;

        try{
            a =42;
            b = 0;

            result = a/b;

            System.out.println("Resultado " + result);
        }catch (ArithmeticException ae){
            System.err.println("ERRO: Divisao por ZERO - / by zero");
            System.out.println(ae.getMessage());
        }



    }
}
