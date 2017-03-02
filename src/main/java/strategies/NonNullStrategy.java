package strategies;

import extra.InputResponses;
import main.InputProcessorStrategy;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 9:05 AM
 */
public class NonNullStrategy implements InputProcessorStrategy {

    @Override
    public String getOutputString(String input) {
        return InputResponses.getNonNullInputResponse(input);
    }
}
