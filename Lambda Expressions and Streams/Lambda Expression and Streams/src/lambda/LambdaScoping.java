package lambda;

class SuperScope{
    public final String member = "GrandFather";
}


public class LambdaScoping extends SuperScope {
    String member = "Father";

    interface Family{
        void familyMembersFromLambda(String member);
    }

    public void printFamilyMembers(String member){
        System.out.println(member);
        System.out.println(this.member);
        System.out.println(super.member);

        Family family = (familyMember) -> {
            System.out.println(familyMember);
            System.out.println(member);
            System.out.println(this.member);
            System.out.println(super.member);
        };

        family.familyMembersFromLambda("GRAND SON");
    }

    public static void main(String[] args) {
        new LambdaScoping().printFamilyMembers("SON");
    }
}
