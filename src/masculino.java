import java.util.Calendar;


public class  masculino extends persona {

   @Override
   String toString(String nombre, String domicilio, int dni, int sexo)
   {
       String edad = calcularEdad(int dia,int mes,int año);
       return "Nombre: "+ getNombre()+"\n"+ "D.N.I: " + getDni() +"\n"+ "Sexo: " + getSexo() + "Sexo: " + getSexo()
               +"\n"+ "Edad: " + edad;
   }

    @Override
    String calcularEdad(int dia, int mes, int año) {
        int añoActual = getCal().get(Calendar.YEAR);
        int mesActual = getCal().get(Calendar.MONTH);
        int diaActual = getCal().get(Calendar.DAY_OF_MONTH);


        int resultadoDia = Math.abs(dia-diaActual);
        int resultadoMes = Math.abs(mes-mesActual);
        int resultadoAño = Math.abs(año-añoActual);


        return resultadoAño + " años, " + resultadoMes + " meses, " + resultadoDia + "dias";
    }
}
