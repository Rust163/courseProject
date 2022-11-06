public class Main {
    public static void main(String[] args) {

        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Иван", " Иванович ", "Иванов", 45450, 5);
        Employees[1] = new Employee("Сергей", " Николаевич ", "Лукьянов", 56854, 3);
        Employees[2] = new Employee("Петр", " Семенович ", "Запорожцев", 35964, 4);
        Employees[3] = new Employee("Виталий", " Владимирович ", "Рыбкин", 23154, 4);
        Employees[4] = new Employee("Виктор", " Петрович ", "Панебратченко", 98745, 2);
        Employees[5] = new Employee("Николай", " Васильевич ", "Жилин", 163854, 5);
        Employees[6] = new Employee("Вячеслав", " Сергеевич ", "Семенов", 65968, 3);
        Employees[7] = new Employee("Владимир", " Валерьевич ", "Жданов", 54852,2);
        Employees[8] = new Employee("Вадим", " Вячеславович ", "Ложкин", 39875, 1);
        Employees[9] = new Employee("Кирилл", " Владимирович ", "Жуков", 156985, 1);

//------------------------Базовая сложность-----------------------------------------------------------

        EmployeeMethods.borderLine();
        EmployeeMethods.employeesList(Employees);
        EmployeeMethods.borderLine();
        EmployeeMethods.monthlySalaryCosts(Employees);
        EmployeeMethods.borderLine();
        EmployeeMethods.minSalaryEmployee(Employees);
        EmployeeMethods.borderLine();
        EmployeeMethods.maxSalaryEmployee(Employees);
        EmployeeMethods.borderLine();
        EmployeeMethods.averageValue (Employees);
        EmployeeMethods.borderLine();
        EmployeeMethods.listEmployee(Employees);


        //-------------------------------------Повышенная сложность-------------------------------------------------

        EmployeeMethods.borderLine();
        EmployeeMethods.raiseSalary (Employees, (float) 0.10);
        EmployeeMethods.borderLine();
        int number = 4;
        EmployeeMethods.minSalaryOfTheDepartment(Employees, number);
        EmployeeMethods.maxSalaryOfTheDepartment(Employees, number);
        EmployeeMethods.borderLine();
    }
}