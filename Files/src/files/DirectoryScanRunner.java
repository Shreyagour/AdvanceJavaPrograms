package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
      Path currentDirectory=Paths.get(".");
//		Files.list(currentDirectory).forEach(System.out::println);
      
      // extract java files only by filtering
		Predicate<? super Path> predicate=path->String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
		
//		Files.walk(currentDirectory, 4).filter(path->String.valueOf(path).contains(".java")).forEach(System.out::println);
		
  	System.out.println("These are files");
		BiPredicate<Path, BasicFileAttributes> filematcher=(path,attributes)->String.valueOf(path).contains(".java");
		Files.find(currentDirectory, 4, filematcher).forEach(System.out::println);
		System.out.println("These are folders");
		BiPredicate<Path, BasicFileAttributes> directorymatcher=(path,attributes)->attributes.isDirectory();
		Files.find(currentDirectory, 4, directorymatcher).forEach(System.out::println);
		

	}

}
