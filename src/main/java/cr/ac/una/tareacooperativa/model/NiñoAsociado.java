package cr.ac.una.tareacooperativa.model;

/**
 * Clase objeto para los niños asociados 
 * Universidad Nacional - Programación II 2024
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class NiñoAsociado extends Cuenta{

    private int tipoCuenta;
    

    public NiñoAsociado() {
        super();
        this.tipoCuenta = 0;
    }
    
    public NiñoAsociado(String folio, String nombreCuenta, int tipoCuenta) {
        super(folio, nombreCuenta);
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombreCuenta = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombreCuenta;
    }

    @Override
    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Override
    public String getFolio() {
        return this.folio;
    }
    
    public void setTipoCuenta(int tipoCuenta){
        this.tipoCuenta = tipoCuenta;
    }
    
    public int getTipoCuenta(){
        return this.tipoCuenta;
    }
}
