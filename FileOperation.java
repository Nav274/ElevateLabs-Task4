import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		
		System.out.println("1. Write to the file");
		System.out.println("2. Read from the file");
		System.out.println("Enter the choice");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		File file = new File("C:/Users/Administrator/Desktop/javafile.txt");
		FileWriter filewrite = new FileWriter(file, true);
		
		switch(choice) {
		
		case 1: 
				System.out.println("Enter anything to write to the file(javafile.txt)");
				String str = scanner.next();
				filewrite.append(str);
				filewrite.close();
		
		break;
		case 2:
				FileReader filereader = new FileReader(file);
				int i = 0;
				while((i=filereader.read()) != -1) {
					
					char fileread = (char)i;
					System.out.print(fileread);
				}		
				filereader.close();
		}
	}

}
