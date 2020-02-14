package laba16;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Литерал";
        String str2 = new String("new");
        char data[] = {'a', 'b', 'c'};
        String str3 = new String(data);

        String tmp = "abc";
        String str4 = new String(tmp.getBytes());

        StringBuilder builder = new StringBuilder("abc");
        String str5 = new String(builder);


        //***************************************

        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] arrFruits = fruits.split(",");
        String maxLength = "";
        for (int i = 0; i < arrFruits.length; i++) {
            if (maxLength.length() < arrFruits[i].length())
                maxLength = arrFruits[i];
        }
        System.out.println(maxLength.toLowerCase());

        for (int i = 0; i < arrFruits.length; i++) {
            System.out.println(arrFruits[i].substring(0, 3));
        }

        String strWithSpaces = " Я_новая_строка     ";
        strWithSpaces = strWithSpaces.trim();
        System.out.println(strWithSpaces);
        strWithSpaces = strWithSpaces.replace("_", " ");
        System.out.println(strWithSpaces);

        System.out.print("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String strScan = scanner.nextLine();
        System.out.format("\nВы ввели: <%s>", strScan);
        System.out.println();
        if (strScan.contains("Запуск"))
            System.out.println("Запускаем процесс");
        if (strScan.contains("завершен"))
            System.out.println("Процесс завершен");
        if (strScan.toLowerCase().contains("ошибка"))
            System.out.println("Произошла ошибка");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(str1).append(str2).append(str3).append("\n")
                .append(str4).append(str5).append(strWithSpaces).append("\n")
                .append(strScan);
        System.out.println(stringBuilder);
        String finalString=new String(stringBuilder.reverse());
        System.out.println(finalString);


    }


}

