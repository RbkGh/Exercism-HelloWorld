package strategies;

import extra.InputResponses;
import main.InputProcessorStrategy;

/**
 * When the input to {@link InputProcessorStrategy#getOutputString(String)} is empty or null,this strategy processes it.
 *
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 8:50 AM
 */
public class NullOrEmptyStrategy implements InputProcessorStrategy {
    @Override
    public String getOutputString(String input) {
        return InputResponses.getDefaultResponse();
    }
}
