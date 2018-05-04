
public class HelloWorld {

	public static final String DEFAULT_TEXT = "Hello World";
	
	public static void main(String[] args) {
		HelloWorldPrinter printer = new HelloWorldPrinter();
		Letter[] letters = HelloWorldLetterManagerFactory.getInstance().createLetterString(
			new byte[] {
				0,0,0,0,0,1,0,0,0,0
			},
			HelloWorldAlphabetManager.H,
			HelloWorldAlphabetManager.E,
			HelloWorldAlphabetManager.L,
			HelloWorldAlphabetManager.L,
			HelloWorldAlphabetManager.O,
			HelloWorldAlphabetManager.W,
			HelloWorldAlphabetManager.O,
			HelloWorldAlphabetManager.R,
			HelloWorldAlphabetManager.L,
			HelloWorldAlphabetManager.D
		);
		HelloWorldStringTools tools = new HelloWorldStringTools();
		letters = tools.getModifiedString(letters);
		printer.print(letters);
	}
}
