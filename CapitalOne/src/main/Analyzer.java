package main;

/**
 * @author ahmedelehwany 
 * Interface for Analyzer api logic
 */
public interface Analyzer {

	public void run();

	public int getTotalLinesCount();

	public int getSingleCommentsCount();

	public int getSingleCommentsWithinBlockCount();

	public int getBlockCommentsCount();

	public int getTodosCount();

	public int getTotalCommmentsCount();

}
