package Mrnjao;
import java.util.Scanner;

public class Zdrnjao {
	
	public String Ime;
	public String Prezime;
	public int Godine;
	public int BlanacNovca;
	public int MinimalnaKolicinaNovca = 500;
	public int MinimalnaKolicinaGodina = 18;

	public String getIme() {
		return Ime;
	}

	public void setIme(String Ime) {
		this.Ime = Ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public int MinimalnaKolicinaGodina() {
		return Godine;
	}

	public void MinimalnaKolicinaGodina(int godine) {
		Godine = godine;
	}

	public int getBlanacNovca() {
		return BlanacNovca;
	}

	public void setBlanacNovca(int blanacNovca) {
		BlanacNovca = blanacNovca;
	}

	public int getMinimalnaKolicinaNovca() {
		return MinimalnaKolicinaNovca;
	}

	public void setMinimalnaKolicinaNovca(int minimalnaKolicinaNovca) {
		MinimalnaKolicinaNovca = minimalnaKolicinaNovca;
	}
	
	public int getGodine() {
		return Godine;
	}

	public void setGodine(int godine) {
		Godine = godine;
	}
	
	public boolean SmeLiDaIgraPoker() {
		return BlanacNovca >= MinimalnaKolicinaNovca;
		
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Unesiet vase ime: ");
		String Ime = k.nextLine();
		
		System.out.println("Unesite vase Prezime: ");
		String Prezime = k.nextLine();
		
		System.out.println("Koliko godina imate: ");
		int Godine = k.nextInt();
		
		System.out.println("Koliko novca zelite da iskoristite: ");
		int Novac = k.nextInt();
		
		Zdrnjao osoba = new Zdrnjao();
		osoba.setIme(Ime);
		osoba.setPrezime(Prezime);
		osoba.setGodine(Godine);
		osoba.setBlanacNovca(Novac);
		
		System.out.println("\nUneseni podaci:");
        System.out.println("Ime: " + osoba.getIme());
        System.out.println("Prezime: " + osoba.getPrezime());
        System.out.println("Godine: " + osoba.getGodine());
        System.out.println("Novac za korišćenje: " + osoba.getBlanacNovca());
        System.out.println("Minimalna kolicina: " + osoba.getMinimalnaKolicinaNovca());
        System.out.println("Minimalna kolicina godina: " + osoba.MinimalnaKolicinaGodina);
        
        if (osoba.getBlanacNovca() >= osoba.getMinimalnaKolicinaNovca()) { 
        	if(osoba.getGodine() >= osoba.getMinimalnaKolicinaNovca())
        	System.out.println("\"Možete igrati poker — imate dovoljno novca i godin!");
        }else {
        	System.out.println("Izvinite ne mozete ucestvovati u igri");
        }
	}

}
