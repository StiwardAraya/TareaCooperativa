package cr.ac.una.tareacooperativa.model;

/**
 * Clase objeto para los niños funcionarios
 * Universidad Nacional - Programación II 2024
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class NiñoFuncionario extends Cuenta{
    private String rutaFoto;
    int edad;
    
    public NiñoFuncionario(){
        super();
        this.rutaFoto = "";
        this.edad = 0;
    }
    
    public NiñoFuncionario(String folio, String nombreCuenta, String rutaFoto, int edad){
        super(folio, nombreCuenta);
        this.rutaFoto = rutaFoto;
        this.edad = edad;
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
    
    public void setRutaFoto(String rutaFoto){
        this.rutaFoto = rutaFoto;
    }
    
    public String getRutaFoto(){
        return this.rutaFoto;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
}