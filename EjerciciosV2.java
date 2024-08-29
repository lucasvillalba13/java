package d;
import javax.swing.*;

public class EjerciciosV2 {
        public static void main(String[] args) {
/*
                // ejercicio 7

                // constante de IVA
                final double iva = 0.21;


                System.out.println("ingresa el precio del producto");
                Scanner scanner = new Scanner(System.in);
                double product = scanner.nextDouble();

                System.out.println(product + (product * iva));


                // ejercicio 8


                //while (num < 101){
                //    System.out.println(num++);
                //}

                // ejercicio 11

               int num = 1;

                while (num<=100){
                    if (num%2==0 || num%3==0){
                        System.out.println(num);
                    }
                    num++;
                }

                for (int num  = 1; num  <=100 ; num ++) {
                    if (num%2 == 0 || num%3 == 0){
                        System.out.println(num);
                    }
                }

                ejercicio 12
                Realiza una aplicación que nos pida un número de ventas a introducir,
                después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
                Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
*/

//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("ingresa el numero de ventas");
//                int numVentas = scanner.nextInt();
//
//                int sumaVentas = 0;
//
//                for (int i=0; i<numVentas;i++){
//                    System.out.println("introduce el precio de la venta "+ (i+1));
//                    int precioVenta = scanner.nextInt();
//
//                    /* sumar
//
//                    sumaVentas += precioVenta;
//                }

//                System.out.println("hoy hiciste un total de " + sumaVentas);

            // ahora con JOPane //

            String texto = JOptionPane.showInputDialog("cuantas ventas hiciste hoy?");

            int numVentas = Integer.parseInt(texto);

            int sumaVentas = 0;
            for (int i = 0; i < numVentas; i++) {
                texto = JOptionPane.showInputDialog("introduce el precio de la venta" + (i + 1));
                int precioVentas = Integer.parseInt(texto);

                sumaVentas += precioVentas;
            }
            System.out.println("vendiste un total de " +sumaVentas);

            // ejercicio 15


        }
    }

