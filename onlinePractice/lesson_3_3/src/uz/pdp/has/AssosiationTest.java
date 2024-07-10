package uz.pdp.has;

public class AssosiationTest {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Akbarov Akbar");
        Passport passport = new Passport("AD", "12312412");
        String message = "%s, %s%s".formatted(citizen.getFullName(),passport.getSerial(),passport.getNumber());
        System.out.println(message);
    }

}
