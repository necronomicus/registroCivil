import java.util.Calendar;

import java.util.GregorianCalendar;

public abstract class persona {
    private String nombre;
    private String domicilio;
    private int dni;
    private int sexo;

    private Calendar cal = new GregorianCalendar();

    abstract String calcularEdad(int dia, int mes, int año);
    abstract  String toString(String nombre, String domicilio, int dni, int sexo);





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }


    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }
}
