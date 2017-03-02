import main.InputProcessor;

public class HelloWorld {

    public static String hello(String name) {
        InputProcessor inputProcessor = new InputProcessor();
        return inputProcessor.getInputResponse(name);
    }
}
