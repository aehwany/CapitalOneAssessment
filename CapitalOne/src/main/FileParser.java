package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmedelehwany
 * 
 * Module responsible for parsing file and converting it to list of strings.
 *
 */
public class FileParser {

	private String fileName;
	private List<String> lines;

	/**
	 * Constructor initializes fileParser and sets the file name to be parsed
	 * @param fileName
	 */
	public FileParser(String fileName) {
		this.fileName = fileName;
		lines = new ArrayList<>();
	}

	/**
	 * Scans the file and returns list of strings(lines)
	 * @return List<String>
	 */
	public List<String> read() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null) {
				lines.add(line);

				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Failed to open or read the input file");
			e.printStackTrace();
		}
		return lines;
	}
}
