public class Resumen {
    private String Comunidad;
    private String numero_zonas;
    private String numero_propiedades;
    private String numero_propietarios;
    private String numero_gastos;

    public Resumen(String comunidad, String numero_zonas, String numero_propiedades, String numero_propietarios, String numero_gastos) {
        Comunidad = comunidad;
        this.numero_zonas = numero_zonas;
        this.numero_propiedades = numero_propiedades;
        this.numero_propietarios = numero_propietarios;
        this.numero_gastos = numero_gastos;
    }

    public String getComunidad() {return Comunidad;}

    public void setComunidad(String comunidad) { Comunidad = comunidad;}

    public String getNumero_zonas() { return numero_zonas;}

    public void setNumero_zonas(String numero_zonas) {this.numero_zonas = numero_zonas;}

    public String getNumero_propiedades() {return numero_propiedades;}

    public void setNumero_propiedades(String numero_propiedades) {this.numero_propiedades = numero_propiedades;}

    public String getNumero_propietarios() {return numero_propietarios;}

    public void setNumero_propietarios(String numero_propietarios) {this.numero_propietarios = numero_propietarios;}

    public String getNumero_gastos() {return numero_gastos;}

    public void setNumero_gastos(String numero_gastos) {this.numero_gastos = numero_gastos;}

    void verInfo(){
        System.out.println("***********************************");
        System.out.println("RESUMEN");
        System.out.println("Comunidad: " + getComunidad() );
        System.out.println("Numero de Zonas: " + getNumero_zonas());
        System.out.println("Numero de Propiedades:  " + getNumero_propiedades() );
        System.out.println("Numero de Propietarios: " + getNumero_propietarios() );
        System.out.println("Numero de Gastos:  " + getNumero_gastos() );
        System.out.println("***********************************");

    }
}
