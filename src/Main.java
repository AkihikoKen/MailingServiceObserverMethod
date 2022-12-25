public class Main {
    public static void main(String[] args) {

        var unn = new RichCompany();

        var Kenan = new Employee("Kenan", unn);
        var Rayane = new Employee("Rayane", unn);

        unn.setNewsCompany("Вы уволены! Поздравляем!");

        unn.removeEmployee(Kenan);

        unn.setNewsCompany("Вы восстановлены! Поздравляем!");

    }
}