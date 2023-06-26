public class JuegosNormales{
    private final  String Codigo;
    private String Nombre;
    private String Categoria;
    private int Ventas;
    private int numeroVideojuegos;
    
    public String getCodigo(){
        return Codigo;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        if(Nombre != null) this.Nombre = Nombre;
        else this.Nombre = "";
    }
    
    public String getCategoria(){
        return Categoria;
    }
    public void setCategoria(String Categoria){
        if(Categoria != null) this.Categoria = Categoria;
        else this.Categoria = "";
    }
    
    public int getVentas(){
        return Ventas;
    }
    public void setVentas(int Ventas){
        if(Ventas >= 0) this.Ventas = Ventas;
        else this.Ventas = 0;
    }
    
    public int getnumeroVideojuegos(){
        return numeroVideojuegos;
    }
    public void setnumeroVideojuegos(int numeroVideojuegos){
        if(numeroVideojuegos >= 0) this.numeroVideojuegos = numeroVideojuegos;
        else this.numeroVideojuegos = 0;
    }
    
    JuegosNormales(String Codigo, String Nombre, String Categoria, int Ventas){
        if(Codigo != null) this.Codigo = Codigo;
        else this.Codigo = "";
        setNombre(Nombre);
        setCategoria(Categoria);
        setVentas(Ventas);
    }
    
    double calcularVentas(){
        for(int i = 0; i < numeroVideojuegos; i++){
            Ventas++;
        }
        
        return Ventas;
    }
}