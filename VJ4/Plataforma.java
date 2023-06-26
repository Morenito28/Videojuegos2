public class Plataforma{
    private final String NIT;
    private String nombrePlataforma;
    private String Direccion;
    private Videojuego[] Juego;
    private int numeroVideojuegos;
    
    public Plataforma(String NIT, String nombrePlataforma, String Direccion){
        if(NIT != null) this.NIT = NIT;
        else this.NIT = ""; 
        setNombrePlataforma(nombrePlataforma);
        setDireccion(Direccion);
        Juego = new Videojuego[50];
        numeroVideojuegos = 0;
    }
    
    public String getNIT(){
        return NIT;
    }
    
    public String getNombrePlataforma(){
        return nombrePlataforma;
    }
    public void setNombrePlataforma(String Plataforma){
        if(nombrePlataforma != null){
            this.nombrePlataforma = nombrePlataforma;
        }else{
            this.nombrePlataforma = "";
        }        
    }
    
    public String getDireccion(){
        return Direccion;
    }
    public void setDireccion(String Direccion){
        if(Direccion != null){
            this.Direccion = Direccion;
        }else{
            this.Direccion = "";
        }        
    }
    
    public int getNumeroVideojuegos(){
        return numeroVideojuegos;
    }
    
    public double calcularPromedioGeneral(){
        double Promedio = 0;
        for(int i = 0; i < numeroVideojuegos; i++){
            Promedio = Promedio + Juego[i].calcularVentas() / numeroVideojuegos;
        }
        return Promedio;
    }
    
    public void adicionarVideojuego(String Codigo, String Nombre, String Categoria, int Ventas){
        Videojuego V = new Videojuego(Codigo, Nombre, Categoria, Ventas);
        Juego[numeroVideojuegos] = V;
        numeroVideojuegos++;
    }
}