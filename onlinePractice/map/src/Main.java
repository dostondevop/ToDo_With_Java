import dictionary.SimpleDictionary;

public class Main {
    public static void main(String[] args) {
        // key : value  -> entry
        var dict = new SimpleDictionary<String,String>();
        dict.put("Hi","Salom");
        dict.put("Cat","Mushuk");
        dict.put("Dog","It");
        System.out.println(dict);
        System.out.println(dict.get("Hi"));
        System.out.println(dict.get("Cat"));
        System.out.println(dict.get("fly"));
    }
}