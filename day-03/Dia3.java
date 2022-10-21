import java.util.*;

public class Dia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu Nombre: ");
        String nombreCompleto = sc.nextLine();
        List<String> separador = Arrays.asList(nombreCompleto.split(" "));
        if (separador.size() == 1) {
            System.out.println("Nombre: " + separador.get(0));

        } else if (separador.size() == 2) {
            System.out.println("Nombre: " + separador.get(0) + "\nApellido Paterno: " + separador.get(1));

        } else {
            System.out.println("Nombre: " + separador.get(0) + "\nApellido Paterno: " + separador.get(1)
                    + "\nApellido Materno: " + separador.get(2));
        }
        sc.close();
    }
}