package Entities;

public class PompierPro extends Pompier
{
    private int prime;

    public PompierPro(int unId,String unNom, double unSalaire, int unePrime)
    {
        super(unId,unNom,unSalaire);
        this.prime = unePrime;

    }

    public int getPrime() {
        return prime;
    }

    @Override
    public double CalculerSalaire()
    {

        return super.CalculerSalaire() + prime;
    }

    @Override
    public String getInfo()
    {
        return getId() + " " + getNom()+ " " + CalculerSalaire();
    }
}
