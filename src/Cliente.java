public class Cliente extends Persona {

    private int edad;

    public Cliente(String rut, String nombre, int edad, int edad2) {
        super(rut, nombre, edad);
        edad = edad2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}