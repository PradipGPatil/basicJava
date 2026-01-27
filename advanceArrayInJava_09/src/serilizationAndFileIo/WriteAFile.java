package serilizationAndFileIo;

import java.io.FileReader;
import java.io.FileWriter;

public class WriteAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// when we need byte use Fileoutput
		//
		//FileWriter is itself a specialized class built on top of OutputStream — specifically a character stream that writes text data directly to a file
		//FileWriter writer = new FileWriter("example.txt");
		// Internally does something like:
		//new OutputStreamWriter(new FileOutputStream("example.txt"));
		
		try {
		FileWriter fw=new FileWriter("Foo.txt");
		fw.write("hello foo !");
		// close connection when it done
		fw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// now read from the file
		
		try {
		FileReader fr=new FileReader("Foo.txt");
		int ch;
		// fr.read , read 1 character at a time 
        while ((ch = fr.read()) != -1) {   // read() returns -1 when end of file is reached
            System.out.print((char) ch);
        }
        fr.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
