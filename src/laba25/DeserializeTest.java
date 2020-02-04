package laba25;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.*;
import java.util.Scanner;

public class DeserializeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя файла?");
        String fileName = scanner.nextLine();
        File file = new File("src/laba25/" + fileName);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            CreditCard creditCard= (CreditCard) objectInputStream.readObject();
            System.out.println(creditCard.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
