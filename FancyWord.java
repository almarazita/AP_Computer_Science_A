
public class FancyWord
{    
    private String word;    
    public FancyWord()
    {
        word = "Annie";
    }

    public FancyWord(String s)
    {
        word = s;
    }

    public void printMat(char[][] mat)
    {
        System.out.println();
        for(char[] row: mat)
        {
            for(char c: row)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void fillMat(char[][] mat)
    {
        for(int r = 0; r<mat.length; r++)
        {
            for(int c= 0; c<mat[r].length; c++)
            {
                mat[r][c]= ' ';
            }
        }
    }

    public void boxWord()
    {
        int len = word.length();
        char[][] box = new char[len][len];
        fillMat(box);
        for(int c = 0; c<len; c++)
        {
            box[0][c] = word.charAt(c);
            box[len-1][c] = word.charAt(len-1-c);            
        }
        for(int r=0; r<box.length; r++)
        {
            box[r][0] = word.charAt(r);
            box[r][len-1] = word.charAt(len-1-r);
        }
        printMat(box);
    }

    public void glassWord()
    {
        int len = word.length();
        char[][] box = new char[len][len];
        fillMat(box);
        for(int c = 0; c<len; c++)
        {
            box[0][c] = word.charAt(c);
            box[len-1][c] = word.charAt(c);            
        }
        for(int r=1; r<box.length-1; r++)
        {
            box[r][r] = word.charAt(r);
            box[r][box.length-1-r] = word.charAt(len-1-r);
        }
        printMat(box);
    }

    public void spiderWebWord()
    {
        int len = word.length();
        char[][] box = new char[4*len-3][4*len-3];
        fillMat(box);
        int r = 0;
        for(int c=box.length/2; c>-1; c--)
        {
            box[r][c] = word.charAt(Math.abs(len-1-r));            
            box[r][box.length-1-c] = word.charAt(Math.abs(len-1-r));            
            box[box.length-1-r][c] = word.charAt(Math.abs(len-1-r));
            box[box.length-1-r][box.length-1-c] = word.charAt(Math.abs(len-1-r));
            r++;
        }
        for(int c=len; c<=box.length/2; c++)
        {
            box[c][c] = word.charAt(c-len+1);
            box[c][box.length-1-c] = word.charAt(c-len+1);
            box[box.length-1-c][c] = word.charAt(c-len+1);
            box[box.length-1-c][box.length-1-c] = word.charAt(c-len+1);
        }
        printMat(box);
    }
}

