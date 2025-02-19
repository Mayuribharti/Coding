package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//fetchNameofAgeGreater30FromStudent

//CountNumberOfStudentOver30

//FindFirstStudentBelowAge25

//GetListOfStudentNamesInUppercase

//CheckIfAllStudentAreOlderThan20
public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public Integer getAge(){
        return age;
    }

    public String getName(){
        return name;
    }



    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(1,"Monu",21),
                new Student(2,"Ramu",33),
                new Student(3,"Neha",23)
        );

        //fetchNameofAgeGreater30FromStudent
      List<String> nameList = studentList.stream()
                      .filter(student -> student.getAge()>30)
                      .map(Student::getName)
                      .collect(Collectors.toList());

        System.out.println("List of name :"+nameList);

        //CountNumberOfStudentOver30
            Long count = studentList.stream()
                .filter(student -> student.getAge()>30)
                .count();

        //FindFirstStudentBelowAge25
        String firstName = studentList.stream()
                .filter(student->student.getAge()<25)
                .map(Student::getName)
                .findFirst()
                .orElse(null);

        //GetListOfStudentNamesInUppercase
        List<String> upperNames= studentList.stream()
                .map(student -> student.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames);

        //CheckIfAllStudentAreOlderThan20
        boolean check = studentList.stream()
                .allMatch(student -> student.getAge()>20);

        //FindTheMaximumAge
        int maxAge = studentList.stream()
                .mapToInt(student->student.getAge())
                .max()
                .orElseThrow(() -> new IllegalArgumentException("No employees found"));

































































    }
}
