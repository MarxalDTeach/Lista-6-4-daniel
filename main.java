import java.util.Scanner;
public class main Lista9q3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numeroUm = input.nextInt();
    int numeroDois = input.nextInt();
    int numeroTres = input.nextInt();
    int resultado = somar(numeroUm, numeroDois, numeroTres);
    System.out.println(resultado);
    }
}
public static int somar(int numeroUm,int numeroDois,int numeroTres){
    return numeroUm + numeroDois + numeroTres;

} 