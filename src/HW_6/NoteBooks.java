package HW_6;

import java.util.Objects;

public class NoteBooks {
    int id;
    String brand;
    String model;
    String screenResolution;
    String processor;
    String ram;
    String hardDrive;
    double price;
    String operatingSystem;
    String color;

    public NoteBooks() {
    }

    public NoteBooks(int id, String brand, String model, String screenResolution, String processor,
                     String ram, String hardDrive, double price, String operatingSystem, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.screenResolution = screenResolution;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBooks noteBooks = (NoteBooks) o;
        return id == noteBooks.id && brand.equals(noteBooks.brand) && model.equals(noteBooks.model) && Objects.equals(screenResolution, noteBooks.screenResolution) && processor.equals(noteBooks.processor) && ram.equals(noteBooks.ram) && hardDrive.equals(noteBooks.hardDrive) && Objects.equals(color, noteBooks.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, screenResolution, processor, ram, hardDrive, color);
    }

    @Override
    public String toString() {
        return "\nNoteBooks{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", price=" + price +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

