
public class Student
{
    private String name, grades, first, last;
    private double gpa;
    private int numClasses;
    private boolean hasF;
    private static int StudentCount;

    public Student(String n, String g)
    {
        StudentCount++;
        name = n;
        grades = g.toLowerCase();
        int comma = name.indexOf(',');
        first = name.substring(comma+2);
        last = name.substring(0,comma);
        numClasses = 0;
        hasF = false;
        gpa = calcGPA();
    }

    private double calcGPA()
    {
        double sum = 0;
        int n = 0;
        for(int i=0; i<grades.length(); i++)
        {
            if(grades.charAt(i)=='a'){
                numClasses++; n++; sum+=4;}
            else if(grades.charAt(i)=='b'){
                numClasses++; n++; sum+=3;}
            else if(grades.charAt(i)=='c'){
                numClasses++; n++; sum+=2;}
            else if(grades.charAt(i)=='d'){
                numClasses++; n++; sum+=1;}
            else if(grades.charAt(i)=='e'||grades.charAt(i)=='f'){
                numClasses++; n++; hasF=true;}
            else if(grades.charAt(i)>='g' && grades.charAt(i) <='z'){
                System.out.println("Unexpected character for "+name);}
        }
        sum/=n;
        return sum;
    }

    public static int getStudentCount()
    {
        return StudentCount;
    }

    public String getName()
    {
        return name;
    }

    public double getGPA()
    {
        return calcGPA();
    }

    public boolean getF()
    {
        return hasF;
    }

    public String getElig()
    {
        if(numClasses < 4)
            return " ineligible, taking fewer than four classes.";
        else if(hasF){
            if(gpa<2)
                return " ineligible, is failing a class and GPA is below 2.0.";
            else
                return " ineligible, is failing a class.";}
        else if(gpa<2)
            return " ineligible, GPA is below 2.0.";
        else
            return " eligible.";
    }

    public String toString()
    {
        return first + " " + last + " has a gpa of "+getGPA()+" and is" + getElig(); 
    }
}                        