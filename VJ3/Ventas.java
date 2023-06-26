import java.util.Scanner;

public class Ventas{
    public static void main(String Args[]){
        Scanner Scan = new Scanner(System.in);
        
        String Codigo, Nombre, Categoria;
        int Ventas;
        int numeroVideojuegos;
        double Promedio = 0;
        
        Videojuego[] losVideojuegos = new Videojuego[50];
        
        System.out.println("Digite la cantidad de videojuegos: ");
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
            
            Videojuego elVideojuego = new Videojuego(Codigo, Nombre, Categoria, Ventas);
            losVideojuegos[i] = elVideojuego;
        }
        
        for(int i = 0; i < numeroVideojuegos; i++){
            Promedio = Promedio + losVideojuegos[i].calcularVentas() / numeroVideojuegos;
        }
        
        System.out.println("El promedio de ventas es: " + Promedio);
    }
}