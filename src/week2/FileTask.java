package week2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTask {
	static File f = new File("Demo.txt");

	public static void main(String[] args) throws IOException {
    create();
    add();
	}
	
	
	 static void create() throws IOException {
		//demo file creation and insertion ....		
			if(f.createNewFile()) {
				System.out.println("Your Demo file is created!!!");
			}else {
				System.out.println("This file is already exists...");
			}
			
			FileWriter fw = new FileWriter(f);
			fw.append("Hello everOne , today is Wednesday\n");
			fw.append("We are learning JAVA-Core\n");	
			fw.append("That's All\n");
			fw.append("one two three");
			fw.append("End\n");
			fw.close();		
	}
	 static void add() throws IOException {
		//success and failure files ....	
			File Success = new File("Success.txt");
			FileWriter fwSuccess = new FileWriter(Success);

			File Failure = new File("Failure.txt");
			FileWriter fwFailure = new FileWriter(Failure);
			
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				String line = s.nextLine();
		        String[] words = line.trim().split("\\s+"); 
		        int Count = words.length;

		        if (Count > 3) {
		                fwSuccess.append(line + "\n");
		                System.out.println("Line added Successfully, which has more than THREE words");
		            }else{
		                fwFailure.append(line + "\n");
		                System.out.println("Line added Successfully, which has less than THREE words");     
		            }
		        }
			fwSuccess.close();
			fwFailure.close();
	 }
	
}
