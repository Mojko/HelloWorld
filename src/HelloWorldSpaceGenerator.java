
public class HelloWorldSpaceGenerator {
	private String letters;
	public HelloWorldSpaceGenerator(Letter[] letters){
		this.letters = HelloWorldLetterManagerFactory.getInstance().lettersToString(letters);
	}
}
