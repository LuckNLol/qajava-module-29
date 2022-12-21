public class Person {
    public static boolean isTeenager(int age) {
        String message;
        boolean result;
        if (age < 19 && age > 13) {  // скорректировано согласно условию задачи
            message = age + "," + " I'm a Teenager";
            result = true;
        }
        else if (age <= 13 && age >= 0) {
            message = age + "," + " I'm a junior";
            result = false;
        }
        else if (age < 0) {
            message = age + "," + " I'm a long term project. I'll be a human in "
                    + Math.abs(age) + " years";
            result = false;
        }
        else {
            message = age + "," + " I'm adult";
            result = false;
        }
        System.out.println("Мой статус: " + message + "\n");
        return result;
    }
}
