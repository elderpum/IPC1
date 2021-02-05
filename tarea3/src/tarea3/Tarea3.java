
package tarea3;
import javax.swing.JOptionPane; 
import java.util.Scanner;
import java.util.InputMismatchException;

public class Tarea3 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
                System.out.print("Bienvenido, usuario.\n1. Problema de los 4 exámenes.\n2. Árbol formado con ASCII.\n3. Salir\n");
            try {
                
                System.out.print("Escribe una de las opciones.\n");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la opción 1");
                            float suma;
                            float nota1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del primer parcial:"));
                            float nota2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial:"));
                            float nota3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial:"));
                            float nota4=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del cuarto parcial:"));
                            
                            if (nota1<nota2 && nota1<nota3 &&nota1<nota4) {
                            suma=nota2+nota3+nota4;
                            System.out.print("\nEl exámen descartado es el primero.\nLa suma de los exámenes más altos es de "+suma+"\nReiniciando Menú...\n");
                            System.out.print("\n");
                        }else if (nota2<nota1 && nota2<nota3 && nota2<nota4) {
                            suma=nota1+nota3+nota4;
                            System.out.print("\nEl exámen descartado es el segundo.\nLa suma de los exámenes más altos es de "+suma+"\nReiniciando Menú...\n");
                            System.out.print("\n");
                        }else if (nota3<nota1 && nota3<nota2 && nota3<nota4) {
                            suma=nota1+nota2+nota4;
                            System.out.print("\nEl exámen descartado es el tercero.\nLa suma de los exámenes más altos es de "+suma+"\nReiniciando Menú...\n");
                            System.out.print("\n");
                        }else if (nota4<nota1 && nota4<nota2 && nota4<nota3) {
                            suma=nota1+nota2+nota3;
                            System.out.print("\nEl exámen descartado es el cuarto.\nLa suma de los exámenes más altos es de "+suma+"\nReiniciando Menú...\n");
                            System.out.print("\n");
                        }
                            
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la opción 2");
                            int N=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de niveles que tendrá el árbol: "));
                            N=N*2-1;    
                            for(int i=0; i<N; i+=2){ 
                            for(int j=0; j<N-i ; j+=2){ 
                            System.out.print(" "); 
                            } 
                            for(int k=0; k<=i; k++){ 
                            System.out.print("*"); 
                                } 
                            System.out.println(); 
                                } 
                            for (int i = (N+1)/2; i > 0; i--) {
                            System.out.print(' ');
                        }
                            System.out.print("*\n");
                            System.out.print("\nÁrbol armado con éxito.\nReiniciando Menú...\n");
                            System.out.print("\n");
                        break;
                    case 3:
                        salir = true;
                        System.out.print("\nSesión finalizada.\n");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo números entre 1 y 3. Por favor, volver a intentarlo.");
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número. Por favor, volver a intentarlo.");
                sn.next();
            }
        }
 
    }
    } 