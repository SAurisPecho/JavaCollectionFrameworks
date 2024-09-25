package complementario1;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Estudiante> estudiantes;

    public Registro () {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String dni, String nombre, int edad) {
        if (!validarDocumentoDni(dni)) {
            System.out.println("El documento debe contener al menos 8 digitos.");
            return;
        }
        
        if (documentoExistente(dni)) {
            System.out.println("Ya existe un estudiante registrado con el documento.");
            return;
        }

        if (!validarNombre(nombre)) {
            System.out.println("El nombre solo debe contener letras.");
            return;
        }

        if (edad < 1) {
            System.out.println("La edad debe ser positiva");
            return;
        }
        Estudiante nuevo = new Estudiante(dni, nombre, edad);
        estudiantes.add(nuevo);
        System.out.println("Estudiante agregado con exito. \nEstudiante: "+nuevo.getNombre());
    }

    private static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+");
    }

    private boolean validarDocumentoDni(String dni) {
        return dni.matches("\\d{8}");
    }

    private boolean documentoExistente (String dni) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getDni().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarEstudiante(String dni) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getDni().equalsIgnoreCase(dni)) {
                System.out.println("Estudiante eliminado: "+estudiantes.get(i).getNombre());
                estudiantes.remove(i);
                return;
            }
        }
        System.out.println("No se encontro al estudiante.");
    }

    public void listaEstudiantes(){
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en la lista");
        } else {
            System.out.println("Lista de estudiantes: ");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i+1)+". Nombre: "+estudiantes.get(i).getNombre()+" , Edad: "+estudiantes.get(i).getEdad()+" , Documento: "+estudiantes.get(i).getDni());
            }
        }   
    }

    public void buscarEstudiantePorDni (String dni) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en la lista");
        } else {
            System.out.println("Estudiante: ");
            for (int i = 0; i < estudiantes.size(); i++) {
                if (estudiantes.get(i).getDni().equals(dni)) {
                    System.out.println("Nombre: "+estudiantes.get(i).getNombre()+", Edad: "+estudiantes.get(i).getEdad());
                    return;
                }
            }
            System.out.println("No esta registrado el estudiante.");
        }
    }
}
