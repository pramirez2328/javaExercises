//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // create object without arguments
    var employee = new Employee();
    employee.setName("John");
    employee.setAge(30);
    employee.setDepartment("Engineering");
    employee.setHourlyRate(100);
    employee.setHoursWorked(40);
    employee.calculateSalary(20);
    System.out.println(employee.toString());

    // create object with arguments
    var employee2 = new Employee("Jane", 25, "Sales", 150, 35);
    employee2.calculateSalary(15);
    System.out.println(employee2.toString());

    // example of static variable and method
    System.out.println("access the number by variable: " + Employee.numberOfEmployees);
    System.out.println("access the number by method: " + Employee.getNumberOfEmployees());
}
