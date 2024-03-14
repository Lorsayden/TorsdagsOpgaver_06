import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Student student1 = new Student("Lasse", new ArrayList<>(Arrays.asList("C++")));
        Student student2 = new Student("Rolf", new ArrayList<>(Arrays.asList("Java 1.0")));
        Teacher teacher1 = new Teacher("Tess", new ArrayList<>(Arrays.asList("Java 1.0", "Perl", "Python")));
        Teacher teacher2 = new Teacher("Signe", new ArrayList<>(Arrays.asList("C++", "C#", "Rust")));

        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        for(Person element : persons){
            boolean isCourse = element.addCourse("Java 1.0");
            if(!isCourse){
                if(element instanceof Student){
                    System.out.println(element.getName() + " har allerede bestået dette kursus.");
                }else if(element instanceof Teacher){
                    System.out.println(element.getName() + " kan ALLEREDE undervise dette fag.");
                }else{
                    System.out.println("Det må være en gæst");
                }
            }
        }
    }
}