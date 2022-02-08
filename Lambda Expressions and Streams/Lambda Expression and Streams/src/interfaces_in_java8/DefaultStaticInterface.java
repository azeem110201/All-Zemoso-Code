package interfaces_in_java8;

interface Student{
    void setStudentName(String name);
    String getStudentName();
    default boolean isPass(double marks){
        if(marks >= 40){
            return true;
        }
        return false;
    }

    static String getCountryOfStay(){
        return "India";
    }
}

class TenthClassStudent implements Student{

    String name;

    @Override
    public void setStudentName(String name) {
        this.name = name;
    }

    @Override
    public String getStudentName() {
        return this.name;
    }
}


public class DefaultStaticInterface {
    public static void main(String[] args) {
        TenthClassStudent stu = new TenthClassStudent();
        stu.setStudentName("azeem");
        System.out.println(stu.getStudentName());
        System.out.println(stu.isPass(70.9));
        System.out.println(Student.getCountryOfStay());
    }
}
