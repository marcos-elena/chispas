import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Set autonomo
        System.out.println("Rellena los datos del autonomo...");
        Autonomo autonomo = new Autonomo();
        autonomo.setId(1);
        System.out.println("Nombre:");
        autonomo.setName(entrada.next());
        System.out.println("Apellidos:");
        autonomo.setSurname(entrada.next());
        System.out.println("Dni:");
        autonomo.setCode(entrada.next());
        System.out.println("Direccion postal:");
        autonomo.setDireccionPostal(entrada.next());
        System.out.println("Poblacion:");
        autonomo.setPoblacion(entrada.next());
        System.out.println("Provincia:");
        autonomo.setProvincia(entrada.next());
        System.out.println("Email:");
        autonomo.setEmail(entrada.next());
        System.out.println("Telefono:");
        autonomo.setTelefono(entrada.next());

        //Muestra los datos del autonomo
        System.out.println("-------------------");
        System.out.println("DATOS DEL AUTONOMO:");
        System.out.println("ID: " + autonomo.getId());
        System.out.println("NOMBRE: " + autonomo.getName());
        System.out.println("APELLIDOS: " + autonomo.getSurname());
        System.out.println("DNI: " + autonomo.getCode());
        System.out.println("DIRECCION POSTAL: " + autonomo.getDireccionPostal());
        System.out.println("POBLACION: " + autonomo.getPoblacion());
        System.out.println("PROVINCIA: " + autonomo.getProvincia());
        System.out.println("EMAIL: " + autonomo.getEmail());
        System.out.println("TELEFONO: " + autonomo.getTelefono());
        System.out.println("-------------------");

        //Set sociedad
        System.out.println("Rellena los datos de la sociedad...");
        Sociedad sociedad = new Sociedad();
        sociedad.setId(1);
        System.out.println("Nombre:");
        sociedad.setName(entrada.next());
        System.out.println("Cif:");
        sociedad.setCode(entrada.next());
        System.out.println("Direccion postal:");
        sociedad.setDireccionPostal(entrada.next());
        System.out.println("Poblacion:");
        sociedad.setPoblacion(entrada.next());
        System.out.println("Provincia:");
        sociedad.setProvincia(entrada.next());
        System.out.println("Email:");
        sociedad.setEmail(entrada.next());
        System.out.println("Telefono:");
        sociedad.setTelefono(entrada.next());

        //Muestra los datos de la sociedad
        System.out.println("-------------------");
        System.out.println("DATOS DE LA SOCIEDAD:");
        System.out.println("ID: " + sociedad.getId());
        System.out.println("NOMBRE: " + sociedad.getName());
        System.out.println("CIF: " + sociedad.getCode());
        System.out.println("DIRECCION POSTAL: " + sociedad.getDireccionPostal());
        System.out.println("POBLACION: " + sociedad.getPoblacion());
        System.out.println("PROVINCIA: " + sociedad.getProvincia());
        System.out.println("EMAIL: " + sociedad.getEmail());
        System.out.println("TELEFONO: " + sociedad.getTelefono());
        System.out.println("-------------------");
    }
}