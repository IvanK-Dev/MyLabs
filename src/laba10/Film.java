package laba10;

public class Film {
    public static final String COM = "Comedy";
    public static final String HOR = "Horror";
    public static final String FANT = "Fantastic";

    private String title;
    private double time;
    private String genre;

    {
        System.out.println("Создается новый фильм");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Film(String title, double time, String genre) {
        this.title = title;
        this.time = time;
        this.genre = genre;
        System.out.println("Фильм " + title + " успешео создан");
    }

    @Override
    public String toString() {
        return "Название - "+title+
                "время - "+ time+
                "жанр - "+ genre;
    }
}
