package main;

/**
 * @author ahmedelehwany
 * 
 * Handler class that triggers the Analyzer logic and outputs results to
 * user console,
 *
 */
public class FileAnalyzer {

	private String fileName;

	/**
	 * Constructor to instantiate FileAnalyzer.
	 * 
	 * @param fileName name of file to be analyzed
	 */
	public FileAnalyzer(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Runs logic on Analyzer and reports the output.
	 * 
	 * @throws Exception
	 */
	public void run() throws Exception {
		Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
		analyzer.run();

		System.out.println("Total # of lines: " + analyzer.getTotalLinesCount());
		System.out.println("Total # of comment lines: " + analyzer.getTotalCommmentsCount());
		System.out.println("Total # of single line comments: " + analyzer.getSingleCommentsCount());
		System.out.println(
				"Total # of comment lines within block comments: " + analyzer.getSingleCommentsWithinBlockCount());
		System.out.println("Total # of block line comments: " + analyzer.getBlockCommentsCount());
		System.out.println("Total # of TODO’s: " + analyzer.getTodosCount());
	}
}
