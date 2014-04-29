package tempconvgui;

/**
 *
 * @author Instlogin
 */
public class NumberGuessService {
    private int correctValue = 8;
    
    public NumberGuessResult checkGuess(String guess) throws NumberFormatException {
        int intGuess = Integer.valueOf(guess.trim());
        NumberGuessResult result = NumberGuessResult.CORRECT;
        
        if(intGuess > correctValue) {
            result = NumberGuessResult.HIGH;
        } else if(intGuess < correctValue) {
            result = NumberGuessResult.LOW;
        }
        
        return result;
    }
}
