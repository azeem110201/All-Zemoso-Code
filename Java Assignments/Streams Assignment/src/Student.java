public class Student implements Person{
    private int id;
    private String fullName;
    private int age;
    private String gender;
    private String engineeringDepartment;
    private int yearOfEnrollment;
    private double percentageTillDate;

    Student(
            int id,
            String fullName,
            int age,
            String gender,
            String engineeringDepartment,
            int yearOfEnrollment,
            double percentageTillDate
    ){
        this.setId(id);
        this.setFullName(fullName);
        this.setAge(age);
        this.setGender(gender);
        this.setEngineeringDepartment(engineeringDepartment);
        this.setYearOfEnrollment(yearOfEnrollment);
        this.setPercentageTillDate(percentageTillDate);
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setEngineeringDepartment(String engineeringDepartment){
        this.engineeringDepartment = engineeringDepartment;
    }

    public String getEngineeringDepartment(){
        return this.engineeringDepartment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment){
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getYearOfEnrollment(){
        return this.yearOfEnrollment;
    }

    public void setPercentageTillDate(double percentageTillDate) {
        this.percentageTillDate = percentageTillDate;
    }

    public double getPercentageTillDate(){
        return this.percentageTillDate;
    }

    public String toString(){
        return "ID:"+this.id+","+"Name:"+this.fullName+", Age:"+this.age+", Gender:"+this.gender+", Department:"+this.engineeringDepartment+", Year of enrollement:"+this.yearOfEnrollment;
    }

}
