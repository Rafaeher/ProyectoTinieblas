package command;

import context.Context;

/**
 * An interface to execute orders.
 */
public interface Command
{
    /**
     * Executes an order given some input.
     *
     * @param input some input.
     * @return the respective Context, once the input has been treated.
     */
    Context execute(Object input);
}
