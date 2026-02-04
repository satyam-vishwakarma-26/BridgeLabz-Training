package com.collectors.studentresult;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StudentResultGrouping {

    public static void main(String[] args) {

        // Sample student data
        List<Student> students = List.of(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "C"),
            new Student("Eva", "B")
        );

        // Group students by grade level and collect names
        Map<String, List<String>> studentsByGrade =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        // Print result
        studentsByGrade.forEach((grade, names) ->
            System.out.println("Grade " + grade + " : " + names)
        );
    }
}