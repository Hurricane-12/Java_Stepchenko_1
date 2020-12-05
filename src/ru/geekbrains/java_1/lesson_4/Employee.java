package ru.geekbrains.java_1.lesson_4;

class Employee {

    private String first_name;
    private String second_name;
    private String patronymic;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    Employee(
            String second_name,
            String first_name,
            String patronymic,
            String position,
            String email,
            String phone_number,
            int salary,
            int age) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    void printInfo(){
        System.out.println(
        "ФИО: " + second_name + " " + first_name + " " + patronymic + "; " +
        "Должность: " + position + "; " +
        "email: " + email+ "; " +
        "Номер телефона: " + phone_number + "; " +
        "Зарплата: " + salary + "; " +
        "Возраст: " + age);
    }

    int getAge(){
        return age;
    }
}
