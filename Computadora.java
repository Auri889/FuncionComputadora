public class Computadora {

    private String marca = "Auri";
    private String modelo;
    private Boolean encendida = false;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(Boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        if (!encendida) {
           encendida = true;
        }else{
            System.out.println("Encendido");
        }

    }
    public void apagar(){
        if (encendida == true ) {
            encendida = false;
        }else{
            System.out.println("Apagado");

        }
        System.out.printf("esf");
    }}

