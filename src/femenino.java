import java.util.Calendar;

public class femenino extends  persona {
    @Override
    public String toString()
    {

        return "Nombre: "+ getNombre()+"\n"+ "D.N.I: " + getDni() +"\n"+ "Sexo: " + toStringSexo()
                +"\n"+ "Edad: " + getEdad();
    }

    @Override
    public  String calcularEdad(int dia, int mes, int año) {
        int añoActual = getCal().get(Calendar.YEAR);
        int mesActual = getCal().get(Calendar.MONTH);
        int diaActual = getCal().get(Calendar.DAY_OF_MONTH);


        int resultadoDia = Math.abs(dia-diaActual);
        int resultadoMes = Math.abs(mes-mesActual);
        int resultadoAño = Math.abs(año-añoActual);


        return resultadoAño + " años, " + resultadoMes + " meses, " + resultadoDia + "dias";
    }

    public femenino(String nombre, String domicilio, int dni, int sexo, int dia, int mes, int año)
    {
        setNombre(nombre);
        setDomicilio(domicilio);
        setDni(dni);
        setSexo(sexo);
        setEdad(calcularEdad(getDia(),getMes(),getAño()));
    }
    @Override
    public String toStringSexo()
    {
        String r;
        switch (getSexo())
        {

            case 1: r = "femenino";
                break;
            case 2: r =   "Masculino";
                break;
            case 3: r = "Otros";
                break;
            default: return "Wat";

        }
        return r;
    }
}
