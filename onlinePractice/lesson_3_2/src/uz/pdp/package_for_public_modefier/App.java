package uz.pdp.package_for_public_modefier;

import package_for_default_modifier.ClassWithDefaultModifier;
import package_for_protected_modifier.ClassWithProtectedModifier;
import package_for_protected_modifierTest.ClassForTestingProtectedModifier;

public class App {
    public static void main(String[] args) {
        /*ClassWithPublicModifier classWithPublicModifier = new ClassWithPublicModifier();
        classWithPublicModifier.publicField = "Public field";
        classWithPublicModifier.publicMethod();*/
       /* ClassWithProtectedModifier obj = new ClassWithProtectedModifier();
        obj.protectedField = */

        /*ClassForTestingProtectedModifier obj = new ClassForTestingProtectedModifier("Field method");
        System.out.println(obj.returnProtectedField());
        obj.callProtectedMethod();*/
        ClassWithDefaultModifier obj = new ClassWithDefaultModifier();
    }
}
