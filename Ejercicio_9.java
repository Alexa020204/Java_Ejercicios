import java.util.*;
import java.util.Arrays;
public class Ejercicio_9 {
    // Desarrollar una aplicación que posea una función que reciba un arreglo y un valor y verifique si dicho valor existe en el arreglo. Para probar su funcionamiento el usuario debe generar un arreglo de tamaño variable que contiene números al azar entre 1 y 50 e indicar el número que desea buscar en el arreglo.
    
    public static void main(String[] args) {
        int cant;
        int num;
        int alt;
        int cont =0;
        Scanner ent = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese el tamaño del arreglo: ");
        cant = Integer.parseInt(ent.nextLine());
        int[] arr = new int[cant];

        System.out.println("\n Digite el número que desea buscar");
        num = Integer.parseInt(ent.nextLine());

        for (int i = 0; i<cant; i++){
            alt = (int)(r.nextDouble()*(49)+1);
            arr[i]= alt;
            if (alt==num){
                cont++;
            }
        }
        if (cont>0){
            System.out.println(num + " Se encuentra en el arreglo");
        }
        else{
            System.out.println(num + "  No se encuentra en el arreglo");
        }

        System.out.println("El arreglo es ------ > "+ Arrays.toString(arr));  
    }
    
}
