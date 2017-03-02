package main;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 8:45 AM
 */
public interface InputProcessorStrategy {
    /**
     * process and get the output or resultant string based on the input given
     * @param input the string to be processed
     * @return Resultant string
     */
    String getOutputString(String input);
}
