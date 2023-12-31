package array_mvc.models;

public class Product implements Comparable<Product>{
    private Integer id;
    private String name;
    private Long price;

    public Product() {
    }

    public Product(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm : id = " + id + ", tên = " + name + ", giá = " + price;
    }

    @Override
    public int compareTo(Product o) {
        return (int) (o.getPrice() - this.getPrice());
    }
}
