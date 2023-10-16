package pb1.trabajo.practico4.dominio;

public class Letra {
	private char character;
	
	public Letra (char character) {
		this.character = character;
	}
	
    public boolean esVocal() {
        char lowercaseChar = Character.toLowerCase(character);
        switch (lowercaseChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
