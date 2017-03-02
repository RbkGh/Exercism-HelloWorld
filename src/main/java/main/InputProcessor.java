package main;

import com.sun.istack.internal.Nullable;
import strategies.NonNullStrategy;
import strategies.NullOrEmptyStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 9:13 AM
 */
public class InputProcessor {

    public String getInputResponse(String input) {
        return this.getStrategy(input).getOutputString(input);
    }

    protected InputProcessorStrategy getStrategy(@Nullable String input) {
        InputProcessorStrategy inputProcessorStrategy = this.getMapOfInputStrategies().getOrDefault(input,new NonNullStrategy());
        InputProcessorStrategyContext inputProcessorStrategyContext = new InputProcessorStrategyContext();
        inputProcessorStrategyContext.setInputProcessorStrategy(inputProcessorStrategy);
        return inputProcessorStrategy;
    }

    protected Map<String,InputProcessorStrategy> getMapOfInputStrategies(){
        Map<String,InputProcessorStrategy> mapOfStrategies = new HashMap<>();
        mapOfStrategies.put("", new NullOrEmptyStrategy());
        mapOfStrategies.put(null, new NullOrEmptyStrategy());
        return mapOfStrategies;
    }
}
