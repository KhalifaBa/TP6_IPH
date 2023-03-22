package Entities;

public class PompierVolontaire extends Pompier
{

    private int nbHeure;
    private double prixHeure;

    public PompierVolontaire(int unId, String unNom, double unSalaire, int unNbHeure, double unPrixHeure)
    {
        super(unId,unNom,unSalaire);
        this.prixHeure = unPrixHeure;
        this.nbHeure = unNbHeure;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public double getPrix() {
        return prixHeure;
    }
    @Override
    public double CalculerSalaire()
    {

        return super.CalculerSalaire() + (prixHeure * nbHeure);
    }
    @Override
    public String getInfo()
    {
        return getId() + " " + getNom()+ " " + CalculerSalaire();
    }
}
