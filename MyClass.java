import java.util.*;
import java.io.*;
public class MyClass
{
    public static void main(String[] args)
    {
        ArrayList<Student> myClass = new ArrayList<Student>();
        File mine = new File("students20.txt");
        Scanner in;
        try{
            in = new Scanner(mine);

            while(in.hasNext())
            {
                String name = in.nextLine();
                String grades = in.nextLine();
                Student bob = new Student(name, grades);
                myClass.add(bob);
            }
        }
        catch(IOException i)
        {
            System.out.println("Error: " + i.getMessage());
        }
        for(Student bob : myClass)        
            System.out.println(bob);        
        System.out.println("\nI have " + Student.getStudentCount() + " students in my class.");
        System.out.println("\nHere is a list of students with last name A-M.");
        for(Student bob : myClass)
        {        
            String name = bob.getName();
            int comma = name.indexOf(',');
            String last = name.substring(0, comma);
            if(last.charAt(0)>='A' && last.charAt(0)<='M')
                System.out.println(bob.getName());
        }
        System.out.println("\nHere is a list of students with last name N-Z.");
        for(Student bob : myClass)
        {        
            String name = bob.getName();
            int comma = name.indexOf(',');
            String last = name.substring(0, comma);
            if(last.charAt(0)>='N' && last.charAt(0)<='Z')
                System.out.println(bob.getName());
        }
        System.out.println("\nHere is a list of students who are failing a class.");
        for(Student bob : myClass)
        {        
            if(bob.getF())
                System.out.println(bob.getName());
        }
        System.out.println("\nHere is a list of students with a GPA of 3.0 and above.");
        for(Student bob : myClass)
        {        
            if(bob.getGPA()>=3.0)
                System.out.println(bob.getName());
        }
    }
}