package Day_5_Assignments;

import java.io.File;

public class ReadingTheFile {
	
	
		public static void main(String[] args) {
			File myFile = new File("C:\\Users\\Trainee\\git\\repository2\\Week_1_Assignments\\emp");
			if (myFile.exists()) {
				System.out.println(myFile.getName() + " exists");
				System.out.println("The file is " + myFile.length() + " bytes long");
				if (myFile.canRead())
					System.out.println(" ok to read");
				else
					System.out.println(" not ok to read");
				if (myFile.canWrite())
					System.out.println(" ok to write");
				else
					System.out.println(" not ok to write");
				System.out.println("path: " +myFile.getAbsolutePath());
				System.out.println("File Name: "+ myFile.getName());
				System.out.println("File Size: "+ myFile.length() + " bytes");
			} else
				System.out.println("File does not exist");
		}
	}


