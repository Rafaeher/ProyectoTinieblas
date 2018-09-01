package utils;

import java.io.*;
import java.util.Random;

public class LectorEjemplos
{
    public static String getNombreMasculinoEsp()
    {
        return getNombre("nombresMasculinosEsp.txt");
    }

    public static String getNombreFemeninoEsp()
    {
        return getNombre("nombresFemeninosEsp.txt");
    }

    public static String getConceptos()
    {
        return getNombre("conceptos.txt");
    }

    private static String getNombre(String fichero)
    {
        FileReader fileReader = null;
        String nombre = null;

        try
        {
            fileReader = new FileReader (new File(fichero));

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i = 0, n = new Random().nextInt(Integer.parseInt(bufferedReader.readLine()));

            while(i != n)
            {
                nombre = bufferedReader.readLine();
                i++;
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            try
            {
                if(fileReader != null)
                {
                    fileReader.close();
                }
            }
            catch (Exception exception2)
            {
                exception2.printStackTrace();
            }
        }

        return nombre;
    }
}
