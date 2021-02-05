package tarea4;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea4 {
public static Scanner sn = new Scanner(System.in);
public static String[][] matriz=new String[7][7];
    
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        while (!salir) {
                System.out.print("Bienvenido, usuario.\n1. Asignación de Matrices #1\n2. Asignación de Matrices #2.\n3. Asignación de Matrices #3\n4. Operación con Matriz #1\n5. Salir\n");
            try {
                System.out.print("Escribe una de las opciones.\n");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opción 1.");
                        Tarea4.asignacion1();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción 2.");
                        Tarea4.asignacion2();
                        break;
                    case 3:
                        System.out.println( "Has seleccionado la opción 3.");
                        Tarea4.asignacion3();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opción 4.");
                        Tarea4.operacion();
                        break;
                    case 5:
                        salir = true;
                        System.out.println("\nSesión finalizada.\n");
                        break;
                    default:
                        System.out.println( "Solo números entre 1 y 5. Por favor, volver a intentarlo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número. Por favor, volver a intentarlo.");
                sn.next();
            }
        }
    }
    
    public static void asignacion1(){
        int w=0;
        for (int i = 0; i < 49; i++) {
            String variable = Integer.toString(i+1);
            matriz[i/7][i%7]=variable;
        }
        
        while(w<7){
            for (int i = 0; i < 7; i++) {
                String value=String.format("%2s", matriz[i][w]);
                System.out.print(" "+value+" ");
            }
            System.out.println();
            w++;
        }
        System.out.println();
    }
    
    public static void asignacion2(){
        int cont=0;
        int y=49;
        System.out.println();
        while(cont<7){
            if (y==49) {
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y-1;
                }
                System.out.println();
            }
            if (y==42) {
                y=36;
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y+1;
                }
                System.out.println();
            }
            if (y==43) {
                y=35;
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y-1;
                }
                System.out.println();
            }
            if (y==28) {
                y=22;
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y+1;
                }
                System.out.println();
            }
            if (y==29) {
                y=21;
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y-1;
                }
                System.out.println();
            }
            if (y==14) {
                y=8;
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y+1;
                }
                System.out.println();
            }
            if (y==15) {
                y=7;
                for (int i = 0; i < 7; i++) {
                matriz[cont][i]=String.valueOf(y);
                String value=String.format("%2s", matriz[cont][i]);
                System.out.print(" "+value+" ");
                y=y-1;
                }
            }
            cont++;
        }
        System.out.println("\n");
    }
    
    public static void asignacion3(){
        int cont=0;
        int z=43;
        System.out.println();
        while(cont<7){
            for (int i = 0; i < 7; i++) {
            matriz[cont][i]=String.valueOf(z);
            String value=String.format("%2s", matriz[cont][i]);
            System.out.print(" "+value+" ");
            z=z-7;
            }
            if (z==-6) {
                z=44;
            }else if (z==-5) {
                z=45;
            }else if (z==-4) {
                z=46;
            }else if (z==-3) {
                z=47;
            }else if (z==-2) {
                z=48;
            }else if (z==-1) {
                z=49;
            }
            System.out.println();
            cont++;
        }
        System.out.println();
    }
    
    public static void operacion(){
        int fila[] = new int[7];
        int columna[] = new int[7];
        int w=0;
        for (int i = 0; i < 49; i++) {
            String variable = Integer.toString(i+1);
            matriz[i/7][i%7]=variable;
        }
        
        while(w<7){
            for (int i = 0; i < 7; i++) {
                String value=String.format("%4s", matriz[i][w]);
                System.out.print(" "+value+" ");
                fila[w]=fila[w]+Integer.valueOf(matriz[i][w]);
                columna[i]=columna[i]+Integer.valueOf(matriz[i][w]);
            }
            System.out.print("=   "+fila[w]);
            System.out.println();
            w++;
        }
        System.out.println();
        for (int i = 0; i <7; i++) {
            String value=String.format("%4s", columna[i]);
            System.out.print(" "+value+" ");
        }
        System.out.println();
        System.out.println();
    }
}
    
