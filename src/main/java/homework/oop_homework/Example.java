package homework.oop_homework;

public class Example {
    public static void main(String[] args) {

        Customer customer = new Customer("Elīna");
        customer.setMember(true);
        customer.setMemberType("Silver");
        System.out.println(customer);

        Visit customerVisit = new Visit(customer, 01 / 01 / 2022);
        customerVisit.setProductExpense(10);
        customerVisit.setServiceExpense(20);
        System.out.println(customerVisit.getTotalExpense());

        Customer customer1 = new Customer("Ivars");
        customer1.setMember(true);
        customer1.setMemberType("Gold");
        System.out.println(customer1);

        Visit customerVisit1 = new Visit(customer1, 31 / 03 / 2022);
        customerVisit1.setProductExpense(10);
        customerVisit1.setServiceExpense(20);
        System.out.println(customerVisit1.getTotalExpense());

        Customer customer2 = new Customer("Lorens");
        customer2.setMember(true);
        customer2.setMemberType("Premium");
        System.out.println(customer2);

        Visit customerVisit2 = new Visit(customer2, 15 / 05 / 2022);
        customerVisit2.setProductExpense(10);
        customerVisit2.setServiceExpense(20);
        System.out.println(customerVisit2.getTotalExpense());

        Customer customer3 = new Customer("ABC");
        customer3.setMember(false);
        customer3.setMemberType("Default");
        System.out.println(customer3);

        Visit customerVisit3 = new Visit(customer3, 10 / 06 / 2022);
        customerVisit3.setProductExpense(10);
        customerVisit3.setServiceExpense(20);
        System.out.println(customerVisit3.getTotalExpense());

    }
}
