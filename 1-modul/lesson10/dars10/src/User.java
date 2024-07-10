public class User {
    String FirstName;
    String LastName;
    int Age;
    String ProgtammingLanguage;

    @Override
    public String toString() {
        return "Personality{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", ProgtammingLanguage='" + ProgtammingLanguage + '\'' +
                '}';
    }
}
