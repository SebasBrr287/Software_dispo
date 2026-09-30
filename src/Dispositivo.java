public class Dispositivo {

    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " +nombre); // Muestra los demás atributos
        System.out.println("tipo: " +tipo); // Muestra los demás atributos
        System.out.println("activo: " +activo); // Muestra los demás atributos
    }

    void mostrarEstado(){

        String estado = activo?"activo":"inactivo";
        System.out.println("Nombre: "+nombre+"\n Estado: "+estado);

    }


}
