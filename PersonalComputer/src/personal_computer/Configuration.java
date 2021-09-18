package personal_computer;

import java.util.Random;
import java.util.Scanner;

public class Configuration {
    private String processor;
    private String ram;
    private String hdd;
    private int cicle;


    public Configuration(String processor, String ram, String hdd, int cicle){
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.cicle = cicle;
    }

    public Configuration() {

    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public int getCicle() {
        return cicle;
    }

    public void setCicle(int cicle) {
        this.cicle = cicle;
    }

    void displayInfo() {
        System.out.printf("Конфигурая компьютера:\n%s\n%s\n%s\n%d\n", this.processor, this.ram, this.hdd, this.cicle);
    }
}