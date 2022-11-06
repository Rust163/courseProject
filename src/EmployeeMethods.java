public class EmployeeMethods {
    public static void borderLine() {
        System.out.println("===========================================================================================================");
    }
    public static int employeeCount(Employee[] arr) {
        int l = 0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                l++;
            }
        }
        return l;
    }

    //-----------Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).-------
    public static void employeesList(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //---------------Посчитать сумму затрат на зарплаты в месяц.----------------------------------------------
    public static float monthlySalaryCosts(Employee[] arr) {
        float totalSumSalary = 0f;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                totalSumSalary += arr[i].getSalary();
            }
        }System.out.println("Суммарные затраты на зарплаты: " + totalSumSalary);
        return totalSumSalary;
    }

    //----------------Найти сотрудника с минимальной зарплатой. -----------------------------------------------
    public static void minSalaryEmployee(Employee[] arr) {
        float min = arr[0].getSalary();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Минимальная зарплата у: " + arr[k]);
    }

    //-----------------Найти сотрудника с максимальной зарплатой.---------------------------------------------
    public static void maxSalaryEmployee(Employee[] arr) {
        float max = arr[0].getSalary();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Максимальная зарплата у: " + arr[k]);
    }

    //------------------Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b). ---------
    public static void averageValue(Employee[] arr) {
        float l = EmployeeMethods.employeeCount(arr);
        float m = EmployeeMethods.monthlySalaryCosts(arr);
        float averageSalary = m / l;
        System.out.println("Средняя зарплата: " + averageSalary);
    }

//------------------Получить Ф. И. О. всех сотрудников (вывести в консоль).------------------------------------

    public static void listEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName());
        }
    }

    //-------------------Повышенная сложность.----------------------------------------------------------------------
    //--------------------Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).------------------------------------------
    public static void raiseSalary(Employee[] arr, float percent) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i].setSalary(arr[i].getSalary() + arr[i].getSalary() * percent);
            }
        }
        System.out.println("Зарплаты подняты на " + percent * 100 + " процентов");
    }

//-------------------2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):-------------------------------------------------------------------
//-------------------------------------1. Сотрудника с минимальной зарплатой.--------------------------------------------------------------------------------

    public static void minSalaryOfTheDepartment(Employee[] arr, int number) {
        if (arr[number].getDepartment() > 0) {
            int l = 0;
            float minSum = 100000000;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    if (minSum > arr[i].getSalary()) {
                        minSum = arr[i].getSalary();
                        l = i;
                    }
                }
            }
            System.out.println("Отдел: №" + number + ", Сотрудник: " + arr[l].getFullName() + ", Минимальная сумма зарплаты: " + minSum + " руб.");
        }
    }
    //-------------------------------------1. Сотрудника с максимальной зарплатой.--------------------------------------------------------------------------------
    public static void maxSalaryOfTheDepartment(Employee[] arr, int number) {
        if (arr[number].getDepartment() > 0) {
            int l = 0;
            float maxSum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    if (maxSum < arr[i].getSalary()) {
                        maxSum = arr[i].getSalary();
                        l = i;
                    }
                }
            }
            System.out.println("Отдел: №" + number + ", Сотрудник: " + arr[l].getFullName() + ", Максимальная сумма зарплаты: " + maxSum + " руб.");
        }
    }
}


