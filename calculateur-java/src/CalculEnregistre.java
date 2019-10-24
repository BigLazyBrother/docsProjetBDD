import java.util.Calendar;

//
// IL EST POSSIBLE QUE CETTE CLASSE SOIT SUPPRIMÉE PAR LA SUITE
//
// JE VAIS PEUT-ÊTRE POUVOIR M'EN AFFRANCHIR S'IL M'EST POSSIBLE
// DE GÉRER LES INSERTIONS DIRECTEMENT APRÈS LES REQUÊTES.
// (Donc je vais faire en sorte de m'en donner les moyens).
//

public class CalculEnregistre {

    protected long idCalculEnregistre;
    protected Calendar dateDebut;
    protected Calendar dateFin;
    protected float frequence;
    protected float valeur;
    protected int idTypeDonneeMesuree;
    protected int idTypeCalcul;
    protected boolean prevu;
    protected String cheminFichierXML;
    protected String etiquette;
    protected boolean enregistre;

    //Constructeur vide
    public CalculEnregistre(){}

    public CalculEnregistre(float valeur){
        this.valeur = valeur;
    }

    public long getIdCalculEnregistre() {
        return idCalculEnregistre;
    }

    public void setIdCalculEnregistre(long idCalculEnregistre) {
        this.idCalculEnregistre = idCalculEnregistre;
    }

    public Calendar getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Calendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    public float getFrequence() {
        return frequence;
    }

    public void setFrequence(float frequence) {
        this.frequence = frequence;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public int getIdTypeDonneeMesuree() {
        return idTypeDonneeMesuree;
    }

    public void setIdTypeDonneeMesuree(int idTypeDonneeMesuree) {
        this.idTypeDonneeMesuree = idTypeDonneeMesuree;
    }

    public int getIdTypeCalcul() {
        return idTypeCalcul;
    }

    public void setIdTypeCalcul(int idTypeCalcul) {
        this.idTypeCalcul = idTypeCalcul;
    }

    public boolean isPrevu() {
        return prevu;
    }

    public void setPrevu(boolean prevu) {
        this.prevu = prevu;
    }

    public String getCheminFichierXML() {
        return cheminFichierXML;
    }

    public void setCheminFichierXML(String cheminFichierXML) {
        this.cheminFichierXML = cheminFichierXML;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    public boolean isEnregistre() {
        return enregistre;
    }

    public void setEnregistre(boolean enregistre) {
        this.enregistre = enregistre;
    }
}
