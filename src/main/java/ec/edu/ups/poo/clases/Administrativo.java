package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona {

    private List<String> listaCargos;
    private List<String> listaResponsabilidades;

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> listaCargos, List<String> listaResponsabilidades) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.listaCargos = listaCargos;
        this.listaResponsabilidades = listaResponsabilidades;
    }

    public List<String> getListaCargos() {
        return listaCargos;
    }

    public void setListaCargos(List<String> listaCargos) {
        this.listaCargos = listaCargos;
    }

    public List<String> getListaResponsabilidades() {
        return listaResponsabilidades;
    }

    public void setListaResponsabilidades(List<String> listaResponsabilidades) {
        this.listaResponsabilidades = listaResponsabilidades;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "listaCargos=" + listaCargos +
                ", listaResponsabilidades=" + listaResponsabilidades +
                '}';
    }
}