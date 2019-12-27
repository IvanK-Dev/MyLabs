package laba7;

import com.google.gson.Gson;

public class Laba7 {
    public static void main(String[] args) {
        Book book=new Book();
        Client client=new Client();
        PostOffice postOffice=new PostOffice();

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

    }
}
