package ru.geekbrains.java_1.lesson_4;

class HomeWork4 {

    private static int ARRAY_LENGTH = 5;

    public static void main(String[] args) {

        Employee[] employees = new Employee[ARRAY_LENGTH];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", "Техник",
                "ivanov@mail.ru", "8123456789", 100000, 40);
        employees[1] = new Employee("Иванов", "Иван", "Иванович", "Техник",
                "ivanov@mail.ru", "8123456789", 100000, 41);
        employees[2] = new Employee("Иванов", "Иван", "Иванович", "Техник",
                "ivanov@mail.ru", "8123456789", 100000, 42);
        employees[3] = new Employee("Иванов", "Иван", "Иванович", "Техник",
                "ivanov@mail.ru", "8123456789", 100000, 43);
        employees[4] = new Employee("Иванов", "Иван", "Иванович", "Техник",
                "ivanov@mail.ru", "8123456789", 100000, 44);

        System.out.println("Список сотрудников старше 40 лет: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) employees[i].printInfo();
        }
    }
}
