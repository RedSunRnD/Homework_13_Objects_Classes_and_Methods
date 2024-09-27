public class Main {
    public static void main(String[] args) {
        Author sergeyLukyanenko = new Author("Сергей", "Лукьяненко");
        Author viktorPelevin = new Author("Виктор", "Пелевин");
        Author sergeyDovlatov = new Author("Сергей", "Довлатов");
        Book nochnoyDozor = new Book("Ночной Дозор", sergeyLukyanenko, 1998);
        Book generationP = new Book("Generation П", viktorPelevin, 1990);
        Book dozori = new Book("Ночной Дозор", sergeyLukyanenko, 1998);
        System.out.println("nochnoyDozor.equals(dozori) = " + nochnoyDozor.equals(dozori));
        System.out.println("sergeyDovlatov = " + sergeyDovlatov);
        System.out.println("generationP = " + generationP);
        System.out.println("sergeyDovlatov.equals(sergeyLukyanenko) = " + sergeyDovlatov.equals(sergeyLukyanenko));
    }
}