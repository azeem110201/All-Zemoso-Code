import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public void getDepartmentNames(List<Student> students){
        students.stream()
                .map(Student::getEngineeringDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    public void getEnrollmentsAfterSpecificYear(List<Student> students, int year){
        students.stream()
                .filter(s -> s.getYearOfEnrollment() > year)
                .map(Student::getFullName)
                .forEach(System.out::println);
    }
    public void getDetailsOfAllMaleInCSDept(List<Student> students){
        students.stream()
                .filter(s -> s.getGender().equals("Male"))
                .filter(s -> s.getEngineeringDepartment().equals("Computer Science"))
                .map(Student::toString)
                .forEach(System.out::println);
    }
    public void getCountOfMaleAndFemale(List<Student> students){
        students.stream()
                .collect(Collectors.groupingBy(Student::getGender))
                .forEach((a, b) -> {
                    System.out.println(a + ":" + b.size());
                });
    }
    public void getAverageAgeOfMaleAndFemale(List<Student> students){
        Map<String, Double> avgAgeOfMaleAndFemale = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));

        avgAgeOfMaleAndFemale.forEach((a, b) -> {
            System.out.println("Gender:" + a + " and " + "Avg Age:" + b);
        });
    }

    public void getTheHighestMarksScorer(List<Student> students){
        OptionalDouble highestScrorer = students.stream()
                .mapToDouble(Student::getPercentageTillDate)
                .max();
        if(highestScrorer.isPresent())
            System.out.println("Highest scorer is:" + highestScrorer.getAsDouble());

    }

    public void getCountOfStudentInEachDepartment(List<Student> students){
        Map<String, Long> countOfStudentInEachDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngineeringDepartment, Collectors.counting()));

        countOfStudentInEachDepartment.forEach((a, b)->{
            System.out.println(a + ":" + b);
        });
    }

    public void getAveragePercentageFromEachDepartment(List<Student> students){
        Map<String, Double> avgPercentageFromEachDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngineeringDepartment, Collectors.averagingDouble(Student::getPercentageTillDate)));

        avgPercentageFromEachDepartment.forEach((a, b)->{
            System.out.println(a + ":" + b);
        });
    }

    public void getYoungestMaleInElectronicsDepartment(List<Student> students){
        students.stream()
                .filter(s -> s.getEngineeringDepartment().equals("Electronic"))
                .min(Comparator.comparing(Student::getAge))
                .stream().limit(1)
                .map(Student::toString)
                .forEach(System.out::println);
    }

    public void getMaleAndFemaleCountInCSDepartment(List<Student> students){
        students.stream()
                .filter(s -> s.getEngineeringDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender))
                .forEach((a, b) -> {
                    System.out.println(a + ":" + b.size());
                });
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


        // all department names
        new Main().getDepartmentNames(students);

        //Get the names of all students who have enrolled after 2018
        new Main().getEnrollmentsAfterSpecificYear(students, 2018);

        //Get the details of all male student in the computer sci department
        new Main().getDetailsOfAllMaleInCSDept(students);

        //Number of males and females in the campus
        new Main().getCountOfMaleAndFemale(students);

        //Average age of male and females in the campus
        new Main().getAverageAgeOfMaleAndFemale(students);

       //Get the details of highest student having highest percentage
        new Main().getTheHighestMarksScorer(students);

        //Count the number of students in each department
        new Main().getCountOfStudentInEachDepartment(students);

        //average percentage achieved in each department
        new Main().getAveragePercentageFromEachDepartment(students);

        //Get the details of the youngest male student in the Electronic department
        new Main().getYoungestMaleInElectronicsDepartment(students);

        //get the male and female students are there in the computer science department
        new Main().getMaleAndFemaleCountInCSDepartment(students);
    }
}
