package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WritingDataInFile {

	public static void main(String[] args) throws IOException {
		Path pathoffile=Paths.get("./resources/datawritten.txt");
        List<String> alldatatowrite=List.of("Shreya","1","Gour","2");
        Files.write(pathoffile, alldatatowrite);

	}

}
