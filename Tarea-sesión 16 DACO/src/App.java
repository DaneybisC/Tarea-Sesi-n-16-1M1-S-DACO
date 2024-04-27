import java.util.Scanner;

public class App {
    //Nombre:Daneybis Anahelly Calero Ochoa.  No. de carnet:2024-1350U

    //Definir variables
    public static int num1;
    public static int num2;
    public static int num3;
    
    //Se utilizaron estos métodos para realizar las operaciones.
    //de la suma y las diferencias de los números menores y mayores.
    public static int sumar(int minimo1,int minimo2){
        int resultado = minimo1 + minimo2;
        return resultado;
    }

    public static int resta(int maximo1, int maximo3){
        int resultado1 = maximo1 - maximo3;
        return resultado1;
    }

    public static int resta1(int maximo2, int maximo1){
        int resultado2 = maximo2 - maximo1;
        return resultado2;
    }

    public static int sumar1(int minimo2,int minimo3){
        int resultado = minimo3 + minimo2;
        return resultado;
    }

    public static int resta2(int maximo2, int maximo1){
        int resultado2 = maximo1 - maximo2;
        return resultado2;
    }

    public static int sumar2(int minimo1,int minimo3){
        int resultado = minimo3 + minimo1;
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        //Se utilizo Scanner para leer los 3 números.
        Scanner leer = new Scanner(System.in);

        //Se utilizo el do-while para saber si los números eran distintos entre si.
        do {
            //try-catch se utilizo por si el usuario asignaba un dato que no fuera un entero.
            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }
        } while (num1 == num2 || num1 == num3 || num2 == num3); 

        //Se utiliza(Math.max o Math.min)para realizar la comparación entre dos números, si es mayor o menor.
        int maximo1 = Math.max(num1, num2);
        int maximo2 = Math.max(num1, num3);
        int maximo3 = Math.max(num2, num3);
        int minimo1 = Math.min(num1, num2);
        int minimo2 = Math.min(num1, num3);
        int minimo3 = Math.min(num2, num3);

        //Con el if-else lo utilice para realizar las comparaciones, llamar a los métodos e imprimir los resultados.
        if (maximo1 == maximo2) {
            System.out.println("El número mayor es: "+maximo1);
            System.out.println("La suma de los números más pequeños es: "+sumar(minimo1, minimo2));
            System.out.println("La diferencia de los números mayores es de: "+resta(maximo1, maximo3));
        }else{
            if (maximo2 == maximo3) {
                System.out.println("El número mayor es: "+maximo2);
                System.out.println("La suma de los números más pequeños es: "+sumar1(minimo2, minimo3));
                System.out.println("La diferencia de los números mayores es de: "+resta1(maximo2, maximo1));
            } else {
                if (maximo1 == maximo3) {
                    System.out.println("El número mayor es: "+maximo3);
                System.out.println("La suma de los números más pequeños es: "+sumar2(minimo1, minimo3));
                System.out.println("La diferencia de los números mayores es de: "+resta2(maximo2, maximo1));
                }
            }
        }
  
        leer.close();
    }
}
