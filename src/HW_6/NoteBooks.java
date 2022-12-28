package HW_6;

import java.util.*;

public class NoteBooks {
    private String brand;
    private String model;
    private String screenResolution;
    private String processor;
    private String ram;
    private String hardDrive;
    private double price;
    private String operatingSystem;
    private String color;

    public NoteBooks() {
    }

    public NoteBooks(String brand, String model, String screenResolution, String processor,
                     String ram, String hardDrive, double price, String operatingSystem, String color) {
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
        return brand.equals(noteBooks.brand) && model.equals(noteBooks.model) && Objects.equals(screenResolution, noteBooks.screenResolution) && processor.equals(noteBooks.processor) && ram.equals(noteBooks.ram) && hardDrive.equals(noteBooks.hardDrive) && Objects.equals(color, noteBooks.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, screenResolution, processor, ram, hardDrive, color);
    }

    public Object filter(Set<NoteBooks> noteBooks) {
        Scanner scanner = new Scanner(System.in);
        Set<NoteBooks> setNotebooks = new HashSet<>(noteBooks);

        System.out.println("Введите номер или номера критериев фильрации ноутбуков:\n" +
                           "1 - ОЗУ\n" +
                           "2 - Объем ЖД\n" +
                           "3 - Операционная система\n" +
                           "4 - Цвет");
        String userChoice = scanner.nextLine();

        for (int i = 0; i < userChoice.length(); i++) {
            if (Character.getNumericValue(userChoice.charAt(i)) == 1) {
                System.out.println("Введите минимальный размер ОЗУ в Гб\nВ наличии : 4, 8, 16 ");
                String enterRam = scanner.nextLine();
                for (NoteBooks tempNote : noteBooks) {
                    if (!enterRam.equals(tempNote.ram) && Integer.parseInt(tempNote.ram) < Integer.parseInt(enterRam)) {
                        setNotebooks.remove(tempNote);
                    }
                }
            }
            if (Character.getNumericValue(userChoice.charAt(i)) == 2) {
                System.out.println("Введите минимальный объем ЖД в Гб\nВ наличии : 320, 500, 640 ");
                String enterHardDrive = scanner.nextLine();
                for (NoteBooks tempNote : noteBooks) {
                    if (!enterHardDrive.equals(tempNote.hardDrive) && Integer.parseInt(tempNote.hardDrive) < Integer.parseInt(enterHardDrive)) {
                        setNotebooks.remove(tempNote);
                    }
                }
            }
            if (Character.getNumericValue(userChoice.charAt(i)) == 3) {
                System.out.println("Введите Операционную систему\nВ наличии : Windows, Linux, MsDos ");
                String enterOS = scanner.nextLine();
                for (NoteBooks tempNote : noteBooks) {
                    if (!enterOS.equals(tempNote.operatingSystem)) {
                        setNotebooks.remove(tempNote);
                    }
                }
            }
            if (Character.getNumericValue(userChoice.charAt(i)) == 4) {
                System.out.println("Введите Цвет\nВ наличии : silver, black, white ");
                String enterColor = scanner.nextLine();
                for (NoteBooks tempNote : noteBooks) {
                    if (!enterColor.equals(tempNote.color)) {
                        setNotebooks.remove(tempNote);
                    }
                }
            }
        }
        if (setNotebooks.isEmpty()){
            return "Такого ноутбука нет в наличии ";
        }
        return setNotebooks;
    }
    @Override
    public String toString() {
        return "\n{brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", screenResolution='" + screenResolution + '\'' +
               ", processor='" + processor + '\'' +
               ", ram='" + ram + '\'' +
               ", hardDrive='" + hardDrive + '\'' +
               ", price=" + price +
               ", operatingSystem='" + operatingSystem + '\'' +
               ", color='" + color + '\'' + "}, ";
    }
}

