package week2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileTask2 {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		
		File excel = new File("Fcsv.csv");
		FileWriter fw = new FileWriter(excel);
        if(excel.createNewFile()) System.out.println("File Created");
        else System.out.println("Already available this files");
		
		System.out.println("Enter the no.of Rows :");
		int rows = s.nextInt();
		System.out.println("Enter the no.of Columns :");
		int cols = s.nextInt();
     	s.nextLine();
		
		for(int i=1 ; i<=rows; i++) {
			for(int j=1; j<=cols;j++) {
				
				System.out.println("Enter the "+i+"st ROW , " +j+"st Column Value");
				 String cellData = s.next();
				fw.append(cellData+",");
				
			}fw.append("\n");
		}
		fw.close();
		s.close();
	}
}
