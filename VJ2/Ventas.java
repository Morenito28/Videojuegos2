import java.util.Scanner;

public class Ventas{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        
        int numeroVideojuegos;
        Videojuego[] listaVideojuegos = new Videojuego[50];
        String Codigo, Nombre, Categoria;
        int Ventas;
        double Promedio = 0;

        System.out.println("Digite la cantidad de videojuegos: ");
        numeroVideojuegos = Scan.nextInt();

        for (int i = 0; i < numeroVideojuegos; i++){
            System.out.println("Digite el código del videojuego: ");
            Codigo = Scan.next();
            System.out.println("Digite el nombre del videojuego:  ");
            Nombre = Scan.next();
            System.out.println("Digite la categoría del videojuego: ");
            Categoria = Scan.next();
            System.out.println("Digite la cantidad de ventas del videojuego: ");
            Ventas = Scan.nextInt();

            Videojuego elVideojuego = new Videojuego();
            elVideojuego.Codigo = Codigo;
            elVideojuego.Nombre = Nombre;
            elVideojuego.Categoria = Categoria;
            elVideojuego.Ventas = Ventas;
            listaVideojuegos[i] = elVideojuego;
        }

        for (int i = 0; i < numeroVideojuegos; i++){
            int totalVentas = (listaVideojuegos[i].Ventas);
            Promedio = Promedio + totalVentas / numeroVideojuegos;
        }

        System.out.println("\nEl promedio de ventas de los videojuegos es: " + Promedio);
    }
}