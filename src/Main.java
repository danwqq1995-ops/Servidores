void main() {

    Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
    Servidor s2 = new Servidor("ServidorBD", "192.168.1.21");

    System.out.println("--- SERVIDOR 1 ---");
    s1.mostrarInformacion();
    System.out.println("--- SERVIDOR 2 ---");
    s2.mostrarInformacion();


    System.out.println("---ACTIVAR---");
    s1.activar();
    s2.activar();
    s1.activar();
    System.out.println("Total de servidores: " + Servidor.getServidores());
    System.out.println("Servidores activos: " + Servidor.getServidoresActivos());


    System.out.println("--DESACTIVAR--");
    s1.desactivar();
    System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
}