import java.util.ArrayList;
import java.util.List;
import static input.InputUtils.intInput;
public class TireComparison {
    public static void main(String[] args) {

//        Tire example = new Tire("Bridgestone", 40, 10000);
//        System.out.println(example.pricePer1000M());
//        System.out.println(example);
//        System.out.println(example.costForSet());

        List<Tire> tireList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
        }while (yesNoInput("More tires to add to compare?"));

        printReportTable();
    }

    private static Tire printReportTable() {
        String name = stringInput("Enter name of tire");
        double price = positiveDoubleInput("Enter price of " + name + "?");
        int warranty = positiveIntInput("Enter number of miles warranty?");

        Tire tire = new Tire(name, price, warranty);
        return tire;
    }

    private static Tire getTireInfo() {
        return null;
    }
}
