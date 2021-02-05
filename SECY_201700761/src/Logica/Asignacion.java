package Logica;

public class Asignacion {
    private String carnet;
    private int nocurso;
    private int nota;
    private String semestre;
    private ManejadorSemestre sem;
    
    private Asignacion siguiente;
    private Asignacion anterior;

    public Asignacion(String carnet, int nocurso, int nota, String semestre, ManejadorSemestre sem) {
        this.carnet = carnet;
        this.nocurso = nocurso;
        this.nota = nota;
        this.semestre = semestre;
        this.sem = sem;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getNocurso() {
        return nocurso;
    }

    public void setNocurso(int nocurso) {
        this.nocurso = nocurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public ManejadorSemestre getSem() {
        return sem;
    }

    public void setSem(ManejadorSemestre sem) {
        this.sem = sem;
    }

    public Asignacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Asignacion siguiente) {
        this.siguiente = siguiente;
    }

    public Asignacion getAnterior() {
        return anterior;
    }

    public void setAnterior(Asignacion anterior) {
        this.anterior = anterior;
    }

   
}
