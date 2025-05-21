public class Name_Phone {
    String name(String name) {
        return name;
    }

    int phoneNumber(int phoneNumber) {
        return phoneNumber;
    }

    public static void main(String[] args) {
        Name_Phone name_Phone = new Name_Phone();
        System.out.println("My Name is " + name_Phone.name("DK"));
        System.out.println("My Phone number is " + name_Phone.phoneNumber(1234567890));
    }
}
