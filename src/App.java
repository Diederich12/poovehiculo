public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "Fh", 2019, 75000, 2000, 4);

        // Mostrar la informacion de cada vehiculo
        System.out.println("\nInformacion del Auto: ");
        auto.mostrarInfo();

        System.out.println("\nInformacion del Camion: ");
        camion.mostrarInfo();

        
    }


    
    
    
}
