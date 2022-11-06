public class Employee {

    private final String name;
    private String surname;
    private final String patronymic;
    private int department;
    private float salary;
    private int id;
    public static int idCounter = 0;

    private String fullName;

    public Employee(String name, String patronymic, String surname, float salary, int departments) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.salary = salary;
        this.department = departments;
        this.id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return "Имя: " + name + ", Отчество: " + patronymic + ", Фамилия: " + surname;
    }


    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }




    @Override
    public String toString() {
        return "Идентификатор: " + this.id + ", Отдел: " + this.department + ", Имя: " + this.name + ", Отчество: "+ this.patronymic +", Фамилия: "
                + this.surname + ", Зарплата: " + this.salary + " руб.";
    }



}
