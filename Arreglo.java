
package arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Arreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de datos que desees:"));
        arreglo=new int[nElementos];
        System.out.println("Digite el arreglo:");
        for(int i=0; i<nElementos;i++){
            System.out.println((i+1)+"");
            arreglo[i]=entrada.nextInt();
        }
        for(int i=0;i<nElementos;i++){
            pos=i;
            aux=arreglo[i];
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos-1]=arreglo[pos-1];
                pos --;
            }
            arreglo[pos]=aux;         
        }
        System.out.print("\nOrden:\n");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+"\n");
        }
        System.out.print("");
    }
    
}
