package Entities;

public class Pompier implements Comparable<Pompier>
{
    private int id;
    private String nom;
    private double salaire;

    public Pompier(int id, String nom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public double CalculerSalaire()
    {

        return salaire;
    }

    public String getInfo()
    {
        return getId() + " " + getNom()+ " " + getSalaire();
    }


    @Override
    public int compareTo(Pompier o) {
        return Double.compare(this.salaire,o.salaire);
    }
}
