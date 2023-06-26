public class Plataforma{
    private final String NIT;
    private String nombrePlataforma;
    private String Direccion;
    private JuegosCortos[] Juegos1;
    private JuegosNormales[] Juegos2;
    private JuegosLargos[] Juegos3;
    private int numeroVideojuegos1;
    private int numeroVideojuegos2;
    private int numeroVideojuegos3;
    
    public Plataforma(String NIT, String nombrePlataforma, String Direccion){
        if(NIT != null) this.NIT = NIT;
        else this.NIT = "";
        setNombrePlataforma(nombrePlataforma);
        setDireccion(Direccion);
        Juegos1 = new JuegosCortos[50];
        Juegos2 = new JuegosNormales[50];
        Juegos3 = new JuegosLargos[50];
        numeroVideojuegos1 = 0;
        numeroVideojuegos2 = 0;
        numeroVideojuegos3 = 0;
    }
    
    public String getNIT(){
        return NIT;
    }
    
    public String getNombrePlataforma(){
        return nombrePlataforma;
    }
    public void setNombrePlataforma(String nombrePlataforma){
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
    
    public int getNumeroVideojuegos1(){
        return numeroVideojuegos1;
    }
    
    public int getNumeroVideojuegos2(){
        return numeroVideojuegos2;
    }
    
    public int getNumeroVideojuegos3(){
        return numeroVideojuegos3;
    }
    
    public double calcularPromedioGeneral(){
        double Promedio = 0;
        for(int i = 0; i < numeroVideojuegos1; i++){
            Promedio = Promedio + Juegos1[i].calcularVentas() / numeroVideojuegos1;
        }
        for(int i = 0; i < numeroVideojuegos2; i++){
            Promedio = Promedio + Juegos2[i].calcularVentas() / numeroVideojuegos2;
        }
        for(int i = 0; i < numeroVideojuegos3; i++){
            Promedio = Promedio + Juegos3[i].calcularVentas() / numeroVideojuegos3;
        }
        return Promedio / 3;
    }
    
    public void adicionarJuegoCorto(String Codigo, String Nombre, String Categoria, int Ventas){
        Juegos1[numeroVideojuegos1] = new JuegosCortos(Codigo, Nombre, Categoria, Ventas);
        numeroVideojuegos1++;
    }
    
    public void adicionarJuegoNormal(String Codigo, String Nombre, String Categoria, int Ventas){
        Juegos2[numeroVideojuegos2] = new JuegosNormales(Codigo, Nombre, Categoria, Ventas);
        numeroVideojuegos2++;
    }
    
    public void adicionarJuegoLargo(String Codigo, String Nombre, String Categoria, int Ventas){
        Juegos3[numeroVideojuegos3] = new JuegosLargos(Codigo, Nombre, Categoria, Ventas);
        numeroVideojuegos3++;
    }
}