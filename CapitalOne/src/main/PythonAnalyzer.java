package main;
import java.util.List;

/**
 * @author ahmedelehwany
 * 
 * Analyzer class specialized in Python comments and code analysis
 */
public class PythonAnalyzer extends AbstractAnalyzer implements Analyzer {
	
	private static final String SINGLE_COMMENT = "#";
	private static final String TODO = "TODO:";
	
	private List<String> lines;

	public PythonAnalyzer(List<String> lines) {
		this.lines = lines;
	}

	/**
	 * Executes Python comment analysis logic 
	 * and sets the comment counter fields.
	 */
	@Override
	public void run() {
		int count = 0;
		for(String line : lines) {
			totalLinesCount++;
			line = line.trim();
			
			if(line.startsWith(SINGLE_COMMENT))
				count++;
			else if (line.contains(SINGLE_COMMENT))
				singleCommentsCount++;
			else if (count > 0) {
				if(count == 1)
					singleCommentsCount++;
				else {
					blockCommentsCount++;
					singleCommentsWithinBlockCount += count;
				}
				count = 0;
			}
			
			if(line.contains(TODO))
				todosCount++;		
		}
	}
}
