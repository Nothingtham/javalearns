package lesson2.part1;

class Homework {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Max O", "Reader", "boom@mail.ru", "1234567", 55000, 19);
        persArray[2] = new Person("Lex Luter", "Evil", "luter@mail.ru", "812312215", 100000, 41);
        persArray[3] = new Person("Major Pain", "Evil assistant", "goodevilforeach@gmail.com", "12312211", 1, 33);
        persArray[4] = new Person("Tor Man", "Creator of storm", "voitelrulit@gmail.com", "892312317", 3000, 21);
        for (Person employee : persArray)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}
class Person {
    private String name;
    private String position;
    private String mail;
    private String phone;
    private int money;
    private int age;

    public Person(String name, String position, String mail, String phone, int money, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + mail + "\n-"
                + phone + "\n-"
                + money + "\n-"
                + age);
    }
}