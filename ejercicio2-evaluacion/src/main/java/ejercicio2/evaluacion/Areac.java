package ejercicio2.evaluacion;

public class Areac {
    String CentroC,Biblio,zonaVerd,laboratorio,cancha;
public Areac(String Ccomputo, String Biblio, String zonaVerd, String lab, String cancha) {
        this.CentroC = Ccomputo;
        this.Biblio = Biblio;
        this.zonaVerd = zonaVerd;
        this.laboratorio = lab;
        this.cancha = cancha;
    }

    public Areac() {
    }

    public String getCcomputos() {
        System.out.println("l codigo de los computos es : us01");
        return CentroC;
    }

    public void setCcomputos(String Ccomputos) {
        this.CentroC = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("el codigo de la biblioteca es 567");
        return Biblio;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblio = Biblioteca;
    }

    public String getZonaVerd() {
        System.out.println("el codigo de la zona verde es v345");
        return zonaVerd;
    }

    public void setZonaVerd(String zonaVerd) {
        this.zonaVerd = zonaVerd;
    }

    public String getLab(){
        System.out.println("el codigo de laboratorio es L098");
        return laboratorio;
    }

    public void setLab(String lab) {
        this.laboratorio = lab;
    }

    public String getCancha() {
        System.out.println("el codigo de la cancha es C865");
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    
}


