public class Main {

    public static void main (String [] args){
        Shop<String> shop = new Shop<String>();
        shop.setName("Книги на миллион");

        LibrarianName<String> librarianName = new LibrarianName<String>("Сергей Петрович");
        shop.booc(librarianName.getName());

        librarianName.OrderBook(5);
        Admin <String> admin = new Admin<String>();
        admin.setName("Артур");

        admin.error(librarianName.getName());

    }
}
