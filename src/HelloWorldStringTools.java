
public class HelloWorldStringTools {

	public Letter[] getModifiedString(Letter[] letters){
		boolean toUpper = true;
		for(int i=0;i<letters.length;i++){
			char s;
			if(!toUpper){
				s = (letters[i].getChar() + "").toLowerCase().charAt(0); 
			} else {
				s = (letters[i].getChar() + "").toUpperCase().charAt(0); 
				toUpper = false;
			}
			if(s == ' ')
				toUpper = true;
			letters[i].setChar(s);
		}
		return letters;
	}
}
