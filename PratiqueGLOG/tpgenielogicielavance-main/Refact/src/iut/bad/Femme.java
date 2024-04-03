package iut.bad;

public class Femme extends Humain {
	private String nom;
	private String prenom;
	private int age;
	
    public Femme() {
        super();
    }

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
        // Instanciation d'un Homme et une Femme
        Homme homme = new Homme("Jean", "Dupont", 30);
        Femme femme = new Femme("Marie", "Durand", 25);

        // Déclaration d'amitié entre les deux humains
        femme.ami(homme);
    }
}
