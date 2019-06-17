package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filehandling {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String line;
			String[] stringArray;
			FileInputStream file=new FileInputStream("C:\\Users\\MY LAPTOP\\Desktop\\Properties.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNext()) {
				line=sc.nextLine();
				if(line.contains("Name")) {
					stringArray=line.split(":");
					System.out.println(stringArray[1].trim());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
