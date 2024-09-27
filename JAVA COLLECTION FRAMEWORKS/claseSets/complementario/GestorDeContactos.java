package complementario;

import java.util.ArrayList;
import java.util.HashSet;

public class GestorDeContactos {
    private ArrayList<Contacto> contactosArrayList;
    private HashSet<Contacto> contactosHashSet;
    
    public GestorDeContactos() {
        contactosArrayList = new ArrayList<>();
        contactosHashSet = new HashSet<>();
    }

    public void agregarContactoArrayList(Contacto obj) {
        if (!contactosArrayList.contains(obj)) {
            contactosArrayList.add(obj);
            System.out.println("Contacto agregado al ArrayList.");
        } else {
            System.out.println("El contacto ya existe en el ArrayList.");
        }
    }

    public void eliminarContactoArrayList(Contacto obj) {
        if (contactosArrayList.contains(obj)) {
            contactosArrayList.remove(obj);
            System.out.println("Contacto eliminado del ArrayList.");
        } else {
            System.out.println("El contacto no existe en el ArrayList");
        }
    }

    public void agregarContactoHashSet(Contacto obj) {
        if (contactosHashSet.add(obj)){
            System.out.println("Contacto agregado al HashSet.");
        } else {
            System.out.println("El contacto ya existe en el HashSet.");
        }
    }

    public void eliminarContactoHashSet(Contacto obj) {
        if (contactosHashSet.remove(obj)) {
            System.out.println("Contacto eliminado del HashSet.");
        } else {
            System.out.println("El contacto no existe en el HashSet");
        }
    }

    public void mostrarArrayList () {
        System.out.println("Contactos en ArrayList:");
        for (Contacto contacto : contactosArrayList) {
            System.out.println(contacto);
        }
    }

    public void mostrarHashSet () {
        System.out.println("Contactos en HashSet:");
        for (Contacto contacto : contactosHashSet) {
            System.out.println(contacto);
        }
    }
}
