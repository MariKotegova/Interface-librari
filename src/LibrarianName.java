public class LibrarianName <T> implements Librarian{

    private T name;

    public LibrarianName(T name){
        this.name = name;
    }

    public T getName (){
        return name;
    }

    @Override
    public void OrderBook(int x){
        System.out.println("Библиотекарь " + name + " заказал " + x + " книг");
    }
}
