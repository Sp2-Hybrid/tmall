package tmall.comparator;

import tmall.bean.Product;

import java.util.Comparator;

public class ProductDateComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCreateDate().compareTo(o2.getCreateDate());
    }
}
