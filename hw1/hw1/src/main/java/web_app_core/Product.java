package web_app_core;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {

    private int id;
    private String title;
    private double cost;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
