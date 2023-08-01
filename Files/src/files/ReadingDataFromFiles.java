package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingDataFromFiles {

	public static void main(String[] args) throws IOException {
	Path pathoffile=Paths.get("./resources/data.txt");
//	List<String> alldata=Files.readAllLines(pathoffile);
//	System.out.print(alldata);
	Files.lines(pathoffile).map(String::toLowerCase).filter(str->str.contains("a")).forEach(System.out::println);
//	Files.lines(pathoffile).map(a->a+"stringg").filter(str->str.contains("a")).forEach(System.out::println);

	}

}
