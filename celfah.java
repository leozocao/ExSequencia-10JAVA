import java.util.Scanner;

public class celfah {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cel, fahren;

        System.out.print("Digite um valor em Celsius: ");
        cel = teclado.nextDouble();

        fahren = (cel * 1.8) + 32;

        System.out.print("O valor digitado em Fahrenheit é: " + fahren);

        teclado.close();
    }
}