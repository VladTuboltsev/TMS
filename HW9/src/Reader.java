/*4)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл*/

import java.io.*;


public class Reader {
    public static void main(String[] args) throws IOException {
       DAO dao = new DAO();
       String text = dao.getText("./string.txt");
       String[] lines = text.split("[.!?]+");

       for(String line : lines){
           if(TextFormater.polindromCheck(line) ||
                   (TextFormater.countWord(line) >=3 && TextFormater.countWord(line)<=5)){
               dao.setText("./newTextFile.txt", line);
           }
       }
    }
}
