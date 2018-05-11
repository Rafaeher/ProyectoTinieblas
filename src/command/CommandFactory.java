package command;

import context.Request;

/**
 * This is an abstract factory for the commands.
 */
public abstract class CommandFactory
{
    CommandFactory instance; // Instance of the singleton.

    /**
     * This method creates an instance if needed and returns it.
     *
     * @return the singleton instance.
     */
    public CommandFactory getInstance()
    {
        if (instance == null)
            instance = new CommandFactoryImp();

        return instance;
    }

    /**
     * Returns a command depending on the request
     *
     * @param request the type of a request
     * @return the respective command to the request
     */
    public abstract Command getCommand(Request request);
}
