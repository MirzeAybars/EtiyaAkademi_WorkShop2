public class MySqlCustomerDal implements ICustomerDal, IRepository {
//Birden fazla ınterface implement edilebilir..
    @Override
    public void add() {
        System.out.println("MySql Eklendi");
    }
}
