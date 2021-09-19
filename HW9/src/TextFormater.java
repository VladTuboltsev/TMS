/*
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
*/


import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextFormater {
    public static int countWord(String line) {
        String[] words = line.split("\\s+");
        return words.length;
    }


    public static boolean polindromCheck(String line) {
        String[] words = line.replaceAll("[^A-Za-zА-Яа-я0-9\\s]","").split("\\s+");
        StringBuilder builder;
        for(String word : words) {
            builder = new StringBuilder(word);
            if (builder.reverse().toString().equals(word) && word.length() > 1) {
                return true;
            }
        }
        return false;
    }
}
