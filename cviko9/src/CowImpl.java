import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CowImpl implements Animal
{
    byte age;

    public CowImpl(byte age)
    {
        this.age = age;
    }

    @Override
    public void sound()
    {
        System.out.println("Muu");

    }

    @Override
    public String toString()
    {
        return "CowImpl age=" + age;
    }

    @Override
    public void toFile()
    {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Muu");
            printWriter.println();
            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
