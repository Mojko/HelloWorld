import java.util.ArrayList;

public class HelloWorldLetterManagerFactory {

	private static HelloWorldLetterManagerFactory instance = new HelloWorldLetterManagerFactory();
	
	public Letter getLetter(byte l){
		switch(l){
		case HelloWorldAlphabetManager.A:
			return new Letter('A');
		case HelloWorldAlphabetManager.B:
			return new Letter('B');
		case HelloWorldAlphabetManager.C:
			return new Letter('C');
		case HelloWorldAlphabetManager.D:
			return new Letter('D');
		case HelloWorldAlphabetManager.E:
			return new Letter('E');
		case HelloWorldAlphabetManager.F:
			return new Letter('F');
		case HelloWorldAlphabetManager.G:
			return new Letter('G');
		case HelloWorldAlphabetManager.H:
			return new Letter('H');
		case HelloWorldAlphabetManager.I:
			return new Letter('I');
		case HelloWorldAlphabetManager.J:
			return new Letter('J');
		case HelloWorldAlphabetManager.K:
			return new Letter('K');
		case HelloWorldAlphabetManager.L:
			return new Letter('L');
		case HelloWorldAlphabetManager.M:
			return new Letter('M');
		case HelloWorldAlphabetManager.N:
			return new Letter('N');
		case HelloWorldAlphabetManager.O:
			return new Letter('O');
		case HelloWorldAlphabetManager.P:
			return new Letter('P');
		case HelloWorldAlphabetManager.Q:
			return new Letter('Q');
		case HelloWorldAlphabetManager.R:
			return new Letter('R');
		case HelloWorldAlphabetManager.S:
			return new Letter('S');
		case HelloWorldAlphabetManager.T:
			return new Letter('T');
		case HelloWorldAlphabetManager.U:
			return new Letter('U');
		case HelloWorldAlphabetManager.V:
			return new Letter('V');
		case HelloWorldAlphabetManager.W:
			return new Letter('W');
		case HelloWorldAlphabetManager.X:
			return new Letter('X');
		case HelloWorldAlphabetManager.Y:
			return new Letter('Y');
		case HelloWorldAlphabetManager.Z:
			return new Letter('Z');
		case HelloWorldAlphabetManager.SPACE:
			return new Letter(' ');
		}
		return null;
	}
	
	public Letter[] createLetterString(byte[] pattern, byte... bs){
		ArrayList<Letter> letters = new ArrayList<Letter>();
		//Letter[] letters = new Letter[bs.length];
		for(int i=0;i<bs.length;i++){
			try {
				if(pattern[i] != 1 && pattern[i] != 0){
					throw new HelloWorldPatternException("Pattern needs only 1 or 0");
				} else if(pattern[i] == 1) {
					letters.add(HelloWorldLetterManagerFactory.getInstance().getLetter(HelloWorldAlphabetManager.SPACE));
				}
			} catch (HelloWorldPatternException e){
				e.printStackTrace();
			}
			letters.add(getLetter(bs[i]));
		}
		return letters.toArray(new Letter[letters.size()]);
	}
	
	public String lettersToString(Letter[] letters){
		String str = "";
		for(int i=0;i<letters.length;i++){
			str += letters[i].getChar();
		}
		return str;
	}
	
	public static HelloWorldLetterManagerFactory getInstance(){
		return instance;
	}
}
