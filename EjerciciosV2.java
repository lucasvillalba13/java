package d;
import javax.swing.JOptionPane;
import java.util.*;

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

//            String texto = JOptionPane.showInputDialog("cuantas ventas hiciste hoy?");
//
//            int numVentas = Integer.parseInt(texto);
//
//            int sumaVentas = 0;
//            for (int i = 0; i < numVentas; i++) {
//                texto = JOptionPane.showInputDialog("introduce el precio de la venta" + (i + 1));
//                int precioVentas = Integer.parseInt(texto);
//
//                sumaVentas += precioVentas;
//            }
//            System.out.println("vendiste un total de " +sumaVentas);

        // ejercicio 15
//            int num;
//            Scanner scanner = new Scanner(System.in);
//
//            do {
//                System.out.println("introduce un numero mayor o igual a 0");
//                num = scanner.nextInt();
//                }while (num <= 0);
//
//            System.out.println(num);

        // ejercicio 16

//        String contraseña = "olaminaxd";
//
//        final int INTENTOS = 3;
//        boolean acierto=false;
//
//        String password;
//        for (int i=0; i<3 && !acierto; i++){
//            password = JOptionPane.showInputDialog("introduce una contraseña");
//
//            // comprobamos si coincide
//            if (password.equals(contraseña)){
//                System.out.println("Bien ahi! acertaste a la contraseña");
//                acierto = true;
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("introduce un dia de la semana");
//        String diaSemana = scanner.nextLine();
//        diaSemana = diaSemana.toLowerCase();
//
//        switch (diaSemana) {
//            case ("lunes"), ("martes"), ("miercoles"), ("jueves"), ("viernes"):
//                System.out.println("Es dia laboral :(");
//                break;
//            case ("sabado"), ("domingo"):
//                System.out.println("No se trabaja :D");
//                break;
//            default:
//                System.out.println("eso no es un dia :/");
//                break;

        // ejercicion 18
            Scanner scanner = new Scanner(System.in);
            System.out.println("introduce un numero");
            int num1 = scanner.nextInt();

            System.out.println("introduce otro numero");
            int num2 = scanner.nextInt();

            for (int i = 0; i < 10; i++) {
            int numAleatorio = (int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }


        }
    }



