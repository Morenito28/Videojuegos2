import java.util.Scanner;

public class Ventas{
    public static void main(String[] args) throws Exception{
        Scanner Scan = new Scanner(System.in);
        
        Plataforma laPlataforma = new Plataforma("910.475.254", "Steam", "Barrios Unidos");
        String Codigo, Nombre, Categoria;
        int Ventas;
        double Promedio = 0;
        
        System.out.println("Digite el número de videojuegos cortos: ");
        int numeroVideojuegos1 = Scan.nextInt();
        
        for(int i = 0; i < numeroVideojuegos1; i++){
            System.out.println("Digite el código del videojuego: ");
            Codigo = Scan.next();
            
            System.out.println("Digite el nombre del videojuego: ");
            Nombre = Scan.next();
            
            System.out.println("Digite la categoría del videojuego: ");
            Categoria = Scan.next();
            
            System.out.println("Cantidad de ventas del videojuego: ");
            Ventas = Scan.nextInt();
            
            laPlataforma.adicionarJuegoCorto(Codigo, Nombre, Categoria, Ventas);
        }
        
        
        
        System.out.println("Digite el número de videojuegos normales: ");
        int numeroVideojuegos2 = Scan.nextInt();
        
        for(int i = 0; i < numeroVideojuegos2; i++){
            System.out.println("Digite el código del videojuego: ");
            Codigo = Scan.next();
            
            System.out.println("Digite el nombre del videojuego: ");
            Nombre = Scan.next();
            
            System.out.println("Digite la categoría del videojuego: ");
            Categoria = Scan.next();
            
            System.out.println("Cantidad de ventas del videojuego: ");
            Ventas = Scan.nextInt();
            
            laPlataforma.adicionarJuegoNormal(Codigo, Nombre, Categoria, Ventas);
        }
        
        
        
        System.out.println("Digite el número de videojuegos largos: ");
        int numeroVideojuegos3 = Scan.nextInt();
        
        for(int i = 0; i < numeroVideojuegos1; i++){
            System.out.println("Digite el código del videojuego: ");
            Codigo = Scan.next();
            
            System.out.println("Digite el nombre del videojuego: ");
            Nombre = Scan.next();
            
            System.out.println("Digite la categoría del videojuego: ");
            Categoria = Scan.next();
            
            System.out.println("Cantidad de ventas del videojuego: ");
            Ventas = Scan.nextInt();
            
            laPlataforma.adicionarJuegoLargo(Codigo, Nombre, Categoria, Ventas);
        }
        
        Promedio = laPlataforma.calcularPromedioGeneral();
        System.out.println("El promedio de ventas es: " + Promedio + ".");
    }
}