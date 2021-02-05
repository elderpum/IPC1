
package practica1;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import java.util.*;

public class Practica1 {
    
    public static int[][] datosdeprueba = new int[9][4];
    public static int[][] datosactuales = new int[9][4];
    public static Scanner sn = new Scanner(System.in);
    public static int opcion;
    public static boolean salir = false;
    public static int bodega=0;
    public static int producto=0;
    public static int ingresop=0;
    public static boolean espacio=false;
    
    public static void main(String[] args) {
            matriz1();
            matriz2();
            String user = "ADMIN";
            String password = "201700761";
            System.out.println("Bienvenido al Sistema de Manejo de Inventarios BETA 1.0");
            System.out.println("Usuario:  ");
            String EntradaDelUsuario = sn.next();
            System.out.println("Contraseña: ");
            String EntradaDeContraseña = sn.next();
            
            if (user.equals(EntradaDelUsuario) && password.equals(EntradaDeContraseña))
            {
                System.out.println("¡Has ingresado al sistema con éxito!");
                Practica1.menu();       
            }
            else{
                System.out.println("Algún dato está incorrecto. Por favor, volver a intentarlo.");
                System.exit(0);
            }     
        }
    
    public static void menu(){
        while (!salir) {
            System.out.println("Menú Principal para el manejo del sistema.");
            System.out.println("1. Datos de Prueba");
            System.out.println("2. Datos Actuales");
            System.out.println("3. Reportes");
            System.out.println("4. Salir del Sistema");
 
            try {
 
                System.out.println("Escribe una de las opciones por favor.");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #1.");
                        Practica1.datosdeprueba();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #2.");
                        Practica1.datosactuales();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #3.");
                        Practica1.reportes();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Saliendo del Sistema... Por favor no apague el equipo.");
                        JOptionPane.showMessageDialog(null, "Ejecución Finalizada. Que tenga un buen día usuario :)");
                        salir = true;
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo números entre 1 y 4. Volver a intentar.");
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número. Por favor volver a intentar.");
                sn.next();
            }
        }
    }
    public static int[][] matriz1(){
        datosdeprueba[0][0]=10;
        datosdeprueba[0][1]=5;
        datosdeprueba[0][2]=10;
        datosdeprueba[0][3]=12;
        
        datosdeprueba[1][0]=14;
        datosdeprueba[1][1]=15;
        datosdeprueba[1][2]=17;
        datosdeprueba[1][3]=0;
        
        datosdeprueba[2][0]=0;
        datosdeprueba[2][1]=7;
        datosdeprueba[2][2]=8;
        datosdeprueba[2][3]=10;
        
        datosdeprueba[3][0]=13;
        datosdeprueba[3][1]=70;
        datosdeprueba[3][2]=50;
        datosdeprueba[3][3]=32;
        
        datosdeprueba[4][0]=8;
        datosdeprueba[4][1]=22;
        datosdeprueba[4][2]=46;
        datosdeprueba[4][3]=8;
        
        datosdeprueba[5][0]=7;
        datosdeprueba[5][1]=45;
        datosdeprueba[5][2]=6;
        datosdeprueba[5][3]=78;
        
        datosdeprueba[6][0]=4;
        datosdeprueba[6][1]=4;
        datosdeprueba[6][2]=1;
        datosdeprueba[6][3]=100;
        
        datosdeprueba[7][0]=15;
        datosdeprueba[7][1]=0;
        datosdeprueba[7][2]=78;
        datosdeprueba[7][3]=78;
        
        datosdeprueba[8][0]=20;
        datosdeprueba[8][1]=7;
        datosdeprueba[8][2]=99;
        datosdeprueba[8][3]=74;
        return datosdeprueba;
    }
    
    public static void datosdeprueba(){
        int contadordebodega=11;
        System.out.println("\nVisualizando el Inventario Original que posee la empresa.\n");
        System.out.println("\t\tCUADERNOS\t\tLÁPICES\t\t\tLAPICEROS\t\tHOJAS");
        for (int i = 0; i < datosdeprueba.length; i++) {
            System.out.print("BODEGA #"+(i+contadordebodega)+":");
            for (int j = 0; j < datosdeprueba[i].length; j++) {
                System.out.print("\t"+datosdeprueba[i][j]+"\t\t");
            }
        System.out.println(" ");
        }
        Practica1.regresoalmenu();
    }
    
    public static void regresoalmenu(){
        System.out.println("¿Desea volver al Menú Principal?\n¿Si o No?");
        String decision = sn.next();
        if (decision.equalsIgnoreCase("Si")) {
            System.out.println("\nVolviendo al Menú Principal. Por favor, espere.");
            Practica1.menu();
        }else if (decision.equalsIgnoreCase("No")) {
            System.out.println("\nCancelando regreso al Menú Principal. Por favor, espere.");
            Practica1.regresoalmenu();
        }else{
            System.out.println("\nEscribir solamente 'Si' o 'No'. Volver a intentarlo.");
            sn.next();
        }
    }
    
    public static void datosactuales(){
        while (!salir) {
            System.out.println("Menú Secundario para el manejo de las Bodegas.");
            System.out.println("1. Ver el Inventario Actual.");
            System.out.println("2. Ingresar Datos.");
            System.out.println("3. Traslado de Mercaderia.");
            System.out.println("4. Salir del Menú.");
 
            try {
 
                System.out.println("Escribe una de las opciones por favor.");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #1.");
                        Practica1.subverinventario();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #2.");
                        Practica1.ingresodedatos();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #3.");
                        Practica1.subtrasladar();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Saliendo del Menú Secundario... Por favor no apague el equipo.");
                        Practica1.menu();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo números entre 1 y 4. Volver a intentar.");
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número. Por favor volver a intentar.");
                sn.next();
            }
        }
    }
    
    public static int[][] matriz2(){
        datosactuales[0][0]=10;
        datosactuales[0][1]=5;
        datosactuales[0][2]=10;
        datosactuales[0][3]=12;
        
        datosactuales[1][0]=14;
        datosactuales[1][1]=15;
        datosactuales[1][2]=17;
        datosactuales[1][3]=0;
        
        datosactuales[2][0]=0;
        datosactuales[2][1]=7;
        datosactuales[2][2]=8;
        datosactuales[2][3]=10;
        
        datosactuales[3][0]=13;
        datosactuales[3][1]=70;
        datosactuales[3][2]=50;
        datosactuales[3][3]=32;
        
        datosactuales[4][0]=8;
        datosactuales[4][1]=22;
        datosactuales[4][2]=46;
        datosactuales[4][3]=8;
        
        datosactuales[5][0]=7;
        datosactuales[5][1]=45;
        datosactuales[5][2]=6;
        datosactuales[5][3]=78;
        
        datosactuales[6][0]=4;
        datosactuales[6][1]=4;
        datosactuales[6][2]=1;
        datosactuales[6][3]=100;
        
        datosactuales[7][0]=15;
        datosactuales[7][1]=0;
        datosactuales[7][2]=78;
        datosactuales[7][3]=78;
        
        datosactuales[8][0]=20;
        datosactuales[8][1]=7;
        datosactuales[8][2]=99;
        datosactuales[8][3]=74;
        return datosactuales;
    }
    
    public static void subverinventario(){
        int contadordebodega=11;
        System.out.println("\nVisualizando el Inventario Actual que posee la empresa.\n");
        System.out.println("\t\tCUADERNOS\t\tLÁPICES\t\t\tLAPICEROS\t\tHOJAS");
        for (int i = 0; i < datosactuales.length; i++) {
            System.out.print("BODEGA #"+(i+contadordebodega)+":");
            for (int j = 0; j < datosactuales[i].length; j++) {
                System.out.print("\t"+datosactuales[i][j]+"\t\t");
            }
        System.out.println(" ");
        }
        Practica1.regresoalmenu();
    }
    
    public static void ingresodedatos(){
        do {
            System.out.println("Ingrese el nombre de la bodega (11-19)");
                try{
                    bodega=sn.nextInt();
                    if (bodega<=10) {
                        System.out.println("Error, de seguro ingresó un cero o un número negativo. Volver a intentarlo.");
                        espacio=false;
                    }else if (bodega>=20) {
                        System.out.println("La bodega que ingresó no existe. Volver a intentarlo");
                        espacio=false;
                    }else if ((char)bodega==' ') {
                        System.out.println("Error. No has ingresado ningún valor. Volver a intentarlo.");
                    }else if (bodega>10 || bodega<20) {
                        espacio=true;
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("No has ingresado un valor numérico. Volver a intentarlo.");
                    sn.next();
                }
        } while (espacio==false);
        
        System.out.println("Ingrese el nombre del producto que desea ingresar: cuadernos, lapices, lapiceros, hojas.");
        String nombreproducto = sn.next();
        if (nombreproducto.equalsIgnoreCase("cuadernos")) {
            producto=0;
        }else if (nombreproducto.equalsIgnoreCase("lapices")) {
            producto=1;
        }else if (nombreproducto.equalsIgnoreCase("lapiceros")) {
            producto=2;
        }else if (nombreproducto.equalsIgnoreCase("hojas")) {
            producto=3;
        }else{
            System.out.println("Error. Volver a intentarlo.");
            sn.next();
        }
        
        do {
            System.out.println("Ingrese la cantidad de productos que desea almacenar:");
            try{
                ingresop=sn.nextInt();
                if ((char)ingresop==' ') {
                    System.out.println("Error, no has ingresado un valor");
                    espacio=false;
                }else if (ingresop>=-100 || ingresop<=100) {
                    espacio=true;
                }
            }
            catch (InputMismatchException e){
                System.out.println("No has ingresado un valor numérico.");
                sn.next();
            }
        } while (espacio==false);
            Practica1.submodificarmatriz();
    }
        
    public static int[][] submodificarmatriz(){
        datosactuales[bodega-11][producto]=datosactuales[bodega-11][producto]+ingresop;      
        if (datosactuales[bodega-11][producto]<0 || datosactuales[bodega-11][producto]>100) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos. Proceso incompleto. Volviendo al Menú Secundario.");
            datosactuales[bodega-11][producto]=datosactuales[bodega-11][producto]-ingresop;
        }else{
            JOptionPane.showMessageDialog(null, "¡Proceso completado con éxito!");
        }
        return datosactuales;
    }

    public static void preguntaparatraslado(){
        System.out.println("¿Desea volver a realizar otro traslado?\n¿Si o No?");
        String decision = sn.next();
        if (decision.equalsIgnoreCase("Si")) {
            System.out.println("\nVolviendo a realizar el método de Traslados. Por favor, espere.");
            Practica1.subtrasladar();
        }else if (decision.equalsIgnoreCase("No")) {
            System.out.println("\nVolviendo al Menú Secundario. Por favor, espere.");
            Practica1.datosactuales();
        }else{
            System.out.println("\nEscribir solamente 'Si' o 'No'. Volver a intentarlo.");
            sn.next();
        }
    }
    
    public static void subtrasladar(){
        int bodegainicio=0;
        int bodegafinal=0;
        int articulo=0;
        int cantidad=0;
        
        System.out.println("Ingrese el nombre de la bodega inicial 'Bodega(11-19'): ");
        String bodegainicial = sn.next();   
        if (bodegainicial.equalsIgnoreCase("Bodega11")) {
            bodegainicio=0;
        }else if (bodegainicial.equalsIgnoreCase("Bodega12")) {
            bodegainicio=1;
        }else if (bodegainicial.equalsIgnoreCase("Bodega13")) {
            bodegainicio=2;
        }else if (bodegainicial.equalsIgnoreCase("Bodega14")) {
            bodegainicio=3;
        }else if (bodegainicial.equalsIgnoreCase("Bodega15")) {
            bodegainicio=4;
        }else if (bodegainicial.equalsIgnoreCase("Bodega16")) {
            bodegainicio=5;
        }else if (bodegainicial.equalsIgnoreCase("Bodega17")) {
            bodegainicio=6;
        }else if (bodegainicial.equalsIgnoreCase("Bodega18")) {
            bodegainicio=7;
        }else if (bodegainicial.equalsIgnoreCase("Bodega19")) {
            bodegainicio=8;
        }else{
            System.out.println("Error. Volver a intentarlo.");
            sn.next();
        }
        
        System.out.println("Ingrese el nombre de la bodega final 'Bodega(11-19'): ");
        String bodegadestino = sn.next();   
        if (bodegadestino.equalsIgnoreCase(bodegainicial)) {
            JOptionPane.showMessageDialog(null, "Ambas bodegas no pueden ser iguales. Volver a escribir el nombre de la bodega.");
            sn.next();
        }else if (bodegadestino.equalsIgnoreCase("Bodega11")) {
            bodegafinal=0;
        }else if (bodegadestino.equalsIgnoreCase("Bodega12")) {
            bodegafinal=1;
        }else if (bodegadestino.equalsIgnoreCase("Bodega13")) {
            bodegafinal=2;
        }else if (bodegadestino.equalsIgnoreCase("Bodega14")) {
            bodegafinal=3;
        }else if (bodegadestino.equalsIgnoreCase("Bodega15")) {
            bodegafinal=4;
        }else if (bodegadestino.equalsIgnoreCase("Bodega16")) {
            bodegafinal=5;
        }else if (bodegadestino.equalsIgnoreCase("Bodega17")) {
            bodegafinal=6;
        }else if (bodegadestino.equalsIgnoreCase("Bodega18")) {
            bodegafinal=7;
        }else if (bodegadestino.equalsIgnoreCase("Bodega19")) {
            bodegafinal=8;
        }else{
            System.out.println("Error. Volver a intentarlo.");
            sn.next();
        }
        
        System.out.println("Ingrese la etiqueta del producto para poder mover mercadería de un lugar a otro(Cuadernos, Lapices, Lapiceros, Hojas):");
        String productoseleccionado = sn.next();
        if (productoseleccionado.equalsIgnoreCase("Cuadernos")) {
            articulo=0;
        }else if (productoseleccionado.equalsIgnoreCase("Lapices")) {
            articulo=1;
        }else if (productoseleccionado.equalsIgnoreCase("Lapiceros")) {
            articulo=2;
        }else if (productoseleccionado.equalsIgnoreCase("Hojas")) {
            articulo=3;
        }else{
            JOptionPane.showMessageDialog(null, "Error al ingresar la etiqueta del producto. Volver a intentarlo.");
            sn.next();
        }
        
        System.out.println("Ahora, ingrese la cantidad que desea mover:");
        cantidad = sn.nextInt();
        
        if (datosactuales[bodegainicio][articulo]>10) {
            datosactuales[bodegafinal][articulo]=datosactuales[bodegafinal][articulo]+cantidad;
            datosactuales[bodegainicio][articulo]=datosactuales[bodegainicio][articulo]+(-1*cantidad);
            JOptionPane.showMessageDialog(null, "¡Traslado Completado con Éxito!");
            Practica1.preguntaparatraslado();
        }else{
            JOptionPane.showMessageDialog(null, "Error a la hora de trasladar. Ejecución Fallida. Volviendo al menú secundario.");
        }
    }
    
    public static void preguntaparareporte(){
         System.out.println("¿Desea volver a realizar otro reporte?\n¿Si o No?");
        String decision = sn.next();
        if (decision.equalsIgnoreCase("Si")) {
            System.out.println("\nVolviendo a realizar el proceso de Reportaje. Por favor, espere.");
            Practica1.reportes();
        }else if (decision.equalsIgnoreCase("No")) {
            System.out.println("\nVolviendo al Menú Principal. Por favor, espere.");
            Practica1.menu();
        }else{
            System.out.println("\nEscribir solamente 'Si' o 'No'. Volver a intentarlo.");
            sn.next();
        }
    }
    
    public static void reportes(){
        int contadordebodega=11;
        System.out.println("\nVisualizando el Inventario Actual que posee la empresa.\n");
        System.out.println("\t\tCUADERNOS\t\tLÁPICES\t\t\tLAPICEROS\t\tHOJAS");
        for (int i = 0; i < datosactuales.length; i++) {
            System.out.print("BODEGA #"+(i+contadordebodega)+":");
            for (int j = 0; j < datosactuales[i].length; j++) {
                System.out.print("\t"+datosactuales[i][j]+"\t\t");
            }
        System.out.println(" ");
        }
        while (!salir) {
            System.out.println("Submenú de Reportes que maneja la empresa.");
            System.out.println("1. Bodega con menor cantidad de todos los productos.");
            System.out.println("2. Bodega con mayor cantidad de todos los productos.");
            System.out.println("3. Bodega con menor cantidad, separados por cada artículo.");
            System.out.println("4. Bodega con mayor cantidad, separados por cada artículo.");
            System.out.println("5. Promedio de artículos por bodega.");
            System.out.println("6. Mediana de unidades por artículo.");
            System.out.println("7. Mode de unidades por artículo.");
            System.out.println("8. Gráfico de distribución de artículos.");
            System.out.println("9. Salir al Menú Principal.");
            try {
 
                System.out.println("Escribe una de las opciones por favor.");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #1.");
                        Practica1.menortotal();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #2.");
                        Practica1.mayortotal();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #3.");
                        Practica1.menorproducto();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #4.");
                        Practica1.mayorproducto();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #5.");
                        Practica1.promediobodega();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #6.");
                        Practica1.medianacuaderno();    
                        Practica1.medianalapiz();  
                        Practica1.medianalapicero();  
                        Practica1.medianahoja();  
                        Practica1.preguntaparareporte();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #7.");
                        JOptionPane.showMessageDialog(null, "En mantenimiento. Esperar a que el desarrollador termine esta fase.");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la Opción #8.");
                        JOptionPane.showMessageDialog(null, "En mantenimiento. Esperar a que el desarrollador termine esta fase.");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Saliendo del Submenú de Reportes, volviendo al Menú Principal... Por favor no apague el equipo.");
                        Practica1.menu();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo números entre 1 y 8. Volver a intentar.");
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número. Por favor volver a intentar.");
                sn.next();
            }
        }
    }
         public static int[] bodegastotales = new int[9];
         public static double bodega11; public static double bodega12; public static double bodega13; public static double bodega14; public static double bodega15; public static double bodega16; public static double bodega17; public static double bodega18; public static double bodega19;
    public static void menortotal(){
         bodega11=datosactuales[0][0]+datosactuales[0][1]+datosactuales[0][2]+datosactuales[0][3];
         bodega12=datosactuales[1][0]+datosactuales[1][1] +datosactuales[1][2]+datosactuales[1][3];
         bodega13=datosactuales[2][0]+datosactuales[2][1]+datosactuales[2][2]+datosactuales[2][3];
         bodega14=datosactuales[3][0]+datosactuales[3][1]+datosactuales[3][2]+datosactuales[3][3];
         bodega15=datosactuales[4][0]+datosactuales[4][1]+datosactuales[4][2]+datosactuales[4][3];
         bodega16=datosactuales[5][0]+datosactuales[5][1]+datosactuales[5][2]+datosactuales[5][3];
         bodega17=datosactuales[6][0]+datosactuales[6][1]+datosactuales[6][2]+datosactuales[6][3];
         bodega18=datosactuales[7][0]+datosactuales[7][1]+datosactuales[7][2]+datosactuales[7][3];
         bodega19=datosactuales[8][0]+datosactuales[8][1]+datosactuales[8][2]+datosactuales[8][3];
         System.out.println("La bodega con menor cantidad de datos en total es:");
         if (bodega11<bodega12 && bodega11<bodega13 && bodega11<bodega14 && bodega11<bodega15 && bodega11<bodega16 && bodega11<bodega17 && bodega11< bodega18 && bodega11<bodega19) {
             System.out.println("La bodega #11 tiene un total de productos de: "+bodega11);
        }else if (bodega12<bodega11 && bodega12<bodega13 && bodega12<bodega14 && bodega12<bodega15 && bodega12<bodega16 && bodega12<bodega17 && bodega12< bodega18 && bodega12<bodega19) {
             System.out.println("La bodega #12 tiene un total de productos de: "+bodega12);
        }else if (bodega13<bodega11 && bodega13<bodega12 && bodega13<bodega14 && bodega13<bodega15 && bodega13<bodega16 && bodega13<bodega17 && bodega13< bodega18 && bodega13<bodega19) {
             System.out.println("La bodega #13 tiene un total de productos de: "+bodega13);
        }else if (bodega14<bodega11 && bodega14<bodega12 && bodega14<bodega13 && bodega14<bodega15 && bodega14<bodega16 && bodega14<bodega17 && bodega14< bodega18 && bodega14<bodega19) {
             System.out.println("La bodega #14 tiene un total de productos de: "+bodega14);
        }else if (bodega15<bodega11 && bodega15<bodega12 && bodega15<bodega13 && bodega15<bodega14 && bodega15<bodega16 && bodega15<bodega17 && bodega15< bodega18 && bodega15<bodega19) {
             System.out.println("La bodega #15 tiene un total de productos de: "+bodega15);
        }else if (bodega16<bodega11 && bodega16<bodega12 && bodega16<bodega13 && bodega16<bodega14 && bodega16<bodega15 && bodega16<bodega17 && bodega16< bodega18 && bodega16<bodega19) {
              System.out.println("La bodega #16 tiene un total de productos de: "+bodega16);
        }else if (bodega17<bodega11 && bodega17<bodega12 && bodega17<bodega13 && bodega17<bodega14 && bodega17<bodega15 && bodega17<bodega16 && bodega17< bodega18 && bodega17<bodega19) {
              System.out.println("La bodega #17 tiene un total de productos de: "+bodega17);
        }else if (bodega18<bodega11 && bodega18<bodega12 && bodega18<bodega13 && bodega18<bodega14 && bodega18<bodega15 && bodega18<bodega16 && bodega18< bodega17 && bodega18<bodega19) {
              System.out.println("La bodega #18 tiene un total de productos de: "+bodega18);
        }else if (bodega19<bodega11 && bodega19<bodega12 && bodega19<bodega13 && bodega19<bodega14 && bodega19<bodega15 && bodega19<bodega16 && bodega19< bodega17 && bodega19<bodega18) {
              System.out.println("La bodega #19 tiene un total de productos de: "+bodega19);
        }
        Practica1.preguntaparareporte();
    }
    
    public static void mayortotal(){
         bodega11=datosactuales[0][0]+datosactuales[0][1]+datosactuales[0][2]+datosactuales[0][3];
         bodega12=datosactuales[1][0]+datosactuales[1][1]+datosactuales[1][2]+datosactuales[1][3];
         bodega13=datosactuales[2][0]+datosactuales[2][1]+datosactuales[2][2]+datosactuales[2][3];
         bodega14=datosactuales[3][0]+datosactuales[3][1]+datosactuales[3][2]+datosactuales[3][3];
         bodega15=datosactuales[4][0]+datosactuales[4][1]+datosactuales[4][2]+datosactuales[4][3];
         bodega16=datosactuales[5][0]+datosactuales[5][1]+datosactuales[5][2]+datosactuales[5][3];
         bodega17=datosactuales[6][0]+datosactuales[6][1]+datosactuales[6][2]+datosactuales[6][3];
         bodega18=datosactuales[7][0]+datosactuales[7][1]+datosactuales[7][2]+datosactuales[7][3];
         bodega19=datosactuales[8][0]+datosactuales[8][1]+datosactuales[8][2]+datosactuales[8][3];
         System.out.println("La bodega con mayor cantidad de datos en total es:");
         if (bodega11>bodega12 && bodega11>bodega13 && bodega11>bodega14 && bodega11>bodega15 && bodega11>bodega16 && bodega11>bodega17 && bodega11>bodega18 && bodega11>bodega19) {
             System.out.println("La bodega #11 tiene un total de productos de: "+bodega11);
        }else if (bodega12>bodega11 && bodega12>bodega13 && bodega12>bodega14 && bodega12>bodega15 && bodega12>bodega16 && bodega12>bodega17 && bodega12>bodega18 && bodega12>bodega19) {
             System.out.println("La bodega #12 tiene un total de productos de: "+bodega12);
        }else if (bodega13>bodega11 && bodega13>bodega12 && bodega13>bodega14 && bodega13>bodega15 && bodega13>bodega16 && bodega13>bodega17 && bodega13>bodega18 && bodega13>bodega19) {
             System.out.println("La bodega #13 tiene un total de productos de: "+bodega13);
        }else if (bodega14>bodega11 && bodega14>bodega12 && bodega14>bodega13 && bodega14>bodega15 && bodega14>bodega16 && bodega14>bodega17 && bodega14>bodega18 && bodega14>bodega19) {
             System.out.println("La bodega #14 tiene un total de productos de: "+bodega14);
        }else if (bodega15>bodega11 && bodega15>bodega12 && bodega15>bodega13 && bodega15>bodega14 && bodega15>bodega16 && bodega15>bodega17 && bodega15>bodega18 && bodega15>bodega19) {
             System.out.println("La bodega #15 tiene un total de productos de: "+bodega15);
        }else if (bodega16>bodega11 && bodega16>bodega12 && bodega16>bodega13 && bodega16>bodega14 && bodega16>bodega15 && bodega16>bodega17 && bodega16>bodega18 && bodega16>bodega19) {
              System.out.println("La bodega #16 tiene un total de productos de: "+bodega16);
        }else if (bodega17>bodega11 && bodega17>bodega12 && bodega17>bodega13 && bodega17>bodega14 && bodega17>bodega15 && bodega17>bodega16 && bodega17>bodega18 && bodega17>bodega19) {
              System.out.println("La bodega #17 tiene un total de productos de: "+bodega17);
        }else if (bodega18>bodega11 && bodega18>bodega12 && bodega18>bodega13 && bodega18>bodega14 && bodega18>bodega15 && bodega18>bodega16 && bodega18>bodega17 && bodega18>bodega19) {
              System.out.println("La bodega #18 tiene un total de productos de: "+bodega18);
        }else if (bodega19>bodega11 && bodega19>bodega12 && bodega19>bodega13 && bodega19>bodega14 && bodega19>bodega15 && bodega19>bodega16 && bodega19>bodega17 && bodega19>bodega18) {
              System.out.println("La bodega #19 tiene un total de productos de: "+bodega19);
        }
        Practica1.preguntaparareporte();
    }
    
    public static void menorproducto(){
        int productomayor = -1000; int productomenor= 1000; int bodegamayor = 0; int bodegamenor=0; int contador=11;
        for (int i = 0; i < datosactuales.length; i++) {
            bodegastotales[i]=0;
            for (int j = 0; j < datosactuales[i].length; j++) {
                bodegastotales[i]=bodegastotales[i]+datosactuales[i][j];
            }
            if (bodegastotales[i]<productomenor) {
                productomenor = bodegastotales[i];
                bodegamenor=i;
            }
        }
        System.out.println(" ");
        System.out.println("En la Bodega #"+(bodegamenor+contador)+" existen una cantidad de "+datosactuales[bodegamenor][0]+" del producto Cuadernos.");
        System.out.println("En la Bodega #"+(bodegamenor+contador)+" existen una cantidad de "+datosactuales[bodegamenor][1]+" del producto Lápices.");
        System.out.println("En la Bodega #"+(bodegamenor+contador)+" existen una cantidad de "+datosactuales[bodegamenor][2]+" del producto Lapiceros.");
        System.out.println("En la Bodega #"+(bodegamenor+contador)+" existen una cantidad de "+datosactuales[bodegamenor][3]+" del producto Hojas.");
        System.out.println(" ");
        Practica1.preguntaparareporte();
    }
    
    public static void mayorproducto(){
        int productomayor = -1000000; int productomenor= 1000; int bodegamayor = 0; int bodegamenor=0; int contador=11;
        for (int i = 0; i < datosactuales.length; i++) {
            bodegastotales[i]=0;
            for (int j = 0; j < datosactuales[i].length; j++) {
                bodegastotales[i]=bodegastotales[i]+datosactuales[i][j];
            }
            if (bodegastotales[i]>productomayor) {
                productomayor = bodegastotales[i];
                bodegamayor=i;
            }
        }
        System.out.println(" ");
        System.out.println("En la Bodega #"+(bodegamayor+contador)+" existen una cantidad de "+datosactuales[bodegamayor][0]+" del producto Cuadernos.");
        System.out.println("En la Bodega #"+(bodegamayor+contador)+" existen una cantidad de "+datosactuales[bodegamayor][1]+" del producto Lápices.");
        System.out.println("En la Bodega #"+(bodegamayor+contador)+" existen una cantidad de "+datosactuales[bodegamayor][2]+" del producto Lapiceros.");
        System.out.println("En la Bodega #"+(bodegamayor+contador)+" existen una cantidad de "+datosactuales[bodegamayor][3]+" del producto Hojas.");
        System.out.println(" ");
        Practica1.preguntaparareporte();
    }
    
    public static void promediobodega(){
         bodega11=(datosactuales[0][0]+datosactuales[0][1]+datosactuales[0][2]+datosactuales[0][3])/4;
         bodega12=(datosactuales[1][0]+datosactuales[1][1]+datosactuales[1][2]+datosactuales[1][3])/4;
         bodega13=(datosactuales[2][0]+datosactuales[2][1]+datosactuales[2][2]+datosactuales[2][3])/4;
         bodega14=(datosactuales[3][0]+datosactuales[3][1]+datosactuales[3][2]+datosactuales[3][3])/4;
         bodega15=(datosactuales[4][0]+datosactuales[4][1]+datosactuales[4][2]+datosactuales[4][3])/4;
         bodega16=(datosactuales[5][0]+datosactuales[5][1]+datosactuales[5][2]+datosactuales[5][3])/4;
         bodega17=(datosactuales[6][0]+datosactuales[6][1]+datosactuales[6][2]+datosactuales[6][3])/4;
         bodega18=(datosactuales[7][0]+datosactuales[7][1]+datosactuales[7][2]+datosactuales[7][3])/4;
         bodega19=(datosactuales[8][0]+datosactuales[8][1]+datosactuales[8][2]+datosactuales[8][3])/4;
         
         System.out.println("\nMostrando el promedio de artículos por bodega:");
         System.out.println("El Promedio de artículos en la Bodega #11 es de: "+bodega11);
         System.out.println("El Promedio de artículos en la Bodega #12 es de: "+bodega12);
         System.out.println("El Promedio de artículos en la Bodega #13 es de: "+bodega13);
         System.out.println("El Promedio de artículos en la Bodega #14 es de: "+bodega14);
         System.out.println("El Promedio de artículos en la Bodega #15 es de: "+bodega15);
         System.out.println("El Promedio de artículos en la Bodega #16 es de: "+bodega16);
         System.out.println("El Promedio de artículos en la Bodega #17 es de: "+bodega17);
         System.out.println("El Promedio de artículos en la Bodega #18 es de: "+bodega18);
         System.out.println("El Promedio de artículos en la Bodega #19 es de: "+bodega19);
         System.out.println(" ");
         Practica1.preguntaparareporte();
    }
    
    public static void medianacuaderno(){
         int vector[]=new int[9];
         int contador=0;
         
         for (int j = 0; j < 9; j++) {
            vector[contador]=datosactuales[j][0];
            contador++;
        }  
        int vectorcito[] = vector.clone();
        for (int i = 0; i < vectorcito.length; i++) {
            for (int j = 0; j < vectorcito.length-1; j++) {
                if (vectorcito[j]>vectorcito[j+1]) {
                    int auxiliar;
                    auxiliar = vectorcito[j+1];
                    vectorcito[j+1]=vectorcito[j];
                    vectorcito[j]=auxiliar;
                }
            }
        }
        int datomediano1=0; int datomediano2=0;
        for (int i = 0; i < vectorcito.length; i++) {
            if (vectorcito.length%2==0) {
                datomediano1=vectorcito[(vectorcito.length)-1];
                datomediano2=vectorcito[(vectorcito.length)/2];
            }else{
                datomediano1=vectorcito[(vectorcito.length)/2];
            }
        }
        System.out.println("La mediana de Cuadernos es de: "+datomediano1);
    }
    
    public static void medianalapiz(){
         int vector[]=new int[9];
         int contador=0;
         
         for (int j = 0; j < 9; j++) {
            vector[contador]=datosactuales[j][0];
            contador++;
        }  
        int vectorcito[] = vector.clone();
        for (int i = 0; i < vectorcito.length; i++) {
            for (int j = 0; j < vectorcito.length-1; j++) {
                if (vectorcito[j]>vectorcito[j+1]) {
                    int auxiliar;
                    auxiliar = vectorcito[j+1];
                    vectorcito[j+1]=vectorcito[j];
                    vectorcito[j]=auxiliar;
                }
            }
        }
        int datomediano1=0; int datomediano2=0;
        for (int i = 0; i < vectorcito.length; i++) {
            if (vectorcito.length%2==0) {
                datomediano1=vectorcito[(vectorcito.length)-1];
                datomediano2=vectorcito[(vectorcito.length)/2];
            }else{
                datomediano1=vectorcito[(vectorcito.length)/2];
            }
        }
        System.out.println("La mediana de Lápices es de: "+datomediano1);
    }
    
    public static void medianalapicero(){
         int vector[]=new int[9];
         int contador=0;
         
         for (int j = 0; j < 9; j++) {
            vector[contador]=datosactuales[j][0];
            contador++;
        }  
        int vectorcito[] = vector.clone();
        for (int i = 0; i < vectorcito.length; i++) {
            for (int j = 0; j < vectorcito.length-1; j++) {
                if (vectorcito[j]>vectorcito[j+1]) {
                    int auxiliar;
                    auxiliar = vectorcito[j+1];
                    vectorcito[j+1]=vectorcito[j];
                    vectorcito[j]=auxiliar;
                }
            }
        }
        int datomediano1=0; int datomediano2=0;
        for (int i = 0; i < vectorcito.length; i++) {
            if (vectorcito.length%2==0) {
                datomediano1=vectorcito[(vectorcito.length)-1];
                datomediano2=vectorcito[(vectorcito.length)/2];
            }else{
                datomediano1=vectorcito[(vectorcito.length)/2];
            }
        }
        System.out.println("La mediana Lapiceros es de: "+datomediano1);
    }
    
    public static void medianahoja(){
         int vector[]=new int[9];
         int contador=0;
         
         for (int j = 0; j < 9; j++) {
            vector[contador]=datosactuales[j][0];
            contador++;
        }  
        int vectorcito[] = vector.clone();
        for (int i = 0; i < vectorcito.length; i++) {
            for (int j = 0; j < vectorcito.length-1; j++) {
                if (vectorcito[j]>vectorcito[j+1]) {
                    int auxiliar;
                    auxiliar = vectorcito[j+1];
                    vectorcito[j+1]=vectorcito[j];
                    vectorcito[j]=auxiliar;
                }
            }
        }
        int datomediano1=0; int datomediano2=0;
        for (int i = 0; i < vectorcito.length; i++) {
            if (vectorcito.length%2==0) {
                datomediano1=vectorcito[(vectorcito.length)-1];
                datomediano2=vectorcito[(vectorcito.length)/2];
            }else{
                datomediano1=vectorcito[(vectorcito.length)/2];
            }
        }
        System.out.println("La mediana de Hojas es de: "+datomediano1);
    }
}
