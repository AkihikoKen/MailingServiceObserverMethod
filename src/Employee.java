public class Employee { //класс сотрудников
    private String name;

    public Employee(String name, Company company) {
        this.name = name;
        company.registerEmployee(this);
    }

    void update(String newsEmployee) {
        System.out.println(name + " получил новость: " + newsEmployee);
    }
}
