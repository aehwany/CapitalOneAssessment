package main;
import java.util.List;

/**
 * @author ahmedelehwany
 *
 * Analyzer class specialized in generic multi-language code analysis
 * (java, C, C++, C#, PHP, etc..)
 */
public class StandardAnalyzer extends AbstractAnalyzer implements Analyzer {

	private static final String SINGLE_COMMENT = "//";
	private static final String BLOCK_COMMENT_START = "/*";
	private static final String BLOCK_COMMENT_BODY = "*";
	private static final String BLOCK_COMMENT_END = "*/";
	private static final String TODO = "TODO:";

	private List<String> lines;

	/**
	 * Constructor initializes StandardAnalyzer instance and sets the list of lines.
	 * @param lines
	 */
	public StandardAnalyzer(List<String> lines) {
		this.lines = lines;
	}

	/**
	 * Executes generic comment analysis logic 
	 * and sets the comment counter fields.
	 */
	@Override
	public void run() {
		boolean block = false;
		for (String line : lines) {
			totalLinesCount++;
			line = line.trim();
			if (line.isBlank())
				continue;

			if (line.contains(SINGLE_COMMENT))
				singleCommentsCount++;

			if (line.contains(BLOCK_COMMENT_START)) {
				blockCommentsCount++;
				block = true;
			}
			
			if (block && line.contains(BLOCK_COMMENT_BODY))
				singleCommentsWithinBlockCount++;
			
			if (line.contains(BLOCK_COMMENT_END))
				block = false;

			if (line.contains(TODO))
				todosCount++;
		}
		return;
	}

}
