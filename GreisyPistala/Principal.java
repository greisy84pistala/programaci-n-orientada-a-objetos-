public class Principal {
    public static void main(String[] args) {
        //comunidad
        Comunidad comunidad1 = new Comunidad("0.1","Trebol","Barcelona");
        comunidad1.verInfo();

        //zona
        Zona zona1 = new Zona("E","Escalera","P");
        Zona zona2 = new Zona("G","Garaje","I");
        Zona zona3 = new Zona("C","Zona comun","I");

        zona1.verInfo(); zona2.verInfo(); zona3.verInfo();


        //PROPIEDAD
        Propiedad propiedad1 =new Propiedad("local","0-A","80 ","0.4","8%E","Banco Mundial  Banca");
        Propiedad propiedad2 = new Propiedad("local","0-B","90","0.5","9%E","Hercules  Seguros");
        Propiedad propiedad3 = new Propiedad("local","0-C","90","0.6","9%E","Caprabo  Alimentacion");
        Propiedad propiedad4 = new Propiedad ("piso","1-A","90","0.7","9%E  16%C","VH;2");
        Propiedad propiedad5 = new Propiedad ("piso","1-B","100","0.8","10%E 16%C" ,"VH;3");
        Propiedad propiedad6 = new Propiedad("piso","1-C","100","0.9","10%E 16%C","VNH;3");
        Propiedad propiedad7 = new Propiedad("piso","2-A","150","0.1","15%E 16%C","VH;4");
        Propiedad propiedad8 = new Propiedad("piso","2-B","150","0.2","15%E 16%C","VH;4");
        Propiedad propiedad9 = new Propiedad("piso","2-C","150","0.3","15%E 16%C","VNH;4");
        Propiedad propiedad10 = new Propiedad("plaza","P03","15","0.1","10%G","A;S");
        Propiedad propiedad11 = new Propiedad("plaza","P04","15","0.2","10%G","A;S");
        Propiedad propiedad12 = new Propiedad("plaza","P05","15","03","10%G","A;S");
        Propiedad propiedad13 = new Propiedad("plaza","P06","15","0.4","10%G","C;N");
        Propiedad propiedad14 = new Propiedad("plaza","P07","15","1.0","10%G","C;N");
        Propiedad propiedad15 = new Propiedad("plaza","P08","15","1.1","10%G","C;N");
        Propiedad propiedad16 = new Propiedad("plaza","P09","15","1.2","10%G","C;N");


        propiedad1.verInfo(); propiedad2.verInfo(); propiedad3.verInfo(); propiedad4.verInfo(); propiedad5.verInfo(); propiedad6.verInfo();
        propiedad7.verInfo(); propiedad8.verInfo(); propiedad9.verInfo(); propiedad10.verInfo(); propiedad11.verInfo(); propiedad12.verInfo();
        propiedad13.verInfo(); propiedad14.verInfo(); propiedad15.verInfo(); propiedad16.verInfo();
        ;

        //propietarios
        Propietarios propietario1 = new Propietarios("0.1","Jorge Salas","Barcelona","jsalas@uoc.edu","2-A P03");
        Propietarios propietario2 = new Propietarios("0.2","Jaime Rodriguez","Barcelona","jrodriguez@uoc.edu","2-B P04");
        Propietarios propietario3 = new Propietarios("0.3","Nestor Crespo","Barcelona","ncrespo@uoc.edu","2-C P05");
        Propietarios propietario4 = new Propietarios("0.4","Maria Gutierrez","Barcelona","mgutierrez@uoc.edu","0-A P06");
        Propietarios propietario5 = new Propietarios("0.5","Miguel Palacios","Barcelona","mpalacios@uoc.edu","20-B");
        Propietarios propietario6 = new Propietarios("0.6","Nuria Mas","Barcelona","nmas@uoc.edu","0-C");
        Propietarios propietario7 = new Propietarios("0.7","Ricardo Torres","Barcelona","rtorres@uoc.edu","1-A");
        Propietarios propietario8 = new Propietarios("0.8","Tomas Asensio","Barcelona","tasensio@uoc.edu","1-B");
        Propietarios propietario9 = new Propietarios("0.9","Enrique Alos","Barcelona","ealos@uoc.edu","1-C");
        Propietarios propietario10 = new Propietarios("1.0","Pedro Navarra","Barcelona","pnavarra@uoc.edu","P07");
        Propietarios propietario11 = new Propietarios("1.1","Sergio Briban","Barcelona","sbriban@uoc.edu","P08");
        Propietarios propietario12 = new Propietarios("1.2","Carlos Escudero","Barcelona","cescudero@uoc.edu","P09");

        propietario1.verInfo(); propietario2.verInfo(); propietario3.verInfo(); propietario4.verInfo(); propietario5.verInfo(); propietario6.verInfo();
        propietario7.verInfo(); propietario8.verInfo(); propietario9.verInfo(); propietario10.verInfo(); propietario11.verInfo(); propietario12.verInfo();


        //GASTOS

        Gastos gasto1 = new Gastos("L001","Luz","Escalera","56","E");
        Gastos gasto2 = new Gastos("L002","Luz","Garaje","36","G");
        Gastos gasto3 = new Gastos("A001","Agua","Escalera","30","E");
        Gastos gasto4 = new Gastos("A002","Agua","Zona Comu","130","C");
        Gastos gasto5 = new Gastos("AS01","Seguro ","Escalera","600","E");
        Gastos gasto6 = new Gastos("S002","Seguro","Garaje","300","G");
        Gastos gasto7 = new Gastos("S003","Seguro","Piscina","150","C");
        Gastos gasto8 = new Gastos("LI01","Limpieza","Escalera","1200","E");
        Gastos gasto9 = new Gastos("LI02","Limpieza","Zona Comun","600","C");
        Gastos gasto10 = new Gastos("REIX","Rejas","Jardin","1500","C");
        Gastos gasto11 = new Gastos("JARD","Jardinero","jardin","1500","C");
        Gastos gasto12 = new Gastos("ANTE","Antena","Comunitaria","700","C");

        gasto1.verInfo();  gasto2.verInfo();  gasto3.verInfo(); gasto4.verInfo();  gasto5.verInfo(); gasto6.verInfo();
        gasto7.verInfo();  gasto8.verInfo();  gasto9.verInfo(); gasto10.verInfo(); gasto11.verInfo(); gasto12.verInfo();

        //RESUMEN
        Resumen reusmen1 =new Resumen("0.1 Trebol","3","16","12","12");
        reusmen1.verInfo();
    }

}
