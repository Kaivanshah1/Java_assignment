//Created By 21CE125 Kaivan Shah .

package Practical12;

class Bank {

    private String name;

    Bank(String name) {

        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Harsh Rana");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
    }
}
