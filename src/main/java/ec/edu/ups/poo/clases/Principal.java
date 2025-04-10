import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.enums.Rol;
import ec.edu.ups.poo.enums.TipoDireccion;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {
    public static void main (String[] args) {
        Institucion institucion1 = new Institucion(101, "Universidad Técnica del Norte");
        institucion1.addDireccion("Perú", "Lima", "Miraflores", "Calle 12", "Juan Pérez", "10-15", TipoDireccion.INSTITUCION);
        institucion1.addSede("Lima");
        institucion1.addAsignacion( new Asignacion(new GregorianCalendar(2023, Calendar.MAY, 20), Rol.ESTUDIANTE));
        institucion1.addAsignacion(new Asignacion(new GregorianCalendar(2021, Calendar.NOVEMBER, 11), Rol.DOCENTE));

        Institucion institucion2 = new Institucion(402, "Universidad Nacional de San Agustín");
        institucion2.addDireccion("Perú", "Arequipa", "Yanahuara", "Av. Bolognesi", "Carlos Mendoza", "300", TipoDireccion.INSTITUCION);
        institucion2.addSede("Arequipa");
        institucion2.addAsignacion(new Asignacion(new GregorianCalendar(2021, Calendar.DECEMBER, 15), Rol.ADMINISTRADOR));
        institucion2.addAsignacion(new Asignacion(new GregorianCalendar(2024, Calendar.MARCH, 10), Rol.VISITANTE));

        Estudiante estudiante = new Estudiante("0123456789", "Laura", "García", "0998765432", "laura.garcia@email.com", "Ingeniería de Sistemas");
        estudiante.addDireccion(new Direccion("Arequipa", "Paucarpata", "10-50", "Arequipa", "Arequipa", "Perú", TipoDireccion.CASA));

        Direccion docente = new Docente("0953835631", "Josue", "Martinez", "099357447", "j.martinez@email.com", List.of("Ingeniero Industrial"), List.of("Matemáticas", "Física"));
        docente.addDirecciones(new Direccion("Ecuador", "El Oro", "Zarume", "Jose Aguilar", "Manuel Moscoso", "0289", TipoDireccion.CASA));

        Administrativo administrativo = new Administrativo("0123454R321", "Ana", "Martínez", "0998761234", "ana.martinez@email.com", List.of("Coordinadora Académica"), List.of("Gestión de programas"));
        administrativo.addDirecciones(new Direccion("Av. 28 de Julio", "Santo Domingo", "400", "Arequipa", "Arequipa", "Perú", TipoDireccion.TRABAJO));

        Visitante visitante = new Visitante("0987456123", "Carlos", "Hernández", "0994567890", "carlos.hernandez@email.com", "Admisión", new GregorianCalendar(2025, Calendar.JUNE, 12), new GregorianCalendar(2025, Calendar.JUNE, 12));
        visitante.addDirecciones(new Direccion("Av. San Martín", "Cercado", "5-12", "Arequipa", "Arequipa", "Perú", TipoDireccion.CASA));

        System.out.println(institucion1+"\n");
        System.out.println(institucion2);
    }
}
