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
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("introduce un numero");
//            int num1 = scanner.nextInt();
//
//            System.out.println("introduce otro numero");
//            int num2 = scanner.nextInt();
//
//            for (int i = 0; i < 10; i++) {
//            int numAleatorio = (int)Math.floor(Math.random()*(num1-num2)+num2);
//            System.out.println(numAleatorio);
//    }
//
//           int num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
//           int num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce otro numero"));
//
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = (int)Math.floor(Math.random()*(num1-num2)+num2);
//            System.out.println(randomNumber);
//        }

        //19 Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
        // Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.

//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//
//       do{
//           System.out.println("introduce un numero");
//           num = scanner.nextInt();
//       }while (num<0);int contador = 0; for (int i = num; i > 0 ; i/=10) {
//            contador++;
//       }
//
//       if (contador==1){
//           System.out.println("el numero " + num +" tiene "+contador +" cifras");
//       }else {
//           System.out.println("El numero "+ num+ " tiene "+contador+" cifras");
//       }

//        20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//        Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
//        NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introduce un numero");
//        int numero = scanner.nextInt();
//
//        if (numero <= 1){
//            System.out.println("el numero" + numero +" no es primo");
//        } else {
//            int raiz = (int)Math.sqrt(numero);
//            int contador = 0;
//
//            for (int i = raiz; i > 1; i--) {
//               if (numero % i == 0) {
//                   contador++;
//                }
//            }
//
//            System.out.println(">>" + contador);
//
//            if (contador < 1){
//                System.out.println("el numero "+ numero + " es primo");
//            } else {
//                System.out.println("el numero "+ numero + " no es primo");
//            }
//        }
//      20)
//        for (int i = 1; i <=100 ; i++) {
//            int raiz = (int)Math.sqrt(i);
//            int contador = 0;
//
//            for (int j = raiz; j > 1 ; j--) {
//                if (i % j == 0) {
//                    contador++;
//                }
//            }
//            if (contador<1) {
//                System.out.println(i);
//            }
//        }
//    }
//}
// 21)
//        String string = "La lluvia en sevilla es una maravilla";
//
//        int contador = 0;
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == 'a' ||
//                    string.charAt(i) == 'e' ||
//                    string.charAt(i) == 'i' ||
//                    string.charAt(i) == 'o' ||
//                    string.charAt(i) == 'u') {
//                    contador++;
//                    }
//        }
//        System.out.println(contador);

// 22)
//        String string = "La lluvia en sevilla es una maravilla";
//        System.out.println(string.replace('a','e'));
// 23)
//        String string = "La lluvia en Sevilla es una maravilla";
//
//        for (int i = 0; i < string.length(); i++) {
//            System.out.print((int)string.charAt(i)+ " ");
//        }
// 24)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("inserta un numero");
//        int num1 = scanner.nextInt();
//        System.out.println("inserta otro numero");
//        int num2 = scanner.nextInt();
//
//        System.out.println("inserta la operacion que quieras realizar");
//        String op = scanner.next();
//
//
//        switch (op){
//            case "+":
//                System.out.println(num1+num2);
//                break;
//            case "-":
//                System.out.println(num1-num2);
//                break;
//            case "*":
//                System.out.println(num1*num2);
//            case "/":
//                System.out.println(num1/num2);
//                break;
//            case "%":
//                System.out.println(num1%num2);
//                break;
//            case "^":
//                System.out.println(num1^num2);
//                break;
//            default:
//                System.out.println("eso no es una operacion valida");
//        }
// 25)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ingresa un numero");
//        int number = scanner.nextInt();
//
//        suma(number);
//    }
//
//    private static void suma(int number) {
//        System.out.println(number+1);

// 27)
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int counter = 0;

        while (num != -1){

            counter++;

            num = scanner.nextInt();

        }
        System.out.println("fin. pusiste un total de " + counter + "numeros");
    }
}
//        Scanner sn=new Scanner(System.in);
//        int num=sn.nextInt();
//
//        int contador=0;
//
//        //Hasta que no se introduzca -1 no se sale
//        while(num!=-1){
//
//            contador++;
//
//            num=sn.nextInt(); //Pedimos de nuevo el número
//
//        }
//
//        System.out.println("Fin, se ha introducido "+contador+" numeros");
//
//    }
//}
