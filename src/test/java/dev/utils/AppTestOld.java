/**
 * 
 */
package dev.utils;

/**
 * @author Alexis Darcy
 *
 */
public class AppTestOld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CharSequence ojb1 = "Chat";
		CharSequence ojb2 = "Chien";
		CharSequence ojb3 = "Chine";
		CharSequence ojb4 = "Miaou";
		int result;
		
		System.out.println("____________________________________________");
		
		result = StringUtils.levenshteinDistance(ojb1, ojb2);
		
		if (result != 3){
			throw new RuntimeException("erreur dans la méthode : la difference entre chat et chien n'est pas de 3");
		}
		
		
		System.out.println("____________________________________________");
		
		result = StringUtils.levenshteinDistance(ojb2, ojb3);
		
		if (result != 2){
			throw new RuntimeException("erreur dans la méthode : la difference entre chien et chine n'est pas de 2");
		}
	
		
		System.out.println("____________________________________________");
		
		result = StringUtils.levenshteinDistance(ojb1, ojb3);
		
		if (result != 3){
			throw new RuntimeException("erreur dans la méthode : la difference entre chat et chine n'est pas de 3");
		}
		
		System.out.println("____________________________________________");
		
		result = StringUtils.levenshteinDistance(ojb3, ojb4);
		
		if (result != 5){
			throw new RuntimeException("erreur dans la méthode : la difference entre chine et miaou n'est pas de 5");
		}
		
		System.out.println("____________________________________________");
		
		result = StringUtils.levenshteinDistance(null, null);
		
	}

}
