package test;

import junit.framework.*;
import main.Analyzer;
import main.AnalyzerFactory;

/**
 * @author ahmedelehwany
 * Test module for sampleFile4.html
 * Note: {fileName} string field should be set to the location on disk of sampleFile4.h 
 */
public class Sample4Test extends TestCase {

	// Note: {fileName} string field should be set to the location on disk of sampleFile4.html
	private String fileName = "/Users/ahmedelehwany/Desktop/Main/projects/CapitalOneAssessment/sampleFile4.html";

	public void testGetTotalLinesCountSample4() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(28, analyzer.getTotalLinesCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetSingleCommentsCountSample4() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(2, analyzer.getSingleCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetSingleCommentsWithinBlockCountSample4() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(6, analyzer.getSingleCommentsWithinBlockCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetBlockCommentsCountSample4() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(1, analyzer.getBlockCommentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTotalCommmentsCountSample4() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(8, analyzer.getTotalCommmentsCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTODOsCountSample4() {
		try {
			Analyzer analyzer = new AnalyzerFactory().getAnalyzer(fileName);
			analyzer.run();

			assertEquals(0, analyzer.getTodosCount());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
