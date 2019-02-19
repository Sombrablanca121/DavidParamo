/**
 * Clase Persona y Clase Profesor que hereda de persona
 * @author Carlos Hernandez
 * @since Mayo 2019
 */
public class Persona {
    /**
     * Variable donde se introducirá el numero de telefono
     */
    String numeroDeTelefono;
    
    /**
     * Metodo Persona para llamarla a la clase
     * @param numeroDeTelefono Para el numero de telefono de la persona
     */
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono=numeroDeTelefono;
    }
    
    /**
     * Metodo get para llamar a la variable
     * @return numero de telefono de la persona
     */
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    /**
     * Para darle valor al numeo de telefono de la persona
     * @param numeroDeTelefono Numero de telefono de la persona
     */
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
