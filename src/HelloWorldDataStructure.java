
public class HelloWorldDataStructure {
	
	public static final HelloWorldDataStructure SUCESSFUL = new HelloWorldDataStructure(1);
	public static final HelloWorldDataStructure FAILED = new HelloWorldDataStructure(0);
	
	private int id;
	public HelloWorldDataStructure(int id){
		this.id = id;
	}
}
