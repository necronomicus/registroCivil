import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos que se le pidan pertinentes." + "\n"+
                "Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su domicilio");
        String domicilio = sc.nextLine();
        System.out.println("Ingrese D.N.I");
        int dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Sexo: 1 = femenimo, 2 = masculino, 3 = otros");
        int sexo = sc.nextInt();
        sc.nextLine();


        while(sexo > 4 || sexo < 1 )
        {
            System.out.println("Datos fuera de rango.Sexo: 1 = femenimo, 2 = masculino, 3 = otros ");
            sexo = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Nacimiento: Ingrese año de nacimiento");
        int año = sc.nextInt();
        sc.nextLine();
        System.out.println("Nacimiento: Ingrese mes de nacimiento (1 - 12)");
        int mes = sc.nextInt();
        sc.nextLine();
        while(mes > 12 || mes < 1 )
        {
            System.out.println("Datos fuera de rango.Ingrese mes de nacimiento (1 - 12)");
             mes = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Nacimiento: Ingrese mes de nacimiento (1 - 12)");
        int dia = sc.nextInt();
        sc.nextLine();
        while(dia > 31 || dia < 1 )
        {
            System.out.println("Datos fuera de rango.Ingrese día de nacimiento (1 - 12)");
             dia = sc.nextInt();
            sc.nextLine();
        }




        if(sexo == 1)
        {
            femenino fem = new femenino( nombre, domicilio, dni, sexo, dia, mes, año);
            System.out.println(fem.toString());
        }

        switch (sexo)
        {
            case 1:femenino fem = new femenino( nombre, domicilio, dni, sexo, dia, mes, año);
                System.out.println(fem.toString());
                break;
            case 2:masculino masc = new masculino( nombre, domicilio, dni, sexo, dia, mes, año);
                System.out.println(masc.toString());
                break;
        }
    }

}
