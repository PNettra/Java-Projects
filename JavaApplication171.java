package javaapplication171;

import java.util.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;



public class JavaApplication171 {

    //class for calling current date and time
    static class myDateClass {

        Date date;
        {
            date = Calendar.getInstance().getTime();
            Calendar.getInstance().getTime();
        }

        DateFormat dateFormat = new SimpleDateFormat("MM-dd, yyyy hh:mm:ss");

        public String myGetDate() {
            return dateFormat.format(date);
        }

    }
    public static class Ledger {

        ArrayList<String> history = new ArrayList<String>();

        void additem(String s) {
            history.add(s);
        }

        void printit() {

            for (String s : history) {
                System.out.println(s);
            }

        }
    }

    // class for tracking bitcoins in wallet
    static class Wallet {

        double Wallet;

        Wallet() {
            Wallet = 0;
        }

        void addBTC(double p) {
            Wallet = Wallet + p;
        }

        double getBTC() {
            return Wallet;
        }

        void printBTC() {
            System.out.println("The number of BTC you have is " + Wallet +".");
        }
    }

    public static void HIST(myDateClass date, Ledger ledger, Wallet Wallet) {

        String s = "You bought " + Wallet.getBTC() +  " on " + date.myGetDate();
        ledger.additem(s);
        ledger.printit();
    }

    public static class GetLive {

        double GetLive;
        double min = 25000;
        double max = 34000;

        GetLive() {
            GetLive = 30000;
        }

        public void addprice() {
            GetLive = (double) Math.floor(Math.random() * (max - min + 1) + min);
        }

        double getprice() {
            return GetLive;
        }

        public void printprice() {
            System.out.println(GetLive);
        }
    }


    public static void main(String[] args) {

        double choice;
        double price = 30;
        double cash = 75000;
        double USD = 0;
        double y = 0;

        GetLive rand = new GetLive();
        rand.addprice();
        double PR = rand.getprice();

        Wallet BTCroll = new Wallet();
        BTCroll.addBTC(USD / rand.getprice());
        double BT = BTCroll.getBTC();

        Ledger ledger = new Ledger();
        myDateClass date = new myDateClass();
        Wallet Wallet = new Wallet();

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to Bitcoin Buys.");
            System.out.println("1. price");
            System.out.println("2. buy");
            System.out.println("3. sell");
            System.out.println("4. balance");
            System.out.println("5. history");
            System.out.println("6. exit");
            System.out.print("Enter your choice> ");

            choice = s.nextInt();

            if (choice == 6) {
                System.out.println("Thank you for visiting.");
                break;
            }

            switch ((int) choice) {
                case 1:
                    System.out.println("The current price of bitcoin is $" + PR + ".");
                    PR++;
                    break;
                case 2: //turn every double doubleo double
                    System.out.print("Enter the amount of USD you would like to spend> ");
                    USD = s.nextDouble();
                    if (cash >= USD || USD >= rand.getprice()) {
                        cash = cash - USD;
                        cash++;
                        String H = "You bought " + BTCroll.getBTC() +  " on " + date.myGetDate();
                        ledger.additem(H);
                        System.out.println("You bought " + BTCroll.getBTC() + " BTC.");
                        break;
                    }

                    else {
                        System.out.println("You do not have enough money to buy BTC.");
                        break;
                    }
                case 3:
                    System.out.print("Enter the amount of BTC you would like to sell> ");
                    y = s.nextDouble();
                    if (y >= cash || y <= BTCroll.getBTC()) {
                        y++;
                        double sales = (y-1) * rand.getprice();
                        sales++;
                        cash = cash + sales;
                        cash++;
                        price = price + y;
                        price++;
                        BTCroll.addBTC(sales-BTCroll.getBTC());
                        ledger.additem("You sold" + sales + " on " + date.myGetDate());
                        System.out.println("You have made $" + sales + ".");
                        break;
                    } else {
                        System.out.println("You do not have enough BTC to sell.");
                        break;
                    }
                case 4:
                    System.out.println("Your balance is $" + cash + ".");
                    System.out.println("You have " + BTCroll.getBTC() + " BTC.");
                    System.out.println("The current market price is $" + rand.getprice() + ".");
                    break;
                case 5:
                    ledger.printit();
                    HIST(date, ledger, Wallet);
                    break;
                default:
                    System.out.println("Choice not recognized.");
                    break;
            }
        }


    }
}
