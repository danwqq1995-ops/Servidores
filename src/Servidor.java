public class Servidor {

    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public void activar(){
        if (!activo){
            activo = true;
            servidoresActivos++;
        }
    }

    public void desactivar(){
        if (activo){
            activo = false;
            servidoresActivos--;
        }
    }

    public void mostrarInformacion(){
        System.out.println("id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion IP: " + direccionIP);
        System.out.println("Activo: " + activo);
    }

    public static int getServidores(){
        return totalServidores;
    }

    public static int getServidoresActivos(){
        return servidoresActivos;
    }


}
