import java.util.*;


public class AcademicClass
{
    public AcademicClass()
    {
        students = new ArrayList<Student>();
        Teacher teach;
    }
    
    public void setTeacher(String name, String subject)
    {
        teach = new Teacher(name, subject);
        
    }
    
    public void assign(String name, int favNumber)
    {
        Student student = new Student(name, favNumber);
        students.add(student);
    }

    public void classInfo()
    {
        System.out.println(teach);
        System.out.println("Students: ");
        for (Student s : students)
            System.out.println(s);
    }

    public ArrayList<Student> studentsWithFav(int n)
    {
        ArrayList<Student> result = new ArrayList<Student>();

        for (Student s : students)
            if (s.getFavNumber() == n)
                result.add(s);

        return result;
    }

    public ArrayList<Student> oddFavs()
    {
        ArrayList<Student> result = new ArrayList<Student>();

        for (Student s : students)
            if (s.getFavNumber() % 2 == 1)
                result.add(s);

        return result;
    }
   

    private ArrayList<Student> students;
    private Teacher teach;


    public static void main(String[] args)
    {
        AcademicClass course = new AcademicClass();

        course.setTeacher("Mr. Witman", "Robotics");
        
        course.assign("Riley", 42);
        course.assign("Kailyn", 3);
        course.assign("Katie", 12);
        course.assign("Linda", 22);
        course.assign("Casey", 7);
        course.assign("Chase", 39);
        course.assign("Melodie", 15);
        course.assign("Jocelyn", 22);
        course.assign("Tiffany", 12);
        course.assign("Chesney", 22);
        course.assign("Shaye", 7);
        course.assign("Lita", 12);
        course.assign("Jules", 22);

        course.classInfo();

        System.out.println("Students whose favorite number is 12: " + course.studentsWithFav(12));
        System.out.println("Students whose favorite number is 22: " + course.studentsWithFav(22));
        System.out.println("Students whose favorite number is odd " + course.oddFavs());
    }
}

