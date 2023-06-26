import java.util.Scanner;

public class Ventas{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int numeroVideojuegos = 0, opcionMenu = 0;
        Videojuegos[] listaVideojuegos = new Videojuegos[50];
        String Codigo, Nombre, Categoria;
        int Ventas;
        double Promedio = 0;

        while (opcionMenu != 3){
            System.out.println("\nMENU");
            System.out.println();
            System.out.println("1. AGREGAR UN VIDEOJUEGO");
            System.out.println("2. CALCULAR PROMEDIO DE VENTAS");
            System.out.println("3. SALIR");
            System.out.println();
            System.out.println();
            System.out.println("Escoja una opción:");
            System.out.println();
            opcionMenu = Scan.nextInt();
            
            if (opcionMenu == 1){
                System.out.println("Digite el código del Videojuego: ");
                Codigo = Scan.next();
                System.out.println("Digite el nombre del Videojuego:  ");
                Nombre = Scan.next();
                System.out.println("Digite la categoría del Videojuego: ");
                Categoria = Scan.next();
                System.out.println("Digite la cantidad de ventas del Videojuego: ");
                Ventas = Scan.nextInt();
                
                Videojuegos elVideojuego = new Videojuegos(Codigo, Nombre, Categoria, Ventas);
                listaVideojuegos[numeroVideojuegos] = elVideojuego;
                numeroVideojuegos++;
            }
            
            else if (opcionMenu == 2){
                int totalVentas = 0;
                
                for (int i = 0; i < numeroVideojuegos; i++){
                    totalVentas += listaVideojuegos[i].Ventas;
                }
                
                Promedio = (double) totalVentas / numeroVideojuegos;
                System.out.println("\nEl Promedio de ventas de los videojuegos es: " + Promedio);
            }
        }
    }
}