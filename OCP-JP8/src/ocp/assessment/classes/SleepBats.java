package ocp.assessment.classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SleepBats {

	public static void main(String[] args) throws IOException {
		/* 
		 * 0TO DO - question 7 code should print "true true", but question explaining is
		 * not that good. Fix paths to make similar example
		 */	
		Path path1 = Paths.get("q7/bats/night","../").resolve(Paths.get(
				"./sleep.txt")).normalize();
		Path path2 = new File("q7/../sleep.txt").toPath().toRealPath();
		System.out.print(Files.isSameFile(path1,path2));
		System.out.print(" "+path1.equals(path2));
		
	}

}
