import java.io.*;

public class Run {
    public static void main(String[] args) {
        Car car = new Car("Cadilac", 90000, 320);
        try(ObjectOutputStream ser = new ObjectOutputStream(new FileOutputStream("data.txt"))){
            ser.writeObject(car);
            System.out.println("Произошла запись");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try(ObjectInputStream deser = new ObjectInputStream(new FileInputStream("data.txt"))){
            Car car1 = (Car)deser.readObject();
            car1.displayInfo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
