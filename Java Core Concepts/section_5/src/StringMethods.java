public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Mohd Abdul Azeem";
        String name2 = "Mohd Abdul Azeem";
        String name3 = "Virat Kohli";

        for(int i=0;i<name1.length();i++){
            System.out.print(name1.charAt(i) + " ");
        }
        System.out.println();

        if(name1.equals(name3)){
            System.out.println("Name1 and Name3 are equal");
        }else {
            System.out.println("Not matching");
        }

        if(name1.compareTo(name3) > 0){
            System.out.println("Name1 > Name2");
        }else {
            System.out.println("Name1 < Name3");
        }

    }
}
