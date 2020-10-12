package test;

import junit.framework.*;
import main.Analyzer;
import main.AnalyzerFactory;

/**
 * @author ahmedelehwany
 * 
 * Test module for sampleFile1.java
 * Note: {fileName} string field should be set to the location on disk of sampleFile1.java 
 */
public class Sample1Test extends TestCase {

	// Note: {fileName} string field should be set to the location on disk of sampleFile1.java 
	private String fileName = "/Users/ahmedelehwany/Desktop/Main/projects/CapitalOneAssessment/sampleFile1.java";

	public void testGetTotalLinesCountSample1() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(60, analyzer.getTotalLinesCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testGetSingleCommentsCountSample1() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(6, analyzer.getSingleCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testGetSingleCommentsWithinBlockCountSample1() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(22, analyzer.getSingleCommentsWithinBlockCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testGetBlockCommentsCountSample1() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(2, analyzer.getBlockCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testGetTotalCommmentsCountSample1() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(28, analyzer.getTotalCommmentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testGetTODOsCountSample1() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(1, analyzer.getTodosCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
