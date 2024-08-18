package NewLearn.Learn85;

/**
 * public class Product<T> implements MyComparable<T>
 * 如果不确定泛型写成这种形式
 */
public class Product implements MyComparable<Product> {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return price - o.price;
    }
}
