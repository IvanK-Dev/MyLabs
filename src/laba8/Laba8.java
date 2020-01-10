package laba8;

import com.google.gson.Gson;

public class Laba8 {
    public static void main(String[] args) {
        Book book = new Book();
        Client client = new Client();
        PostOffice postOffice = new PostOffice();

        Client client1 = new Client("Петр", "Петров");
        Client client2 = new Client("Vas", "Vasvas");

        //book.name="Книга";
//        book.price=50;

        book.setName("Книга");
        book.setPrice(50);
        System.out.println(book.getClass());
        System.out.println((new Gson()).toJson(book));
        System.out.println(client.getClass());
        System.out.println((new Gson()).toJson(client));
        System.out.println(postOffice.getClass());
        System.out.println((new Gson()).toJson(postOffice));

        client.setVIP(true);

        client1.isVIP();
        client.isVIP();

        System.out.println(postOffice.infoPOffice());

        client.sendAboutPost();

        client1.sendAboutPost("Пришла посылка");

        Client.staticMethod();
        Client.numberOfClients();

    }
}
