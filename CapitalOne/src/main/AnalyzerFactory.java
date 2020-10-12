package main;

import java.util.List;

/**
 * @author ahmedelehwany 
 * 
 * Factory class to get the appropriate analyzer type.
 */
public class AnalyzerFactory {

	/**
	 * returns the appropriate analyzer corresponding to the file extension.
	 * 
	 * @param fileName
	 * @return Analyzer
	 * @throws Exception
	 */
	public Analyzer getAnalyzer(String fileName) throws Exception {
		String extension = fileName.split("\\.")[1];
		List<String> lines = new FileParser(fileName).read();

		switch (extension) {
		case "java":
		case "c":
		case "h":
		case "js":
		case "php":
		case "cs":
		case "CPP":
		case "CXX":
			return new StandardAnalyzer(lines);
		case "py":
			return new PythonAnalyzer(lines);
		case "html":
			return new HTMLAnalyzer(lines);
		default:
			throw new Exception("Unsupported file extension provided");
		}

	}
}
