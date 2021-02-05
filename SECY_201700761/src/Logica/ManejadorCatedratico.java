package Logica;

public class ManejadorCatedratico {
    private Catedratico inicio;
    private Catedratico fin;
    private int tamanio;

    public ManejadorCatedratico() {
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }
    
     public Catedratico getInicio() {
        return this.inicio;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getLongitud(){
        return tamanio;
    }
    
    public void apilar(String re, String nom, String dir, String cor, String pass){
        Catedratico nuevo = new Catedratico(re, nom, dir, cor, pass);
        nuevo.setRegistroCat(re);
        nuevo.setNombre(nom);
        nuevo.setDireccion(dir);
        nuevo.setCorreo(cor);
        nuevo.setContrasenia(pass);
        if (esVacia()) {
            this.inicio = nuevo;
        }else{
            nuevo.setSiguiente(this.inicio);
            this.inicio = nuevo;
        }
        this.tamanio++;
    }
    
    public void retirar(){
        if (!esVacia()) {
            this.inicio = this.inicio.getSiguiente();
            this.tamanio--;
        }
    }
    
    public String cima() throws Exception{
        if(!esVacia()){
            return inicio.getRegistroCat();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    
    public boolean buscar(String referencia){
        // Crea una copia de la pila.
        Catedratico aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia == aux.getRegistroCat()) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }
    
    public void remover(String referencia){
        // Consulta si el valor existe en la pila.
        if (buscar(referencia)) {
            // Crea una pila auxiliar para guardar los valores que se 
            // vayan desapilando de la pila original.
            Catedratico pilaAux = null;
            // Recoore la pila hasta llegar al nodo que tenga el valor
            // igual que el de referencia.
            while(referencia != inicio.getRegistroCat()){
                // Crea un nodo temporal para agregarlos a la pila auxiliar.
                Catedratico temp = new Catedratico();
                // Ingresa el valor al nodo temporal.
                temp.setRegistroCat(inicio.getRegistroCat());
                temp.setNombre(inicio.getNombre());
                temp.setDireccion(inicio.getDireccion());
                temp.setCorreo(inicio.getCorreo());
                temp.setContrasenia(inicio.getContrasenia());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(pilaAux == null){
                    // Inicializa la pila auxiliar.
                    pilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al inicio.
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                // Elimina el nodo del tope de la pila hasta llegar al nodo
                // que se desea eliminar.
                retirar();
            }
            // Elimina el nodo que coincide con el de referencia.
            retirar();
            // Regresa los valores de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(pilaAux != null){
                // Utiliza el metodo apilar para regresar los elementos a 
                // la pila original.
                apilar(pilaAux.getRegistroCat(), pilaAux.getNombre(), pilaAux.getDireccion(), pilaAux.getCorreo(), pilaAux.getContrasenia());
                // Avansa al siguiente nodo de la pila auxiliar.
                pilaAux = pilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            pilaAux = null;
        }
    }    

    public void editar(String re, String nom, String dir, String cor, String pass){
        // Consulta si el nodo existe en la pila
        if (buscar(re)) {
            // Crea una pila auxiliar.
            Catedratico pilaAux = null;
            // Recoore la pila hasta llegar al nodo que tenga el valor
            // igual que el de referencia.
            while(re != inicio.getRegistroCat()){
                // Crea un nodo temporal para agregarlos a la pila auxiliar.
                Catedratico temp = new Catedratico(re, nom, dir, cor, pass);
                // Ingresa el valor al nodo temporal.
                temp.setRegistroCat(inicio.getRegistroCat());
                temp.setNombre(inicio.getNombre());
                temp.setDireccion(inicio.getDireccion());
                temp.setCorreo(inicio.getCorreo());
                temp.setContrasenia(inicio.getContrasenia());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(pilaAux == null){
                    // Inicializa la pila auxiliar.
                    pilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al inicio.
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                // Elimina el nodo del tope de la pila hasta llegar al nodo
                // que se desea eliminar.
                retirar();
            }
            // Actualiza el valor del nodo.
            inicio.setRegistroCat(re);
            inicio.setNombre(nom);
            inicio.setDireccion(dir);
            inicio.setCorreo(cor);
            inicio.setContrasenia(pass);
            // Regresa los valores de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(pilaAux != null){
                // Utiliza el metodo apilar para regresar los elementos a 
                // la pila original.
                apilar(pilaAux.getRegistroCat(), pilaAux.getNombre(),  pilaAux.getDireccion(), pilaAux.getCorreo(), pilaAux.getContrasenia());
                // Avansa al siguiente nodo de la pila auxiliar.
                pilaAux = pilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            pilaAux = null;
        }
    }
    
    public void listar(){
        // Crea una copia de la pila.
        Catedratico aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getRegistroCat() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
    
    public Catedratico buscarNodo(String registro){
        for(Catedratico recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
            if(recorrer.getRegistroCat().equals(registro))
                return recorrer;

        return null;
    }
    
    public boolean buscarCatedráticoLogin(String registro, String password){
        for(Catedratico recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
            if(recorrer.getRegistroCat().equals(registro) && recorrer.getContrasenia().equals(password))
                return true;

        return false;
    }
    
    public void eliminarNodo(String regis, String nom, String dir, String cor, String pass){
        Catedratico actual = this.inicio;
        Catedratico anterior = null;
        if (this.inicio != null) {
            while (actual != null) {                
                if (actual.getRegistroCat().equals(regis)) {
                    if (actual == this.inicio) {
                        this.inicio.setSiguiente(actual);
                    }else{
                        anterior.setSiguiente(this.inicio);
                        actual.setSiguiente(this.inicio);
                    }
                }
                anterior = actual;
                actual.setSiguiente(this.inicio);
            }
        }
    }
}
