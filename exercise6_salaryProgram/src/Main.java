//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var employee = new Employee();

    employee.setName("John");
    employee.setAge(30);
    employee.setDepartment("Engineering");
    employee.setHourlyRate(100);
    employee.setHoursWorked(40);
    employee.calculateSalary(20);
    System.out.println(employee.toString());
}
