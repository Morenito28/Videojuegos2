import java.util.Scanner;

public class Ventas{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        
        Plataforma laPlataforma = new Plataforma("910.475.254", "Steam", "Barrios Unidos");
        String Codigo, Nombre, Categoria;
        int numeroVideojuegos;
        int Ventas;
        double Promedio = 0;
        
        System.out.println("Digite el número de videojuegos: ");
        numeroVideojuegos = Scan.nextInt();
        
        for(int i = 0; i < numeroVideojuegos; i++){
            System.out.println("Digite el código del videojuego: ");
            Codigo = Scan.next();
            
            System.out.println("Digite el nombre del videojuego: ");
            Nombre = Scan.next();
            
            System.out.println("Digite la categoría del videojuego: ");
            Categoria = Scan.next();
            
            System.out.println("Cantidad de ventas del videojuego: ");
            Ventas = Scan.nextInt();
            
            laPlataforma.adicionarVideojuego(Codigo, Nombre, Categoria, Ventas);
        }
        
        Promedio = laPlataforma.calcularPromedioGeneral();
        System.out.println("El promedio de ventas es: " + Promedio + ".");
    }
}