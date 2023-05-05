package poojava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class poojava {
	
		public static Scanner sc  = null;
		public static final String  PHONE_BOOK_FILE_PATH ="C:\\Users\\YC\\eclipse-workspace\\poojava\\bin\\poojava\\filep1.txt";  
	
		public static void main(String[] args) {
			
 //scanner =  scanf __ system.in pour scanner a partir de console
			sc  = new Scanner (System.in);

			String UserNomFamille =getUserInput(" un nom de famille");
			String UserPhone = getUserInput(" un numero de tele");

			contact newContact = new contact(UserNomFamille,UserPhone); 
//
//	
			System.out.println(newContact.toString());

			
		   File phoneBookFile = getOrCreatePhoneBookFile(PHONE_BOOK_FILE_PATH);

		   appendContactToPhoneBook(phoneBookFile,newContact);
		
			sc.close();
			
		}
		
		public static String getUserInput(String request ) {
			
			if (request == null || sc == null) {
				return null;
			}
			System.out.println("entrer" + request + ":");
			
			return sc.nextLine();
			
		}
		
		public static File getOrCreatePhoneBookFile(String phoneBookFilePath) {
		File phoneBookFile = new File(phoneBookFilePath);
		
		if(phoneBookFile.exists() ) {
			return phoneBookFile;
		} 
		
				try {
					phoneBookFile.createNewFile();
					System.out.println("le fichier a ete cree  ");
					return phoneBookFile;

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;

 } 
		
		public static void appendContactToPhoneBook(File phoneBookFile,contact newContact ) {
			
			
			try(BufferedWriter  fileWriter = new BufferedWriter(new FileWriter(phoneBookFile,true))) {
//		append() ajoute une chaîne de caractères à la fin du fichier
				
				fileWriter.append(newContact.toString()+'\n');
				System.out.println("contact ajouter ");

//		écrit une chaîne de caractères dans le fichier, en remplaçant son contenu précédent.
				
//				fileWriter.write("Contenu du fichier à écrire");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}