public class Personnage {
    private String nom;
    private int niveau = 1;
    private int pointsDeVieMax;
    private int pointsDeVie;
    private int attaque;
    private int defense = 1;

    Personnage(String nom, int pointsDeVieMax, int pointsDeVie, int attaque, int defense ){
        this.nom = nom;
        setPointDeVie(pointsDeVie, pointsDeVieMax);
        setAttaque(attaque);
        setDefense(defense);
    }

    private void setPointsDeVieMax(int pointsDeVieMax) {
        if(pointsDeVieMax >= 1) {
            this.pointsDeVieMax = pointsDeVieMax;
        } else {
            System.out.println("Error: Le nombre maximal de points de vie doit être supérieur à zéro.");
        }
    }

    private void setAttaque(int attaque) {
        if(attaque >= 0) {
            this.attaque = attaque;
        } else {
            System.out.println("Error: L'attaque ne doit pas être inferieur à zéro");
        }
    }

    private void setDefense(int defense) {
        if(defense >= 0) {
            this.defense = defense;
        } else {
            System.out.println("Error: La defense ne doit pas être inferieur à zéro");
        }
    }

    private void setPointDeVie(int pointsDeVie,int pointDeVieMax) {
        setPointsDeVieMax(pointDeVieMax);
        if(this.pointsDeVieMax >= pointsDeVie && pointsDeVie < 0) {
            this.pointsDeVie = pointsDeVie;
        } else {
            System.out.println("Error: Le nombre de points de vie ne peut pas dépasser la limite de "
                                + pointDeVieMax + " points ou être inférieur à zéro");
        }
    }

    public boolean estVivant(){
        return pointsDeVie > 0;
    }

    public void soigner(int pointsDeVie){
        this.pointsDeVie += pointsDeVie;
    }

    public int attaquer(Personnage cible){
        return attaque * (int)((120 - 80) * Math.random()) + 80 - cible.getDefense();
    }

    public int getDefense() {
        return defense;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getPointsDeVieMax() {
        return pointsDeVieMax;
    }
}
