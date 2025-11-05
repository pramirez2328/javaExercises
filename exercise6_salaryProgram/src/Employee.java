public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    private int hourlyRate;
    private int hoursWorked;

    public Employee(String name, int age, String department, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary(int overtimeHours) {
        salary = hourlyRate * hoursWorked + (hourlyRate * overtimeHours * 1.5);
    }

    public String toString() {
        return "Employee: " + name + ", age: " + age + ", department: " + department + ", salary: " + salary;
    }
}
