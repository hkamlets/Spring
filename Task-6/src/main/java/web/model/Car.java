package web.model;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private String colorview;

    public Car(String brand, String model, int year, String color, String colorview) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.colorview = colorview;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColorview() {
        return colorview;
    }

    public void setColorview(String colorview) {
        this.colorview = colorview;
    }
}