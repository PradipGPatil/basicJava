package serilizationAndFileIo;

import java.io.File;

public class FileCreating {

	public static void main(String[] args) {
		// file represent the path on disk
		// instead of passing string we can pass the file object as well

		// given path of existing file
		File f = new File("Chapter7/Foo.txt");

		// maing driectory
		File d = new File("Chapter7");
		d.mkdir();

		if (d.isDirectory()) {

			System.out.println(d);
		}

		System.out.println(d.getAbsolutePath());
		
		// delete directory or file
		
		boolean isDeleted = f.delete();
		System.out.println("is the file is deleted : "+isDeleted);

	}
}
