package laba10;

public class Main {
    public static void main(String[] args) {
        //Film f1=new Film("Something",1.25,Film.COM);
        Library library = new Library("Mу library");


        int flag = library.findEmptyCell();
        for (int i = flag; i < library.getFilmArr().length; i++) {
            if (library.isEmptyCell(i)) {
                Film film = new Film("New Favorite " + i, 1.5, Film.FANT);
                library.setFilmInArr(i, film);
            }
        }
        System.out.println("Вы достигли лимита");
        //library.findEmptyCell();
    }
}
