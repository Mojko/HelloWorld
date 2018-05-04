
public class HelloWorldParserFactorySingleton {
	private static HelloWorldParserFactory instance;
	public static HelloWorldParserFactory getInstance(){
		if(null == instance)
			instance = new HelloWorldParserFactory();
		return instance;
	}
}
