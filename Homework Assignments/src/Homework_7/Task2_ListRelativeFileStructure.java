package Homework_7;

import java.io.File;
import java.io.IOException;

public class Task2_ListRelativeFileStructure {

	public static void main(String[] args) {
		String path = "..\\Homework Assignments";
		File currentDir = new File(path);
		displayDirectoryContents(currentDir);
	}

	public static void displayDirectoryContents(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory: " + file.getPath());
				displayDirectoryContents(file);
			} else {
				System.out.println("     file: " + file.getPath());
			}
		}
	}
	}


