package unl.cse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
	
	
	
	public static void main(String[] args) {
		
		File f = new File ("data/book.csv");
		List<String[]> all = new 	ArrayList<>();
		try {
			Scanner s  = new Scanner(f);
			String a = s.nextLine();
			 while(s.hasNextLine()) {
				 a = s.nextLine();
		
			
			all.add(a.split("[,]"));
			
			 }
		 
			s.close();
		} catch (FileNotFoundException e) {
			
			throw new RuntimeException(e);
		}
		//which is the best book ?
		double highestRating = 0 ;
		int index = 0 ; 
		for(int i = 0 ; i < all.size();i++) {
			String [] arr =all.get(i);
			double rating = Double.parseDouble(arr[5]) ;
			 
		 
			if(rating> highestRating ) {
				highestRating = rating  ;
				index = i  ;
		}
			
			
		}
		String[] result = all.get(index);	
		System.out.println("Line " +( index +1 + 1) + " has highest rating "+ highestRating + " book : " + 
		result[1] + " Author " + result[2] + " " + result[3]
							);
	
	for (String[] arr : all) {
		
		if (arr[2].compareToIgnoreCase("murakami") == 0){
			System.out.println("Found Book : " + arr[1].toString()+ " ISBN : "+ arr[4]);
			 
		}
	}
	}

}
