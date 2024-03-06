package cr.ac.una.tareacooperativa.model;

/**
 * Clase objeto para cuenta
 * Universidad Nacional - Programación II 2024
 * @author Stiward Araya 
 * @author Justin Mendez
 */
public abstract class Cuenta {
    
    protected String folio;
    protected String nombreCuenta;
    
    public Cuenta(){
        this.folio = "";
        this.nombreCuenta = "";
    }
    
    public Cuenta(String folio, String nCuenta){
        this.folio = folio;
        this.nombreCuenta = nCuenta;
    }
    
    public abstract void setFolio(String folio);
    public abstract String getFolio();
    public abstract void setNombre(String nombreCuenta);
    public abstract String getNombre();
    
}
