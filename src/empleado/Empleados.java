
package empleado;
public class Empleados extends salario{

    double salario;
    double HTR;
    double PH;
    double renta;
    String nombre ;
    double Sbruto;
    double Sliquido;
    
    public Empleados() {
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHTR() {
        return HTR;
    }

    public void setHTR(double HTR) {
        this.HTR = HTR;
    }

    public double getPH() {
        return PH;
    }

    public void setPH(double PH) {
        this.PH = PH;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSbruto() {
        return Sbruto;
    }

    public void setSbruto(double Sbruto) {
        this.Sbruto = Sbruto;
    }

    public double getSliquido() {
        return Sliquido;
    }

    public void setSliquido(double Sliquido) {
        this.Sliquido = Sliquido;
    }

    public Empleados(double salario, double HTR, double PH, double renta, String nombre, double Sbruto, double Sliquido) {
        this.salario = salario;
        this.HTR = HTR;
        this.PH = PH;
        this.renta = renta;
        this.nombre = nombre;
        this.Sbruto = Sbruto;
        this.Sliquido = Sliquido;
    }
    
    public double Htrabajadas(){
        double Hext2,Hext3;
        double SalariO=0.0;
        
        if(this.HTR<=40){
            SalariO=this.HTR*this.PH;
        }else if(this.HTR>40   && this.HTR<=48){
            Hext2 = HTR - PH;
            SalariO =(40+this.HTR)+(Hext2* this.PH*2);
        }else if (this.HTR>48);{
        Hext3 = this.HTR - 48;
        SalariO = (40 * this.PH) + (8*this.PH*2)+(Hext3 * this.PH * 3);
    }
    return SalariO;
}
   public double salb(Empleados dato){
        
        double salarB;
        double salab;
        
         salarB = dato.Htrabajadas();
         
       salab=(this.salario+salarB);
         
         return salab;
         
    }

    public double RNTA(){
        double renta;
        
       renta=(this.salario*10/100);
       return renta;
        
    }
    
    public double saLQ(Empleados dato){
        double sr;
        double sb;
        double salarioLiq;
        
        salarioLiq=dato.RNTA();
        sb=dato.salb(dato);
        
        sr=sb-salarioLiq;
        return sr;
    }
}