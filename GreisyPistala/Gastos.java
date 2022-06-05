public class Gastos {
    private String id_gastos;
    private String servico ;
    private String descripcion ;
    private String importe;
    private String tipo_zonal;

    public Gastos(String id_gastos, String servico, String descripcion, String importe, String tipo_zonal) {
        this.id_gastos = id_gastos;
        this.servico = servico;
        this.descripcion = descripcion;
        this.importe = importe;
        this.tipo_zonal = tipo_zonal;
    }

    public String getId_gastos() {return id_gastos;}

    public void setId_gastos(String id_gastos) {this.id_gastos = id_gastos;}

    public String getServico() {return servico;}

    public void setServico(String servico) {this.servico = servico;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getImporte() {return importe;}

    public void setImporte(String importe) {this.importe = importe;}

    public String getTipo_zonal() {return tipo_zonal;}

    public void setTipo_zonal(String tipo_zonal) {this.tipo_zonal = tipo_zonal;}

    void verInfo(){
        //GASTOS
        System.out.println("GASTOS");
        System.out.println("id_gastos"+"    "+"servico"+"        "+"descripcion "+"        "+"importe"+"        "+"tipo_zonal");
        System.out.println(id_gastos+"          "+servico+"           "+descripcion +"             "+importe+"              "+tipo_zonal);
    }

}
