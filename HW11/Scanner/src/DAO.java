import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DAO {


    public String ReadText(String filePath) throws FileNotFoundException {
        FileReader fileIn= new FileReader(filePath);
        Scanner sc = new Scanner(fileIn);
        String text = sc.useDelimiter("\\A").next();
        return text.toString();
    }

    public void WriteText(String filePath, String text) throws IOException{
        FileWriter fileW= new FileWriter(filePath, true);
        fileW.write(text);
        fileW.write("\n");
        fileW.flush();
        fileW.close();
    }

}
