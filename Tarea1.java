
package tarea1;

import java.util.Scanner;
public class Tarea1 {

    
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("La matriz es:");
    int matriz[][] =new int[5][5];
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            if((i==0&&j<5)||(j==0&&i<5)||(j==4&&i<5)||(i==4&&j<5)){
                matriz[i][j]=0;
            }   else 
              for(i=0; i<5; i++){
                  for( j=0; j<5; j++){
              if((i==j)||i+j==4){
                  matriz[i][j]=1;
              }
              else 
                  matriz[i][j]=0;
                  System.out.print(matriz[i][j]+" ");
                  }
                  System.out.println("  ");
        }
    }
    }
    
    }}
