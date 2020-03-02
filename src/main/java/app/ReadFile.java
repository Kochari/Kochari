package myPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Random rd = new Random();
        int f,f1;

        List<Integer> rand = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {

            rand.add(rd.nextInt((30 + 30) + 1) - 30);
        }
        FileWriter fw = new FileWriter("numbers.txt");


        for (int i = 0; i < rand.size(); i++) {
            fw.write(String.valueOf(rand));
        }

        FileReader fr = new FileReader("numbers.txt");
        while ((f = fr.read()) != -1)
            System.out.print((char) f);

        fr.close();
        Collections.sort(rand);
        System.out.println();
        FileWriter fw1 = new FileWriter("SortedNumbers.txt");


        for (int i = 0; i < rand.size(); i++) {
            fw1.write(String.valueOf(rand));
        }

        FileReader fr1 = new FileReader("SortedNumbers.txt");
        while ((f1 = fr1.read()) != -1)
            System.out.print((char) f1);

        fr1.close();
    }
}
