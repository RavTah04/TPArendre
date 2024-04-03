package iut.bad;

public class Homme extends Humain{
	private String nom;
	private String prenom;
	private int age;
	
	
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
	public Homme() {
        super();
    }

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
}
