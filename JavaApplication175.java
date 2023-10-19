package javaapplication175;


import java.util.ArrayList;

public class JavaApplication175 {

    public static class Carprocon {
        int budget = 50000;


        double price;
        String model;


        ArrayList<String> pros = new ArrayList();
        public void addpro(String a) {
            pros.add(a);
        }

        ArrayList<String> cons = new ArrayList();
        public void addcon(String a) {
            pros.add(a);
        }

        ArrayList<Integer> propoints = new ArrayList();
        public void addpropoint(int a) {
            propoints.add(a);
        }

        ArrayList<Integer> conpoints = new ArrayList();
        public void addconpoint(int a) {
            conpoints.add(a);
        }



        Carprocon(int budget) {      // notice this is my constructor method
            this.budget = budget;
        }
        public void setcar(String model, double price) {
            this.model = model;
            this.price = price;
        }
        public void setcar2 (String model, double price) {
            this.model = model;
            this.price = price;
        }
        String pro;
        int x;
        public void setpro(String pro, int x) {
            if (x >= 1 && x <= 10) {
                this.x = x;
                this.pro = pro;
                pros.add(pro);
                propoints.add(x);
            }
        }
        String con;
        int y;
        public void setcon(String con, int y) {
            if (y >= 1 && y <= 10) {
                this.y = y;
                this.con = con;
                cons.add(con);
                conpoints.add(y);
            }
        }

        public void printit() {
            System.out.println(budget);
            System.out.println(price);
            System.out.println(model);
            for (int i = 0; i < pros.size(); i++) {
                System.out.println(pros.get(i));
            }
            for (int i = 0; i < cons.size(); i++) {
                System.out.println(cons.get(i));
            }
            for (int i = 0; i < propoints.size(); i++) {
                System.out.println(propoints.get(i));
            }
            for (int i = 0; i < conpoints.size(); i++) {
                System.out.println(conpoints.get(i));
            }
        }

        public int sumpro(ArrayList<Integer> propoints) {
            int sum = 0;
            for(int i = 0; i < propoints.size(); i++)
                sum += propoints.get(i);
            return sum;
    }
    public int sumcon(ArrayList<Integer> conpoints) {
        int sum = 0;
        for(int i = 0; i < conpoints.size(); i++)
            sum += conpoints.get(i);
        return sum;
    }

    public void compareit(Carprocon c) {
        int c_propoints = sumpro(propoints);
        int c_conpoints = sumcon(conpoints);
        int this_propoints = sumpro(propoints);;
        int this_conpoints = sumcon(conpoints);;
        int ctotal = c_propoints - c_conpoints;
        int thistotal = this_propoints - this_conpoints;
        System.out.println(ctotal);
        System.out.println(thistotal);
    }
}

    public static void main(String[] args) {

        Carprocon car1 = new Carprocon(50);
        Carprocon car2 = new Carprocon(60);

        car1.setcar("Bugatti 2005",  20000);
        car2.setcar2("Ferrari 2008", 40000);

        car1.addpro("Cheaper, more gas mileage, more comfortable, more durable, faster");
        car1.addcon("Older, more worn down, harder braking, rougher ride, less valuable");
        car1.addpropoint(5);
        car1.addconpoint(6);

        car2.addpro("Newer, more valuable, better condition, better braking, smoother ride");
        car2.addcon("More expensive, less comfortable, louder engine, less gas mileage, slower");
        car2.addpropoint(1);
        car2.addconpoint(1);

        car1.setpro("Cheaper, more gas mileage, more comfortable, more durable, faster", 5);
        car2.setpro("Newer, more valuable, better condition, better braking, smoother ride", 6);

        car1.setcon("Older, more worn down, harder braking, rougher ride, less valuable", 5);
        car2.setcon("More expensive, less comfortable, louder engine, less gas mileage, slower", 6);

        car1.compareit(car1);
        car2.compareit(car2);

        car1.printit();
        car2.printit();
    }

}