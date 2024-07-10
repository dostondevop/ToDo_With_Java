package package_for_protected_modifierTest;

import package_for_protected_modifier.ClassWithProtectedModifier;
import package_for_protected_modifier.ClassWithProtectedModifierTest;

public class ClassForTestingProtectedModifier extends ClassWithProtectedModifier {
    public ClassForTestingProtectedModifier(String protectedField) {
       super.protectedField = protectedField;
    }

    public String returnProtectedField() {
        return "->" + protectedField;
    }
    public void  callProtectedMethod() {
        protectedMethod();
    }
}
