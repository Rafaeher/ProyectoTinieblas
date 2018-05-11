package command;

import context.Request;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * The implementation of the abstract factory of commands using dynamic load.
 */
public class CommandFactoryImp extends CommandFactory
{

    @Override
    public Command getCommand(Request request)
    {
        Command command = null;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String className = null;
        Properties properties = new Properties();
        try
        {
            properties.load(new FileReader("dynamicLoad/commands.properties"));
            className = properties.getProperty(getCommandName(request));

            Class loadedClass = classLoader.loadClass(className);
            Class.forName(className);
            command = (Command) loadedClass.newInstance();
        }
        catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        return command;
    }

    /**
     * Returns the name of a command corresponding to a request
     *
     * @param request the type of a business request
     * @return the name of a command corresponding to the request
     */
    private static String getCommandName(Request request)
    {
        switch(request)
        {
            default: return "Default";
        }
    }
}
