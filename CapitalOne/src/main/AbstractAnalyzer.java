package main;

/**
 * @author ahmedelehwany 
 * 
 * Abstract Super class for general Analyzer logic.
 */
public abstract class AbstractAnalyzer implements Analyzer {

	protected int totalLinesCount = 0;
	protected int singleCommentsCount = 0;
	protected int singleCommentsWithinBlockCount = 0;
	protected int blockCommentsCount = 0;
	protected int todosCount = 0;

	/**
	 * Getter for totalLinesCount
	 */
	public int getTotalLinesCount() {
		return this.totalLinesCount;
	}

	/**
	 * Getter for singleCommentsCount
	 */
	public int getSingleCommentsCount() {
		return this.singleCommentsCount;
	}

	/**
	 * Getter for singleCommentsWithinBlockCount
	 */
	public int getSingleCommentsWithinBlockCount() {
		return this.singleCommentsWithinBlockCount;
	}

	/**
	 * Getter for blockCommentsCount
	 */
	public int getBlockCommentsCount() {
		return this.blockCommentsCount;
	}

	/**
	 * Getter for todosCount
	 */
	public int getTodosCount() {
		return this.todosCount;
	}

	/**
	 * Getter for totalCommentsCount
	 */
	public int getTotalCommmentsCount() {
		return this.singleCommentsCount + this.singleCommentsWithinBlockCount;
	}
}
