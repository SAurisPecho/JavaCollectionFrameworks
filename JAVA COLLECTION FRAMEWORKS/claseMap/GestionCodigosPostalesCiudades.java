import java.util.HashMap;
import java.util.Scanner;

public class GestionCodigosPostalesCiudades {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> codigosPostales = new HashMap<>(); 

        codigosPostales.put("7000", "Eisenstadt");
        codigosPostales.put("10300", "Dusit");
        codigosPostales.put("86000", "Bang Mak");
        codigosPostales.put("83000", "Chalong");
        codigosPostales.put("83120", "Kamala");
        codigosPostales.put("83120", "Kathu");
        codigosPostales.put("11601", "San Andres");
        codigosPostales.put("11660", "Paracas");
        codigosPostales.put("11641", "Independencia");
        codigosPostales.put("11651", "Humay");

        boolean salir = false;

        while (!salir) {
            System.out.println("Menu Codigos Postales:");
            System.out.println("1. Mostrar los datos existentes");
            System.out.println("2. Ingresar una nueva ciudad");
            System.out.println("3. Buscar ciudad por código postal");
            System.out.println("4. Eliminar tres ciudades existentes");
            System.out.println("5. Actualizar la ciudad por codigo postal");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ciudades y sus códigos postales:");
                    for (HashMap.Entry<String, String> Entry : codigosPostales.entrySet()) {
                        System.out.println("Código Postal: "+Entry.getKey()+" - Ciudad: "+Entry.getValue());
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese el código postal: ");
                    String codigoPostal = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    String ciudad = scanner.nextLine();
                    codigosPostales.put(codigoPostal, ciudad);
                    System.out.println("Ciudad agregada");
                }
                case 3 -> {
                    System.out.print("Ingrese el código postal: ");
                    String codigoPostal = scanner.nextLine();
                    if (codigosPostales.containsKey(codigoPostal)) {
                        System.out.println("La ciudad asociada al código postal "+codigoPostal+" es "+codigosPostales.get(codigoPostal));
                    } else {
                        System.out.println("No se encontro ninguna ciudad con ese código postal.");
                    }
                }
                case 4 -> {
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese el código postal: ");
                        String codigoPostal = scanner.nextLine();
                        if (codigosPostales.containsKey(codigoPostal)) {
                            codigosPostales.remove(codigoPostal);
                            System.out.println("Ciudad eliminada");
                        } else {
                            System.out.println("No se encontro ninguna ciudad con ese código postal.");
                        }
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese el código postal: ");
                    String codigoPostal = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre de la ciudad: ");
                    String ciudad = scanner.nextLine();
                    if (codigosPostales.containsKey(codigoPostal)) {
                        codigosPostales.replace(codigoPostal, ciudad);
                    } else {
                        System.out.println("No se encontro ninguna ciudad con ese código postal.");
                    }
                }
                case 6 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }     
                default -> System.out.println("Opcion invalida. Intente de nuevo");
            }                                                                   
        }
    }
}
