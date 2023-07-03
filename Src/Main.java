import java.time.LocalDate;

import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate birthday1 = LocalDate.of(1995, 4, 14);

        User user1 = new User("Yan", birthday1, "yan@gmail.com", "123456", "Obora", 80, 120, 10000);

        LocalDate birthday2 = LocalDate.of(1988, 7, 22);

        User user2 = new User("Liza", birthday2, "liza@obora.com", "654321", "Obora", 60, 110, 8000);

        user1.printAccountInfo();

        user2.printAccountInfo();

        // Изменение параметров для двух пользователей

        user1.setSurname("Zlotnicki");

        user1.setWeight(85);

        user1.setPressure(125);

        user1.setSteps(12000);

        user2.setSurname("Zlotnickaya");

        user2.setWeight(65);

        user2.setPressure(115);

        user2.setSteps(9000);

        // Печать информации о пользователях

        user1.printAccountInfo();

        user2.printAccountInfo();

    }
}