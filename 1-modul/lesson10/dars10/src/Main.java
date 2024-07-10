public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.FirstName = "Behruzbek";
        user.LastName = "Mahmudjonov";
        user.Age = 19;
        user.ProgtammingLanguage = "java";
        System.out.print("Mening ismim " + user.FirstName  + " va familiyam " + user.LastName + "." );
        System.out.print("Men hozirda " + user.Age + " daman va " + user.ProgtammingLanguage + " tilini ");
        System.out.println(" o'rganyapman.");
    }
}