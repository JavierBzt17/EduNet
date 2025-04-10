package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {

    private List<String> titulosAcademicos;
    private List<String> areasEspecializacion;

    public Docente() {
    }

    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.titulosAcademicos = titulosAcademicos;
        this.areasEspecializacion = areasEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasEspecializacion() {
        return areasEspecializacion;
    }

    public void setAreasEspecializacion(List<String> areasEspecializacion) {
        this.areasEspecializacion = areasEspecializacion;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasDeEspecializacion=" + areasEspecializacion +
                '}';
    }
}