public class Principal {
    public static void main(String[] args) {

        Entrada Entrada1 = new Entrada("Concierto de BEDU", 800.00);
        Entrada Entrada2 = new Entrada("Obra de Teatro BEDU", 450.50);

        Entrada1.mostrarInformacion();
        Entrada2.mostrarInformacion();

        Entrada_Record Entrada3= new Entrada_Record("Sinfonica de BEDU", 1200.00);
        Entrada3.mostrarInformacion();

    }
}
