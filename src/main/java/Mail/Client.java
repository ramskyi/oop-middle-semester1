package Mail;

public class Client {
    private static int clientCount = 0;

    private int id;
    private String name;
    private int age;
    private boolean sex;  // true means male and false means female;

    public Client(String clientName, int clientAge, boolean clientSex) {
        id = clientCount++;
        name = clientName;
        age = clientAge;
        sex = clientSex;
    }
}
