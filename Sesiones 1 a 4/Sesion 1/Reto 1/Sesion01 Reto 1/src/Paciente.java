public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    void mostrarInformacion() {
        System.out.println("Informacion del Paciente:");
        System.out.println("Paciente" + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
