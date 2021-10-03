package HomeWork15;

import java.time.LocalDate;
import java.time.Year;

public class prodrammersDay {
    public static void main(String[] args) {
        Year year = Year.of(2020);
        if(year.isLeap()==true){
            System.out.println(year.atDay(256));
        }else{
            System.out.println(year.atDay(256));
        }
    }
}
