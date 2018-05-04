
public class HelloWorldParser {
	public HelloWorldDataStructure parse(Letter[] helloworld){
		String s = HelloWorldLetterManagerFactory.getInstance().lettersToString(helloworld);
		try {
			if(s.equalsIgnoreCase(HelloWorld.DEFAULT_TEXT)){
				return HelloWorldDataStructure.SUCESSFUL;
			} else {
				throw new HelloWorldException("Error hello world not found");
			}
		} catch(HelloWorldException e) {
			e.printStackTrace();
		}
		return HelloWorldDataStructure.FAILED;
	}
}
