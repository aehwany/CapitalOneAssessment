package main;
import java.util.List;

/**
 * @author ahmedelehwany
 * 
 * Analyzer class specialized in HTML comments and code analysis
 *
 */
public class HTMLAnalyzer extends AbstractAnalyzer implements Analyzer {
	private static final String COMMENT_BEGIN = "!--";
	private static final String COMMENT_END = "-->";
	
	private List<String> lines;

	/**
	 * Constructor instantiates HTMLAnalyzer instance
	 * and sets the list of lines
	 * @param lines
	 */
	public HTMLAnalyzer(List<String> lines) {
		this.lines = lines;
	}

	/**
	 * Executes HTML comment analysis logic 
	 * and sets the comment counter fields.
	 */
	@Override
	public void run() {
		int count = 0;
		boolean block = false;
		for(String line : lines) {
			totalLinesCount++;
			line = line.trim();
			if (line.isBlank())
				continue;
			
			if(block)
				count++;
			
			if(line.contains(COMMENT_BEGIN) && line.contains(COMMENT_END))
				singleCommentsCount++;		
			else if(line.contains(COMMENT_BEGIN)) {
				blockCommentsCount++;
				count++;
				block = true;
			}
			else if(line.contains(COMMENT_END)) {
				singleCommentsWithinBlockCount += count;
				count = 0;
			}
		}
		
	}
}
