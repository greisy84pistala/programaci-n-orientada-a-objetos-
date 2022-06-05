public class Propietarios {

    private String codigo;
    private String nombre_propietario;
    private String poblacion;
    private String email;
    private String propiedades;

    public Propietarios(String codigo, String nombre_propietario, String poblacion, String email, String propiedades) {
        this.codigo = codigo;
        this.nombre_propietario = nombre_propietario;
        this.poblacion = poblacion;
        this.email = email;
        this.propiedades = propiedades;
    }

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre_propietario() {return nombre_propietario;}

    public void setNombre_propietario(String nombre_propietario) {this.nombre_propietario = nombre_propietario;}

    public String getPoblacion() {return poblacion;}

    public void setPoblacion(String poblacion) {this.poblacion = poblacion;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPropiedades() {return propiedades;}

    public void setPropiedades(String propiedades) {this.propiedades = propiedades;}

    void verInfo(){
        System.out.println("PROPIETARIOS");
        System.out.println("Codigo: " + getCodigo() );
        System.out.println("Nombre_propietario: " + getNombre_propietario());
        System.out.println("poblacion: " + getPoblacion() );
        System.out.println("email: " + getEmail() );
        System.out.println("propiedades: " + getPropiedades() );
        System.out.println("***********************************");

    }
}
