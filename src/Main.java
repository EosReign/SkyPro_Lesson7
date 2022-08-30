public class Main {
    public static void main(String[] args) {
        //=============FirstTask=============
        System.out.println("=============FirstTask=============");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        //=============SecondTask=============
        System.out.println("=============SecondTask=============");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //=============ThirdTask=============
        System.out.println("=============ThirdTask=============");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        fullName2 = fullName2.replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}
