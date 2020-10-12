package main;
public class Main {

	public static void main(String[] args) {
		String fileName = args[0];
		try {
			new FileAnalyzer(fileName).run();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return;
	}

}
