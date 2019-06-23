import java.text.DecimalFormat;
import java.util.ArrayList;

public class Checkout {
    public static ArrayList<Cake> basket = new ArrayList<>();
    public static int noOfCakes = basket.size();
    public static DecimalFormat df = new DecimalFormat("£#,###.00");

    public static void main(String[] args) {
        basket.add(new Cake("Chocolate Cake", "Chocolate", "100g", "Belgium", 22.50d));
        basket.add(new Cake("Strawberry Cheesecake", "Strawberry", "25g", "UK", 10.50d));
        basket.add(new Cake("Victoria Sponge", "Vanilla", "50g", "Scotland", 15.50d));
        basket.add(new Cake("Birthday Cake", "Madagascan Vanilla", "75g", "Spain", 100.25d));

        System.out.println("Cake Name       " + "Sugar Content          " + "Flavour        " + "Origin         " + "Price");
        listAllCake();
        calculateTotal();
        removeAllCake();
        System.out.println(basket);

    }


    public static void calculateTotal() {
        int discount = 0;
        double totalBeforeDiscount = 0d;
        double totalAfterDiscount = 0d;
        noOfCakes = basket.size();
        if (noOfCakes < 3d) {
            discount = noOfCakes % 3;
        } else if (noOfCakes < 10d) {
            discount = noOfCakes % 3 + 10;
        } else if (noOfCakes > 20d) {
            discount = 40;
        }

        for (int i = 0; i < basket.size(); i++) {
            totalBeforeDiscount += basket.get(i).getPrice();
            totalAfterDiscount = totalBeforeDiscount - (totalBeforeDiscount * discount / 100d);
        }

        System.out.println(" The discount applied is: " + discount + "%");
        System.out.println("The total price of the basket before a discount is: " + df.format(totalBeforeDiscount));
        System.out.println("The total price of the basket after a discount is: " + df.format(totalAfterDiscount));

    }


    /*public static*/

 /*   public static void removeACake(){

    }*/


    //Delete
    public static void removeAllCake() {
        basket.clear();
    }

    //Read
    public static void listAllCake() {
        //add read arrayList method
        String content;
        for (int i = 0; i < basket.size(); i++) {
            content = basket.get(i).getCakeName() + "        " + basket.get(i).getSugarContent() + "        " + basket.get(i).getFlavour() + "      " + basket.get(i).getOrigin() + "        " + df.format(basket.get(i).getPrice());
            System.out.println(content);
        }

    }
}
