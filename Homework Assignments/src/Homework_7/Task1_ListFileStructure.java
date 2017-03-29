package Homework_7;
import java.io.File;
import java.io.IOException;

public class Task1_ListFileStructure {

	public static void main(String[] args) {
		String path = "C:\\Users\\tau\\git\\Homework\\Homework Assignments";
		File currentDir = new File(path);
		displayDirectoryContents(currentDir);
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}