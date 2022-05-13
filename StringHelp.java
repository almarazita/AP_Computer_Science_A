
public class StringHelp
{

    public static String alphabetize(String w1, String w2, String w3)
    {
        if(w1.compareTo(w2)<=0 && w1.compareTo(w3)<=0){
            if(w2.compareTo(w3)<=0)
                return w1+" "+w2+" "+w3;
            else
                return w1+" "+w3+" "+w2;}
        else if(w2.compareTo(w1)<=0 && w2.compareTo(w3)<=0){
            if(w1.compareTo(w3)<=0)
                return w2+" "+w1+" "+w3;
            else
                return w2+" "+w3+" "+w1;}
        else
        if(w2.compareTo(w1)<=0)
            return w3+" "+w2+" "+w1;
        else
            return w3+" "+w1+" "+w2;
    }

    public static String pigLatin(String word)
    {
        char firstChar = word.charAt(0);
        String ay = "ay";
        word = word.substring(1)+firstChar+ay;
        return word;
    }

    public static String firstLast(String lastFirst)
    {
        int len = lastFirst.length();
        int comma = lastFirst.indexOf(",");
        String last = lastFirst.substring(0, comma);
        String first = lastFirst.substring(comma+2);
        return first+" "+last;
    }

    public static int countChar(String phrase, char c)
    {
        int count = 0;
        phrase = phrase.toLowerCase();
        for(int i = 0; i<phrase.length(); i++)
        {
            if(phrase.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static String reverse(String phrase)
    {
        String rev = "";
        int len = phrase.length();
        for(int i=len-1; i>=0; i--)
        {
            rev+=phrase.charAt(i);
        }
        return rev;
    }

    public static String compact(String phrase)
    {
        phrase = phrase.toLowerCase();
        String compact = "";
        for(int i=0; i<phrase.length(); i++)
        {
            char c = phrase.charAt(i);
            if(c>='a' && c<='z')
                compact += c;
        }
        return compact;
    }

    public static boolean isPalindrome(String phrase)
    {
        String forward = compact(phrase);
        String backward = reverse(forward);
        if(forward.equals(backward))
            return true;
        else
            return false;
    }

    public static int countVowels(String phrase)
    {
        return countChar(phrase,'a')+countChar(phrase,'e')+countChar(phrase,'i')+countChar(phrase,'o')+countChar(phrase,'u');
    }

}

