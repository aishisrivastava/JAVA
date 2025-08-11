// Mobile class constructor code for printing details of 5 mobiles

public class Mobile_constructor {
    String company_name;
    double screen_size;


    // parameterized constructor
    public Mobile_constructor(String c1, double s1) {
        company_name = c1;
        screen_size = s1;
    }

    // Method
    void displayMobileDetails() {
        System.out.println("Company name of the mobile is " + company_name);
        System.out.println("Screen size of the mobile is " + screen_size);
    }

    // main
    public static void main(String[] args) {
        Mobile_constructor m1 = new Mobile_constructor("samsung", 12.34);
        m1.displayMobileDetails();

        Mobile_constructor m2 = new Mobile_constructor("apple", 10.25);
        m2.displayMobileDetails();

        Mobile_constructor m3 = new Mobile_constructor("redmi", 7.56);
        m3.displayMobileDetails();

        Mobile_constructor m4 = new Mobile_constructor("oppo", 9.45);
        m4.displayMobileDetails();

        Mobile_constructor m5 = new Mobile_constructor("nokia", 6.80);
        m5.displayMobileDetails();

    }
}
