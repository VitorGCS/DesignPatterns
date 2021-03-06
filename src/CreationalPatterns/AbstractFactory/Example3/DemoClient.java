package CreationalPatterns.AbstractFactory.Example3;

import CreationalPatterns.AbstractFactory.Example3.factories.GUIFactory;
import CreationalPatterns.AbstractFactory.Example3.factories.MacOSFactory;
import CreationalPatterns.AbstractFactory.Example3.factories.WindowsFactory;
import CreationalPatterns.AbstractFactory.Example3.app.Application;

/**
 * Demo class. Everything comes together here.
 */
public class DemoClient {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
