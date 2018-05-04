
public class HelloWorldPrinter implements IPrinter {

	@Override
	public void print(Letter[] message) {
		HelloWorldParser parser = HelloWorldParserFactorySingleton.getInstance().createParser();
		if(parser.parse(message) == HelloWorldDataStructure.SUCESSFUL){
			System.out.println(HelloWorldLetterManagerFactory.getInstance().lettersToString(message));
		}
	}
}
