/**
 * Created by x3727349s on 16/01/17.
 */
public class Llibre {

    private int id;
    private String titol;
    private int nombreDexemplars;
    private String editorial;
    private int nombrePagines;
    private String anyDedicio;

    public Llibre(){}

    public Llibre(String titol, int nombreDexemplars, String editorial, int nombrePagines, String anyDedicio) {
        this.titol = titol;
        this.nombreDexemplars = nombreDexemplars;
        this.editorial = editorial;
        this.nombrePagines = nombrePagines;
        this.anyDedicio = anyDedicio;
    }

    public void setId(int id) {this.id = id;}
    public void setTitol(String titol) {this.titol = titol;}
    public void setNombreDexemplars(int nombreDexemplars) {this.nombreDexemplars = nombreDexemplars;}
    public void setEditorial(String editorial) {this.editorial = editorial;}
    public void setNombrePagines(int nombrePagines) {this.nombrePagines = nombrePagines;}
    public void setAnyDedicio(String anyDedicio) {this.anyDedicio = anyDedicio;}

    public int getId() {return id;}
    public String getTitol() {return titol;}
    public int getNombreDexemplars() {return nombreDexemplars;}
    public String getEditorial() {return editorial;}
    public int getNombrePagines() {return nombrePagines;}
    public String getAnyDedicio() {return anyDedicio;}
}