package test;

public class ville {
    //varible d'instance
   String nom;
   String villeParent;
   int nbPopulation;

    //constructeur
    public ville(String pnom,int pnbPopulation,String pvilleParent){
        this.nom=pnom;
        this.nbPopulation=pnbPopulation;
        this.villeParent=pvilleParent;
    }

    //getter
    public String getNom() {
        return nom;
    }

    public String getVilleParent() {
        return villeParent;
    }

    public int getNbPopulation() {
        return nbPopulation;
    }

    //setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVilleParent(String villeParent) {
        this.villeParent = villeParent;
    }

    public void setNbPopulation(int nbPopulation) {
        this.nbPopulation = nbPopulation;
    }
}


