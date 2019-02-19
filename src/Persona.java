/* Este codigo define la clase Persona y la clase Profesor como extension de la primera.

Un profesor es una persona dedicada a la docencia, tanto en colegios públicos como privados.

El código ha sido hecho por Carlos Hernández en mayo del 2019*/
public class Persona {
    String numeroDeTelefono;
    
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono=numeroDeTelefono;
    }
    
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono=numeroDeTelefono;
    }
}
public class Profesor extends Persona{
    String srt;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
    }
    public void printTodaLaInformacion(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
        for(Prestamo p: prestamos){
            System.out.println(p);
        }
    }
}
