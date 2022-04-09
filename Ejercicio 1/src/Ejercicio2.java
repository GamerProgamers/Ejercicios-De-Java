import java.util.Scanner;


public class Ejercicio2 {





        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int num1;
            int num2;

            System.out.println("Ingrese el primer numero: ");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo Numero: ");
            num2 = scanner.nextInt();


            int numeroMayor = (num1 < num2) ? num1 : num2;
            int NumeroMenor = (num1 > num2) ? num2 : num1;
            int numeroGanador =(NumeroMenor > numeroMayor) ? NumeroMenor : numeroMayor;
            System.out.println(numeroGanador);
        }
}
