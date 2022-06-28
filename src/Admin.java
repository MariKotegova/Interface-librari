public class Admin<R> implements Administrator<R>{
    private R name;

    public void setName (R name) {
        this.name =name;
    }


    @Override
    public void error (R q){
        System.out.println("Администратор " + name + " уволил библиотекаря " + q + " за прогулы");
    }
}
