package assigment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    static Student[] students=new Student[]{
            Student.of("Ahmad" ,20 , Gender.Male ,true , Course.MATH,Course.CHEMISTRY,Course.JAVA ),
            Student.of("Mohammad" ,25 ,Gender.Male ,true ,Course.MATH,Course.JAVA ),
            Student.of("Esa" ,27 ,Gender.Male ,false ,Course.MATH,Course.JAVA ),
            Student.of("ESRA" ,19 ,Gender.Female ,true ,Course.MATH,Course.ENGLISH ),
            Student.of("DANA" ,40 ,Gender.Female ,true ,Course.MATH,Course.ENGLISH,Course.PHYSICS ),
            Student.of("RUBA" ,22 ,Gender.Female ,true ,Course.MATH,Course.PHYSICS )



    };
    public static void main(String[] args) {

        //done
        List<Integer> ages = Arrays.stream(students)
                .map(Student::getAge)
                .collect(Collectors.toList());

        System.out.println("Ages: " + ages);



        List<Student> students1 = Stream.of(students)
                .filter(student -> student.getAge() < 20).collect(Collectors.toList());
        System.out.println("students1 = " + students1);


        System.out.println("********************************************");
        Map<Boolean, List<Student>> ageGroups = Arrays.stream(students)
                .collect(Collectors.groupingBy(Student->Student.getAge() < 20));

        System.out.println("Age groups: " + ageGroups);
    }
}
