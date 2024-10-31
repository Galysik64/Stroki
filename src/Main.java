public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName + " ");

        System.out.println("Задание 2");
        String fullNameRegister = fullName.toUpperCase();
        System.out.println(fullNameRegister + " ");

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');
        System.out.println(newFullName);

    }
}