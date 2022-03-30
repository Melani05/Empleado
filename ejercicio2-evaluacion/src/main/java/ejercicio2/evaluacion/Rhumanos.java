package ejercicio2.evaluacion;
    import java.util.Scanner;
public class Rhumanos {


     private Scanner teclado;
    private String nombre,direccion,EdificioN;
    private int cargoD,edad;
    private double salario,salarioF,renta,AFP,ISSS;
    

    
   public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Introdusca el nombre:");
        nombre=teclado.next();
        System.out.print("Intodusca la edad:");
        edad=teclado.nextInt();
        System.out.print("Ingrese el salario bruto:");
        salario=teclado.nextDouble();
        System.out.print("Ingrese 1 si su cargo es por servicio y 2 si es permanente:");
        cargoD =teclado.nextInt();
          System.out.print("Ingrese su direccion:");
        direccion=teclado.next();
          System.out.print("Ingrese Numero de edificio ");
        EdificioN=teclado.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre:"+nombre+"\n");
        System.out.println("Edad:"+edad+"\n");
         System.out.println("direccion:"+direccion+"\n");
         System.out.println("numero de edificio :"+EdificioN );
         System.out.println("");
    }
    public void cargo() {
        if (cargoD==1) {
            renta= (salario * 0.10);
             salarioF= (salario-renta);
             System.out.println("");
            System.out.print("su cargo es por servicio y su salario final es :"+ salarioF);
             System.out.println("");
            
        } else if(cargoD==2){
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salarioF= (salario-renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" su cargo es permanente y su salario final es :"+salarioF);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        Departament objeto= new Departament();
       Rhumanos Dpersona1;
        Dpersona1=new Rhumanos();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombreE();
        objeto.getCantidadDep();
        objeto.getCantidadpisos();
        
        System.out.println("");
         
         Areac  codigo= new Areac();
         codigo.getCcomputos();
         codigo.getBiblioteca();
         codigo.getCancha();
         codigo.getLab();
         codigo.getZonaVerd();
    }
}
