package laba25;

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
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
