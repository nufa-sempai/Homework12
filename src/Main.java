public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Author tolstoy = new Author("Лев", "Толстой");
        Author tolstoy2 = new Author("Лев", "Толстой");

        Book crimeAndPunishment = new Book("Преступление и наказание", 1866, dostoevsky);
        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);

        System.out.println(tolstoy.equals(tolstoy2));

        System.out.println(crimeAndPunishment);
        System.out.println(warAndPeace);

        crimeAndPunishment.setPublishingYear(1900);

        System.out.println(crimeAndPunishment);
    }
}