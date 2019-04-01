import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos que se le pidan pertinentes." + "\n"+
                "Ingrese su nombre: ");
        String nomrbre = sc.nextLine();
        System.out.println("Ingrese su domicilio");
        String domicilio = sc.nextLine();
        System.out.println("Ingrese D.N.I");
        int dni = sc.nextInt();
        sc.nextLine();
    }

}
