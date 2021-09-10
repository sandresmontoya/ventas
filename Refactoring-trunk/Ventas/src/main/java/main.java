import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int precioPerro = 6000, precioHamburguesa = 10000, numeroPerros = 0, numeroHamburguesas = 0, prodSeleccion = 0, cantidadSeleccion, otroProducto = 0, precioTotal, precioTotalPerros = 0, precioTotalHamburguesas = 0;



        boolean initTrans = true;
        Scanner entradaEscaner = new Scanner(System.in);

        imprimirEnPantalla("Venta de perros y hamburguesas");



        while (initTrans) {

            imprimirEnPantalla("Seleccione producto: ");
            imprimirEnPantalla("1. Perro \n2. Hamburguesa");
            prodSeleccion = Integer.parseInt(entradaEscaner.nextLine());
            imprimirEnPantalla("Indique cantidad Seleccion: ");
            cantidadSeleccion = Integer.parseInt(entradaEscaner.nextLine());

            if (prodSeleccion == 1) {
                numeroPerros = sumar(numeroPerros, cantidadSeleccion);
            } else if (prodSeleccion == 2) {
                numeroHamburguesas = sumar(numeroHamburguesas, cantidadSeleccion);
            }else{
                break;
            }
            imprimirEnPantalla("Desea finalizar o agregar otro producto ?");
            imprimirEnPantalla("1. Agregar \n2. Finalizar");
            otroProducto = Integer.parseInt(entradaEscaner.nextLine());

            if (otroProducto > 2 && otroProducto < 1){
                break;
            }
            initTrans = continuarOperacion(otroProducto);
        }

        precioTotalHamburguesas = precioHamburguesa * numeroHamburguesas;
        precioTotalPerros = multiplicar(precioPerro, numeroPerros);
        precioTotal = sumar(precioTotalHamburguesas, precioTotalPerros);
        System.out.println("Total: " + precioTotal);
    }

        private static void imprimirEnPantalla(String texto){
            System.out.println(texto);
        }

        private static int sumar(int sumando1, int sumando2){
            return sumando1 + sumando2;
        }

        private static int multiplicar(int multiplicando, int multiplicador){
            return multiplicando * multiplicador;
        }

        private static boolean continuarOperacion(int seleccion){

            if(seleccion == 1){
                return true;
            } else{
                return false;
            }
        }

}