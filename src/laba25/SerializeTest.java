package laba25;

import java.io.*;
import java.util.Scanner;

public class SerializeTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Имя файла?");
        String fileName=scanner.nextLine();
        File file= new File("src/laba25/" + fileName);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(creditCard);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
