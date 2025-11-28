public class Main {
    public static void main(String[] args) {

        User[] users = new User[4];
        users[0] = new User("Амина", "666");
        users[1] = new User("Арина", "007");
        users[2] = new User("Богдаша", "123");
        users[3] = new User("Айгизя", "456");

        System.out.println("Пользователи: ");
        for (User user : users) {
            System.out.println(user.toString());
        }

    }
}
