import java.util.function.Supplier;

public class MyClass {
    public static <T> T factoryMethod(Supplier<T> supplier) {
        return supplier.get();
    }
}
