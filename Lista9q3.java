import java.util.Scanner;

public class Lista9q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite 3 numero para somar: ");
        int numeroUm = input.nextInt();
        int numeroDois = input.nextInt();
        int numeroTres = input.nextInt();
        int resultado = somar(numeroUm, numeroDois, numeroTres);
        System.out.println(resultado);
    }

    private static int somar(int numeroUm, int numeroDois, int numeroTres) {
        int resultado = numeroUm + numeroDois + numeroTres;
        return resultado;
    }
}
