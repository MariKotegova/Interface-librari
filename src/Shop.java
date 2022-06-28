public class Shop<Y> implements Supplier<Y>{

    private Y name;

    public void setName (Y name){
        this.name = name;
    }



    @Override
    public void booc(Y t) {
        System.out.println("Поставщик " + name + " привозит книги в библиотеку по запросу зиблиотекаря " + t);

    }
}
