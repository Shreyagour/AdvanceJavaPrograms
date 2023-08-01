package com.in28minutes.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p=Paths.get("./resources/sample.txt");
		String filecontent=Files.readString(p);
		System.out.println(filecontent);
		String newfilecontent=filecontent.replace("Line","Linesss");
		Path newp=Paths.get("./resources/new-sample.txt");
		Files.writeString(newp, newfilecontent);

	}

}
