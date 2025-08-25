package _03_generic;

public class Product<K,M> {
    private K kind;
    private M model;
    public Product() {}

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Product{" +
                "kind=" + kind +
                ", model=" + model +
                '}';
    }
}
