package Exceptions;

public class MyDatabase implements AutoCloseable{
    MyDatabase(){
        System.out.println("DB Connected...");
    }
    void query() throws DatabaseException {
        System.out.println("Running Query...");
        throw new DatabaseException("Connection Failed");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Closing DB Connection...");
    }

    public static void main(String[] args) {
        try (MyDatabase db = new MyDatabase()) {
            db.query();

        }catch (DatabaseException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
}
