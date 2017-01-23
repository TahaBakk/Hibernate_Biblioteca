/**
 * Created by x3727349s on 23/01/17.
 */
public class Socis {

    private String nom;
    private String cognom;
    private int edat;
    private String direccio;
    private int telefon;

    public Socis(){}

    public Socis(String nom, String cognom, int edat, String direccio, int telefon) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.direccio = direccio;
        this.telefon = telefon;
    }

    public void setNom(String nom) {this.nom = nom;}
    public void setCognom(String cognom) {this.cognom = cognom;}
    public void setEdat(int edat) {this.edat = edat;}
    public void setDireccio(String direccio) {this.direccio = direccio;}
    public void setTelefon(int telefon) {this.telefon = telefon;}

    public String getNom() {return nom;}
    public String getCognom() {return cognom;}
    public int getEdat() {return edat;}
    public String getDireccio() {return direccio;}
    public int getTelefon() {return telefon;}
}
