import java.util.Scanner;

public class lote {


    public void calcularlote(){


        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0;
        int[] numeros = new int[1000];
        int  sumaPos = 0;

        //productos en lotes
        System.out.println("Ingresar Productos ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Porducto[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        //recorrer el array para sumar por separado los números positivos
        // y los negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){
                sumaPos += numeros[i];
                pos++;
            }
        }


        //Calcular y mostrar las medias
        if (sumaPos != 0) {
            System.out.println("La cantidad de productos es: " + sumaPos);
        }

    }

}
