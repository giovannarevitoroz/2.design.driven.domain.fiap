package aula04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo4 {

    public static float calculaQuociente(int numerador, int denominador) throws ArithmeticException {
        return numerador/denominador;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        do{
            try {
                System.out.println("Numerador: ");
                int numerador = scanner.nextInt();

                System.out.println("Denominador: ");
                int denominador = scanner.nextInt();

                float resultado = calculaQuociente(numerador, denominador);
                System.out.println("Resultado: " + resultado);
                continua = false;

            } catch (ArithmeticException e) {
                System.err.println("Divisao por ZERO!");
            } catch (InputMismatchException e) {
                System.err.println("Nao é permitido inserir"
                        + "letras - insira números");
                scanner.next(); // limpar o buffer
            } catch (NullPointerException e) {
                System.out.println("Objeto NULO");
            } finally {
                System.out.println("Fim do bloco try-catch");
            }
        }while(continua);
        scanner.close();
    }
}
