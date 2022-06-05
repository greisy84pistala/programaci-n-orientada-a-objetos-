public class Propiedad {

    private String tipo;
    private String codigo_propiedad;
    private String metros;
    private String codigo_propietario;
    private String lista_porcentaje_zona;
    private String informacion;

    public Propiedad(String tipo, String codigo_propiedad, String metros, String codigo_propietario, String lista_porcentaje_zona, String informacion) {
        this.tipo = tipo;
        this.codigo_propiedad = codigo_propiedad;
        this.metros = metros;
        this.codigo_propietario = codigo_propietario;
        this.lista_porcentaje_zona = lista_porcentaje_zona;
        this.informacion = informacion;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getCodigo_propiedad() { return codigo_propiedad; }

    public void setCodigo_propiedad(String codigo_propiedad) { this.codigo_propiedad = codigo_propiedad; }

    public String getMetros() { return metros; }

    public void setMetros(String metros) { this.metros = metros; }

    public String getCodigo_propietario() { return codigo_propietario; }

    public void setCodigo_propietario(String codigo_propietario) { this.codigo_propietario = codigo_propietario; }

    public String getLista_porcentaje_zona() { return lista_porcentaje_zona; }

    public void setLista_porcentaje_zona(String lista_porcentaje_zona) { this.lista_porcentaje_zona = lista_porcentaje_zona; }

    public String getInformacion() { return informacion; }

    public void setInformacion(String informacion) { this.informacion = informacion; }

    void verInfo(){
        //PROPIEDAD
        System.out.println("PROPIEDAD");
        System.out.println("Tipo"+"    "+"Codigo_propiedad"+"       "+"Metros"+"      "+"Codigo_propietario"+"        "+"Lista_porcentaje_zona"+"        "+"Informacion");
        System.out.println(tipo+"          "+codigo_propiedad+"              "+metros+"                "+codigo_propietario+"                      "+lista_porcentaje_zona+"                     "+informacion);

    }



}


