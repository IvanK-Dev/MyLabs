package laba10;

public class Library {
    private String libraryTitle = "My Films";//final мешает функционалу
    private Film[] filmArr;

    {
        filmArr = new Film[5];
        filmArr[0] = new Film("Favorite 1", 1.5, Film.FANT);
        filmArr[1] = new Film("Favorite 2", 2.1, Film.FANT);
        System.out.println("Добавлены любимые фильмы");
    }

    public Library(String libraryTitle) {
        this.libraryTitle = libraryTitle;
        System.out.println("Библиотека " + this.libraryTitle + " успешно создана");
    }

    public String getLibraryTitle() {
        return libraryTitle;
    }

    public void setLibraryTitle(String libraryTitle) {
        this.libraryTitle = libraryTitle;
    }

    public Film[] getFilmArr() {
        return filmArr;
    }

    public void setFilmArr(Film[] filmArr) {
        this.filmArr = filmArr;
    }

    public void setFilmInArr(int index, Film film) {
        this.filmArr[index] = film;
    }

    public boolean isEmptyCell(int index) {
        if (this.filmArr[index] == null) {
            return true;
        }
        return false;
    }

    public int findEmptyCell() {
        for (int i = 0; i < this.filmArr.length; i++) {
            if (isEmptyCell(i)) {
                System.out.println("пустая ячейка  - " + i);
                return i;
            }
        }
        return -1;
    }
}
