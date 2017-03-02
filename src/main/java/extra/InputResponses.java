package extra;

import com.sun.istack.internal.Nullable;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 8:54 AM
 */
public class InputResponses {
    public static final String DEFAULT_PRE_RESPONSE = "Hello, ";

    public static String getDefaultResponse() {
        return DEFAULT_PRE_RESPONSE + "World!";
    }

    public static String getNonNullInputResponse(@Nullable String input) {
        return DEFAULT_PRE_RESPONSE + input+"!";
    }
}
