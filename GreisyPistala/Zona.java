public class Zona {
    private String identificacion;
    private String nombre;
    private String tipo_reparto;

    public Zona(String identificacion, String nombre, String tipo_reparto) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipo_reparto = tipo_reparto;
    }

    public String getIdentificacion() { return identificacion; }

    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo_reparto() { return tipo_reparto; }

    public void setTipo_reparto(String tipo_reparto) { this.tipo_reparto = tipo_reparto; }


    void verInfo(){
        System.out.println("ZONA");
        System.out.println("identificacion: " + identificacion );
        System.out.println("nombre: " + nombre);
        System.out.println("tipo_reparto: " + tipo_reparto );
        System.out.println("***********************************");
    }
}
