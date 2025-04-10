package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;
import java.util.GregorianCalendar;

public class Asignacion {

    private GregorianCalendar fechaInicio;
    private Rol rol;
    public Asignacion(GregorianCalendar fechaInicio, Rol rol) {
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }
    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    @Override
    public String toString() {
        int año = fechaInicio.get(GregorianCalendar.YEAR);
        int mes = fechaInicio.get(GregorianCalendar.MONTH) + 1;
        int dia = fechaInicio.get(GregorianCalendar.DAY_OF_MONTH);

        return "Asignacion{" +
                "fechaInicio=" + año + "-" + mes + "-" + dia +
                ", rol=" + rol +
                '}';
    }
}