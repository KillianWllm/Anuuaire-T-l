package com.killian.PhoneBook;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PhoneBook {
	
	public static Scanner sc = null;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String userLastName  =   getUserInput("Entrez un nom de famille: ");
		String userFirstName  =  getUserInput("Entrez un prénom: ");
		String userOld  =  getUserInput("Entrez l'age: ");
		String userPhoneNumber = getUserInput("Entrez un numéro de telephone: ");
		
		Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber, userOld);
		
		System.out.println(newContact.toString());
		
		File phoneBookFile = new File("C:\\Users\\HB\\Desktop\\Dev-Training\\Eclipse-WorkSpace\\Annuaire-tel\\phonebook.txt");
		
		if(phoneBookFile.exists()) {
			System.out.println("Le Fichier existe");
		}
		else {
			System.out.println("Le Fichier n'existe pas");
			try {
				phoneBookFile.createNewFile();
				System.out.println("Le Fichier a été créé");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
			fileWriter.append(newContact.toString() + "\n");
			System.out.println("Contact ajouté à votre fichier phonebook");
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();

	}
	
	public static String getUserInput(String userRequest) {
		
	
		
		System.out.println(userRequest);
		return sc.nextLine();
		
	}

}
