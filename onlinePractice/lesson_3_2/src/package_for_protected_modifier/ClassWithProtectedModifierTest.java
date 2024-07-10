package package_for_protected_modifier;

public class ClassWithProtectedModifierTest {
    public static void main(String[] args) {
        ClassWithProtectedModifier obj = new ClassWithProtectedModifier();
        obj.protectedField = "Protected field";
        obj.protectedMethod();
    }
}
