public class SingletonSize {
    private static SingletonSize ourInstance = new SingletonSize();


    public static SingletonSize getInstance() {
        return ourInstance;
    }

    private SingletonSize() {
    }
}
