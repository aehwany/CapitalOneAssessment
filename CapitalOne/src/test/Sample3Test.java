package test;

import junit.framework.*;
import main.Analyzer;
import main.AnalyzerFactory;

/**
 * @author ahmedelehwany
 * Test module for sampleFile3.py
 * Note: {fileName} string field should be set to the location on disk of sampleFile3.py 
 */
public class Sample3Test extends TestCase {

	// Note: {fileName} string field should be set to the location on disk of sampleFile3.py
	private String fileName = "/Users/ahmedelehwany/Desktop/Main/projects/CapitalOneAssessment/sampleFile3.py";

	public void testGetTotalLinesCountSample3() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(61, analyzer.getTotalLinesCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetSingleCommentsCountSample3() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(9, analyzer.getSingleCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetSingleCommentsWithinBlockCountSample3() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(10, analyzer.getSingleCommentsWithinBlockCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetBlockCommentsCountSample3() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(3, analyzer.getBlockCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTotalCommmentsCountSample3() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(19, analyzer.getTotalCommmentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTODOsCountSample3() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(3, analyzer.getTodosCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
