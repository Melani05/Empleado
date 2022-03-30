package empleado;
import java.util.Scanner;

public class salario  {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        Empleados t = new Empleados();
        
        String nombre;
        Double sueldo;
        double HT,PH;
        
        
        System.out.println("Introdusca su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Introdusca su salario: ");
       sueldo= leer.nextDouble();
        System.out.println("Horas que trabajo en el mes: ");
        HT=leer.nextDouble();
        System.out.println("El salario por hora es: ");
        PH=leer.nextDouble();
       
       t.setNombre(nombre);
       t.setSalario(sueldo);       
       t.setHTR(HT);
       t.setPH(PH);
       
        System.out.println("Nombre del empleado: "+t.getNombre());
        System.out.println("Salario Bruto del empleado: $"+ t.salb(t));
        System.out.println("Salario Liquido: $"+t.saLQ(t));
        System.out.println("Rentencion del salario: $"+t.RNTA());
    }
     }

