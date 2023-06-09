import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatImpl implements Animal
{
	byte age;

    public CatImpl(byte age)
    {
        this.age = age;
    }

    @Override
    public void sound()
    {
        System.out.println("Mnau");

    }

    @Override
    public String toString()
    {
        return "CatImpl age=" + age;
    }

    @Override
    public void toFile()
    {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Mnau");
            printWriter.println();
            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}