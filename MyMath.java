
public class MyMath
{
    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        else if(n==2)
            return true;
        for(int f=2; f<=Math.sqrt(n); f++)
        {
            if(n%f==0)
                return false;
        }
        return true;
    }

    public static long factorial(int n)
    {
        if(n==0)
            return 1;
        if(n<0){
            System.out.println("Not a number. Try again.");
            return 0;}
        long fact=1;
        for(int i=n; i>1; i--)
        {
            fact*=i;
        }
        return fact;
    }

    public static int romanToArabic(String r)
    {
        r=r.toUpperCase();
        int sum = 0;
        String r2=r;
        int len = r2.length();
        while(len>0)
        {
            if(r2.charAt(0)=='M'){
                sum+=1000;
                r2=r2.substring(1);}
            else if(r2.charAt(0)=='D'){
                sum+=500;
                r2=r2.substring(1);}
            else if(r2.charAt(0)=='L'){
                sum+=50;
                r2=r2.substring(1);}
            else if(r2.charAt(0)=='V'){
                sum+=5;
                r2=r2.substring(1);}
            else if(r2.charAt(0)=='C'){
                if(len>1&&r2.charAt(1)=='D'){
                    sum+=400;
                    r2=r2.substring(2);}
                else if(len>1&&r2.charAt(1)=='M'){
                    sum+=900;
                    r2=r2.substring(2);}
                else{
                    sum+=100;
                    r2=r2.substring(1);}}
            else if(r2.charAt(0)=='X'){
                if(len>1&&r2.charAt(1)=='L'){
                    sum+=40;
                    r2=r2.substring(2);}
                else if(len>1&&r2.charAt(1)=='C'){
                    sum+=90;
                    r2=r2.substring(2);}
                else{
                    sum+=10;
                    r2=r2.substring(1);}}
            else if(r2.charAt(0)=='I'){
                if(len>1&&r2.charAt(1)=='V'){
                    sum+=4;
                    r2=r2.substring(2);}
                else if(len>1&&r2.charAt(1)=='X'){
                    sum+=9;
                    r2=r2.substring(2);}
                else{
                    sum+=1;
                    r2=r2.substring(1);}}
            len=r2.length();
        }
        return sum;
    }

    public static String arabicToRoman(int a)
    {
        String roman = "";
        while(a>0)
        {
            if(a>=1000){
                roman+="M";
                a-=1000;}
            else if(a>=900){
                roman+="CM";
                a-=900;}
            else if(a>=500){
                roman+="D";
                a-=500;}
            else if(a>=400){
                roman+="CD";
                a-=400;}
            else if(a>=100){
                roman+="C";
                a-=100;}
            else if(a>=90){
                roman+="XC";
                a-=90;}
            else if(a>=50){
                roman+="L";
                a-=50;}
            else if(a>=40){
                roman+="XL";
                a-=40;}
            else if(a>=10){
                roman+="X";
                a-=10;}
            else if(a>=9){
                roman+="IX";
                a-=9;}
            else if(a>=5){
                roman+="V";
                a-=5;}
            else if(a>=4){
                roman+="IV";
                a-=4;}
            else{
                roman+="I";
                a--;}
        }
        return roman;
    }
    
}