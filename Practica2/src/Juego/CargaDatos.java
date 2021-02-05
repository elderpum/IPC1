package Juego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CargaDatos {
    public static Cuphead[] listadisparo = new Cuphead[7];
    public static Jefe[] listajefes = new Jefe[10];
    public static Nodo inicio = new Nodo(10);
    
    public static void main(String[] args){
    
    begin();
}
    public static void begin() {
        Nodo nuevo=new Nodo(100);
        inicio.siguiente = nuevo;
        inicializar();
        String respuesta=leerArchivo(SelectorArchivos.ruta);
        String []datosseparados=respuesta.split("-");
        int o=0;
        int c=0;
        for (int i = 0; i < datosseparados.length; i++) {
            String [] datosfinale = datosseparados[i].split("%%");
            if (datosfinale.length==5){
                System.out.println("Cuphead");
                listadisparo[o].setTipo(datosfinale[0]);
                listadisparo[o].setNombre(datosfinale[1]);
                listadisparo[o].setVelocidad(Integer.parseInt(datosfinale[2]));
                listadisparo[o].setDanio(Integer.parseInt(datosfinale[3]));
                listadisparo[o].setRuta(datosfinale[4]);
                o=o+1;
            }else if (datosfinale.length==10) {
                System.out.println("Boss");
                listajefes[c].setTipo(datosfinale[0]);
                listajefes[c].setNombre(datosfinale[1]);
                listajefes[c].setNivel(Integer.parseInt(datosfinale[2]));
                listajefes[c].setFrecuencia(Integer.parseInt(datosfinale[3]));
                listajefes[c].setVelocidad(Integer.parseInt(datosfinale[4]));
                listajefes[c].setDanio(Integer.parseInt(datosfinale[5]));
                listajefes[c].setRutadisparo(datosfinale[6]);
                listajefes[c].setRutaimagen(datosfinale[7]);
                listajefes[c].setEscenario(datosfinale[8]);
                listajefes[c].setCancion(datosfinale[9]);
            c=c+1;
            }
        }
        System.out.println("Finalizado");
        }
    
    public static void inicializar(){
        for(int i=0;i<listadisparo.length;i++){
            listadisparo[i]=new Cuphead();
        }
        for(int i=0;i<listajefes.length;i++){
            listajefes[i]=new Jefe();
        }
    }
    
    public static String leerArchivo(String ruta){
        File archivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        String respuesta="";
        try{
            archivo=new File(ruta);
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);
            System.out.println("Leyendo Contenido");
            String linea="";
            boolean bandera=false;
            while((linea=br.readLine())!=null){
                if(bandera==true){
                    respuesta=respuesta+"-"+linea;
                }else{
                    respuesta=linea;
                    bandera=true;
                }
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error");
        }finally{
            try{
                if(null!=fr){
                    fr.close();
                }
            }catch(Exception e){
                System.out.println("Ocurrio un error");
            }
        }
        return respuesta;
    }
}
