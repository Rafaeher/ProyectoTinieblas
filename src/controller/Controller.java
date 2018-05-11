package controller;

import context.Context;

/**
 * This class is the controller of the programme. It is an Application Controller.
 */
public abstract class Controller
{
    private static Controller instance;

    /**
     * This method creates an instance if needed and returns it.
     *
     * @return the singleton instance.
     */
    public static Controller getInstance()
    {
        if(instance == null)
            instance = new ControllerImp();

        return instance;
    }


    /**
     * Given a context, this method acts consequently.
     *
     * @param context: the context to perform the action.
     */
    public abstract void action(Context context);
}
