import java.io.*;

public class DAO {
    public String getText(String filePath)  {
        FileInputStream inputStream = null;
        try{
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        InputStreamReader reader = new InputStreamReader(inputStream);
        StringBuilder text = new StringBuilder();
        int i = 0;
        while (true){
            try{
                if((i = reader.read()) != -1)
                    break;
            } catch (IOException exception){
                System.out.println("Ошибка чтения файла");
            }
            text.append((char) i);
        }
        return  text.toString();
    }

    public void setText(String filePath, String text) throws IOException{
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(text);
        writer.write("\n");
        writer.flush();
        writer.close();
    }
}
