import java.util.ArrayList;
import java.util.List;

public class RichCompany implements Company{
    private List<Employee> employeeList;
    private String newsCompany;

    public RichCompany() {
        employeeList = new ArrayList<>();
    }

    public void setNewsCompany(String news) {
        this.newsCompany = news;
        notifyEmployee();
    }

    @Override
    public void registerEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void notifyEmployee() {
        for (Employee employee : employeeList)
            employee.update(newsCompany);
    }
}
