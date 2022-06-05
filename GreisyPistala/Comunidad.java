public class Comunidad {
    private String identificacion;
    private String nombre;
    private String poblacion;

    public Comunidad(String identificacion, String nombre, String poblacion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getIdentificacion() { return identificacion; }

    public void setIdentificacion(String identificacion) { this.identificacion = identificacion;}

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPoblacion() { return poblacion; }

    public void setPoblacion(String poblacion) { this.poblacion = poblacion; }

    void verInfo(){
        System.out.println("COMUNIDAD");
        System.out.println("identificacion " + getIdentificacion() );
        System.out.println("nombre : " + getNombre());
        System.out.println("poblacion: " + getPoblacion() );
        System.out.println("***********************************");

    }

}
