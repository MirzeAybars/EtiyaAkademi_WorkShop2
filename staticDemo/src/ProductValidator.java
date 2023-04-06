public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok calisti");
    }
    public ProductValidator() {
        System.out.println("Yapıcı blok çalişti");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void bisey() {

    }

}
