import java.time.LocalDate;
public class House {
    private int quantityFloors;
    private int yearOfConstruction;
    private String name;

    public House(int quantityFloors, int yearOfConstruction, String name) {
        this.quantityFloors = quantityFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.name = name;
    }

    public int getQuantityFloors() {
        return quantityFloors;
    }

    public void setQuantityFloors(int quantityFloors) {
        this.quantityFloors = quantityFloors;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - yearOfConstruction;
    }

    public void printHouseDetails() {
        System.out.println("Название: " + name);
        System.out.println("Кол-во этажей: " + quantityFloors);
        System.out.println("Год постройки: " + yearOfConstruction);
        System.out.println("Возраст дома: " + getAge() + " лет");
    }
}
