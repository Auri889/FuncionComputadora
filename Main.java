public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();

        computadora.setModelo("08");
        computadora.encender();
        computadora.encender();
        computadora.apagar();

        System.out.println("Marca: "+ computadora.getMarca());
        System.out.println("Encendida: "+ computadora.getEncendida());






    }
}