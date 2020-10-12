package test;

import junit.framework.*;
import main.Analyzer;
import main.AnalyzerFactory;

/**
 * @author ahmedelehwany
 * Test module for sampleFile2.java
 * Note: {fileName} string field should be set to the location on disk of sampleFile2.java 
 */
public class Sample2Test extends TestCase {

	// Note: {fileName} string field should be set to the location on disk of sampleFile2.java 
	private String fileName = "/Users/ahmedelehwany/Desktop/Main/projects/CapitalOneAssessment/sampleFile2.java";

	public void testGetTotalLinesCountSample2() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(40, analyzer.getTotalLinesCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetSingleCommentsCountSample2() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(5, analyzer.getSingleCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetSingleCommentsWithinBlockCountSample2() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(18, analyzer.getSingleCommentsWithinBlockCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetBlockCommentsCountSample2() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(4, analyzer.getBlockCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTotalCommmentsCountSample2() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(23, analyzer.getTotalCommmentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTODOsCountSample2() {
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
