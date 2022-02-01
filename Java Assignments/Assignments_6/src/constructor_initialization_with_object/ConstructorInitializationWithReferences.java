package constructor_initialization_with_object;

import constructor_initialization.ConstructorInitializationDemo;

public class ConstructorInitializationWithReferences {
    ConstructorInitializationWithReferences(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        ConstructorInitializationWithReferences[] ref = new ConstructorInitializationWithReferences[10];
        for(int i = 0; i < 10; i++){
            ref[i] = new ConstructorInitializationWithReferences("Constructor " + (i + 1) + " called");
        }
    }

}
