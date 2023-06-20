import java.util.Scanner;

public class Dmart {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your Name: ");
                String Name = sc.nextLine();
                System.out.println("Enter your Gender: ");
                char Gender = sc.next().charAt(0);

                // item amount

                int itemAmount1 = 10, itemAmount2 = 20, itemAmount3 = 30, itemAmount4 = 40, itemAmount5 = 50,
                                itemAmount6 = 60,
                                itemAmount7 = 70, itemAmount8 = 80, itemAmount9 = 90,
                                itemAmount10 = 100;

                // item quantity
                System.out.println("Enter 1st product Quantity");
                int item1 = sc.nextInt();

                System.out.println("Enter 2ns product Quantity");
                int item2 = sc.nextInt();

                System.out.println("Enter 3rd product Quantity");
                int item3 = sc.nextInt();

                System.out.println("Enter 4th product Quantity");
                int item4 = sc.nextInt();

                System.out.println("Enter 5th product Quantity");
                int item5 = sc.nextInt();

                System.out.println("Enter 6th product Quantity");
                int item6 = sc.nextInt();

                System.out.println("Enter 7th product Quantity");
                int item7 = sc.nextInt();

                System.out.println("Enter 8th product Quantity");
                int item8 = sc.nextInt();

                System.out.println("Enter 9th product Quantity");
                int item9 = sc.nextInt();

                System.out.println("Enter 10th product Quantity");
                int item10 = sc.nextInt();

                // total item
                int totalItem = (item1 + item2 + item3 + item4 + item5 + item6 + item7 + item8 + item9 + item10);

                int amountIntoQuantity1 = item1 * itemAmount1;
                int amountIntoQuantity2 = item2 * itemAmount2;
                int amountIntoQuantity3 = item3 * itemAmount3;
                int amountIntoQuantity4 = item4 * itemAmount4;
                int amountIntoQuantity5 = item5 * itemAmount5;
                int amountIntoQuantity6 = item6 * itemAmount6;
                int amountIntoQuantity7 = item7 * itemAmount7;
                int amountIntoQuantity8 = item8 * itemAmount8;
                int amountIntoQuantity9 = item9 * itemAmount9;
                int amountIntoQuantity10 = item10 * itemAmount10;

                // discount on first product purchase if quantitiy greater then 4
                float discount1;
                float amountIntoQuantity11 = amountIntoQuantity1;
                if (item1 > 4) {
                        discount1 = (amountIntoQuantity1 * 5) / 100.0f;
                        amountIntoQuantity11 = amountIntoQuantity1 - discount1;
                }

                // discount on 5th product
                float discount5 = (amountIntoQuantity5 * 10) / 100;
                float amountIntoQuantity55 = amountIntoQuantity5 - discount5;

                // discount on 10th product
                float discount10 = (amountIntoQuantity10 * 15) / 100;
                float amountIntoQuantity1010 = amountIntoQuantity10 - discount10;

                // total amount
                float totalAmount = (amountIntoQuantity1 + amountIntoQuantity2
                                + amountIntoQuantity3 + amountIntoQuantity4 + amountIntoQuantity5 + amountIntoQuantity6
                                + amountIntoQuantity7 + amountIntoQuantity8 + amountIntoQuantity9
                                + amountIntoQuantity10);

                // total amount condition
                float discount;
                // float discountOfTotalAmount = totalAmount;
                float discountOfTotalAmount = (amountIntoQuantity11 + amountIntoQuantity2 + amountIntoQuantity3
                                + amountIntoQuantity4 +
                                amountIntoQuantity55 + amountIntoQuantity6 + amountIntoQuantity7 + amountIntoQuantity8 +
                                amountIntoQuantity9 + amountIntoQuantity1010);

                if ((totalAmount > 5000) && (totalAmount < 10000)) {
                        discount = (totalAmount * 10) / 100;
                        discountOfTotalAmount = totalAmount - discount;

                } else if (totalAmount > 10000) {
                        discount = (totalAmount * 15) / 100;
                        discountOfTotalAmount = totalAmount - discount;
                }

                float GST = (totalAmount * 10) / 100;

                float GSTDiscount = (discountOfTotalAmount * 10) / 100;

                // carry bag

                System.out.println("carry bag y/n ");
                char carryBag = sc.next().charAt(0);

                float carryBagAmount = 0;
                if (carryBag == 'y') {
                        carryBagAmount = 10f;
                }

                // gift
                float giftPrice = 0.00f;
                String gift;
                if (Gender == 'f') {
                        gift = "cadeberry";
                } else {
                        gift = "ladger wallet";
                }

                // A.P. total price
                // float f=(float)(carryBag);
                float ApTotal = (totalAmount + giftPrice + carryBagAmount + GST);

                // D.P. total price
                float Dptotal = (discountOfTotalAmount + giftPrice + carryBagAmount + GSTDiscount);

                // formating section

                System.out.println("\t\t\t\t D-Mart");
                System.out.println("Name: " + Name + "\t\t\t\t\t\t" + "Date: 22/05/2023");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Item Name \t" + "Quantity \t" + "Price \t\t" + "Total \t\t" + "After-Discount");
                System.out.println("item-1 \t\t   " + item1 + "\t\t " + itemAmount1 + "\t\t "
                                + amountIntoQuantity1 + " RS\t\t   "
                                + amountIntoQuantity11 + " RS");
                System.out.println("item-2 \t\t   " + item2 + "\t\t " + itemAmount2 + "\t\t "
                                + amountIntoQuantity2 + " RS\t\t   "
                                + amountIntoQuantity2 + " RS");
                System.out.println("item-3 \t\t   " + item3 + "\t\t " + itemAmount3 + "\t\t "
                                + amountIntoQuantity3 + " RS\t\t   "
                                + amountIntoQuantity3 + " RS");
                System.out.println("item-4 \t\t   " + item4 + "\t\t " + itemAmount4 + "\t\t "
                                + amountIntoQuantity4 + " RS\t\t   "
                                + amountIntoQuantity4 + " RS");
                System.out.println("item-5 \t\t   " + item5 + "\t\t " + itemAmount5 + "\t\t "
                                + amountIntoQuantity5 + " RS\t\t   "
                                + amountIntoQuantity55 + " RS");
                System.out.println("item-6 \t\t   " + item6 + "\t\t " + itemAmount6 + "\t\t "
                                + amountIntoQuantity6 + " RS\t\t   "
                                + amountIntoQuantity6 + " RS");
                System.out.println("item-7 \t\t   " + item7 + "\t\t " + itemAmount7 + "\t\t "
                                + amountIntoQuantity7 + " RS\t\t   "
                                + amountIntoQuantity7 + " RS");
                System.out.println("item-8 \t\t   " + item8 + "\t\t " + itemAmount8 + "\t\t "
                                + amountIntoQuantity8 + " RS\t\t   "
                                + amountIntoQuantity8 + " RS");
                System.out.println("item-9 \t\t   " + item9 + "\t\t " + itemAmount9 + "\t\t "
                                + amountIntoQuantity9 + " RS\t\t   "
                                + amountIntoQuantity9 + " RS");
                System.out.println("item-10 \t   " + item10 + "\t\t" + itemAmount10 + "\t\t " + amountIntoQuantity10
                                + " RS\t\t   "
                                + amountIntoQuantity1010 + " RS");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t  A.P \t\t    D.P");
                System.out.println("\t\t\t\t\t\t " + totalAmount + "\t\t    " + discountOfTotalAmount);
                System.out.println("gift:- " + gift + "\t\t\t\t  " + giftPrice + "\t\t    " + giftPrice);
                System.out.println("Carry bag:- " + carryBag + "\t\t\t\t\t  " + carryBagAmount + "\t\t    "
                                + carryBagAmount);
                System.out.println("GST(10%) \t\t\t\t\t " + GST + "\t\t   " + GSTDiscount);
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t" + ApTotal + "\t\t   " + Dptotal);
                System.out.println("\t\t\t\t Thank you");
                System.out.println("\t\t\t\t To vist");
                System.out.println("\t\t\t\t D-Mart");

                System.out.println("---------------------------------------------------------------------------");

                // System.out.println("\t\t\t\t\t\t " +totalAmount +"\t\t"
                // +discountOfTotalAmount);

        }
}