package n3exercici1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Redactor {
	private String nom;
	private String dni;
	private static int SOU = 1500;
	
	private ArrayList<Noticia> noticies;
	
	// Constructor
	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
		this.noticies = new ArrayList<Noticia>();
	}

	// Getters
	public String getNom() {
		return nom;
	}

	public String getDni() {
		return dni;
	}

	public static int getSou() {
		return SOU;
	}

	// Setters
	public static void setSou(int sou) {
		Redactor.SOU = sou;
	}
	
	// toString
	@Override
	public String toString() {
		return "Redactor " + nom + " amb DNI " + dni + " té " + this.noticies.size() + " noticies.";
	}
	
	// utils
	
	public void imprimirNoticies() {
		
		System.out.println("Notícies del redactor " + nom + " amb DNI " + dni +":\n");
		
		int numNoticies = this.noticies.size();
		
		for (int i=0; i < numNoticies; i++) {
			System.out.println("    - " + this.noticies.get(i).toString());
		}
	}
	
	public void afegirNoticia(Noticia n) {
		
		Noticia not = this.buscarNoticia(n.getTitular());
		
		if (not == null) {
			this.noticies.add(n);
			System.out.println("Notícia afegida.");
			n.calcularPuntuacioNoticia();
			n.calcularPreuNoticia();
		} else {
			System.out.println("Ja existeix una notícia amb aquest titular.");
		}
		System.out.println();
		
	}
	
	public void eliminarNoticia(String titular) {
		
		Noticia not = buscarNoticia(titular);
		
		if (not == null) {
			System.out.println("No s'ha trobat cap notícia amb el titular '" + titular +"'.");
		} else {
			
		}
	}
	

	public Noticia buscarNoticia(String titular) {
		
		ListIterator<Noticia> notIt = this.noticies.listIterator();
		boolean found = false;
		Noticia not = null;
		
		while(!found && notIt.hasNext()) {
			Noticia notTemp =  notIt.next();
			
			if (titular.equalsIgnoreCase(notTemp.getTitular())) {
				found = true;
				not = notTemp;
			}
		}
		
		return not;
	}
	
	
}
