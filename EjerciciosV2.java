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
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        int counter = 0;
//
//        while (num != -1){
//
//            counter++;
//
//            num = scanner.nextInt();
//
//        }
//        System.out.println("fin. pusiste un total de " + counter + "numeros");
//    }
//}
//   28     //conversor de temperatura
//        Scanner termometer = new Scanner(System.in);
//
//        //definimos las variables
//        double fahrenheit;
//        double celsius;
//
//        //introducir las temperaturas
//        System.out.println("qué temperatura necesitas convertir?");
//        String temperature = termometer.nextLine();
//        String temperatureLowerCase = temperature.toLowerCase();
//        if (temperatureLowerCase.equals("celsius")){
//            System.out.println("cual es la temperatura?");
//            double temperatureCelsius = termometer.nextDouble();
//            System.out.println("la temperatura en fahrenheit es de " +((temperatureCelsius*9/5)+32) + "grados");
//        }
//        else if (temperatureLowerCase.equals("fahrenheit")){
//            System.out.println("cual es la temperatura?");
//            double temperatureFahrenheit = termometer.nextDouble();
//            System.out.println("la temperatura en celsius es de " +((temperatureFahrenheit-32)* 5/9) + "grados");
//        }
//        else System.out.println("eso no es un tipo de temperatura");
//
//    }


//        Scanner termometer = new Scanner(System.in);
//
//        // Introducir el tipo de temperatura
//        System.out.println("¿Qué temperatura necesitas convertir? (Celsius o Fahrenheit)");
//        String temperatureType = termometer.nextLine().trim().toLowerCase();
//
//        // Pedimos la temperatura
//        System.out.println("¿Cuál es la temperatura?");
//        if (termometer.hasNextDouble()) {
//            double inputTemperature = termometer.nextDouble();
//
//            double result;
//            switch (temperatureType) {
//                case "celsius":
//                    result = celsiusToFahrenheit(inputTemperature);
//                    System.out.println("La temperatura en Fahrenheit es de " + result + " grados");
//                    break;
//                case "fahrenheit":
//                    result = fahrenheitToCelsius(inputTemperature);
//                    System.out.println("La temperatura en Celsius es de " + result + " grados");
//                    break;
//                default:
//                    System.out.println("Tipo de temperatura no reconocido. Por favor ingresa 'Celsius' o 'Fahrenheit'.");
//                    break;
//            }
//        } else {
//            System.out.println("Entrada no válida. Por favor, ingresa un número válido para la temperatura.");
//        }
//
//        termometer.close();
//    }
//
//    // Método estático para convertir de Celsius a Fahrenheit
//    public static double celsiusToFahrenheit(double celsius) {
//        return celsius * 9.0 / 5.0 + 32;
//    }
//
//    // Método estático para convertir de Fahrenheit a Celsius
//    public static double fahrenheitToCelsius(double fahrenheit) {
//        return (fahrenheit - 32) * 5.0 / 9.0;
//    }
//  29       int suma = 0;
//        for (int i = 1; i < 100 ; i++) {
//            suma += i;
//        }
//        System.out.println("el resultado es " +suma);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introduce un numero");
//        int numero = scanner.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            int resultado = numero *+ i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }

//        Escribe un programa que solicite al usuario 5 números enteros, los almacene en un array, y luego imprima los números en orden inverso.
    // solicitamos los numeros
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int [10];


        System.out.println("ingresa 10 numeros enteros");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Numero " + (i + 1)+ ": ");
            numbers[i] = scanner.nextInt();
        }
        int maximo = numbers[0];
        int minimo = numbers[0];

//        System.out.println("Números en orden inverso:");
//        for (int i = numbers.length - 1; i >= 0 ; i--) {
//            System.out.println(numbers[i]);
//        }
//        int promedio = (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]) / 5;
//        System.out.println(promedio);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximo){
                maximo = numbers[i];
            } else if (numbers[i] < minimo) {
                minimo = numbers[i];
            }
        }
        System.out.println(maximo);
        System.out.println(minimo);
    }
}
