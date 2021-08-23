import java.util.*;
class Mix
{
    String wrd;
    int len;
    Mix()
    {
        wrd="";
        len=0;
    }

    void feedword()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd=in.next();
        wrd=wrd.toUpperCase();
    }

    void mix_word(Mix P , Mix Q)
    {
        int minl,i;
        P.len=P.wrd.length();
        Q.len=Q.wrd.length();
        minl=P.len<Q.len?P.len:Q.len;
        for(i=0;i<minl;i++)
        {
            this.wrd=this.wrd+P.wrd.charAt(i)+Q.wrd.charAt(i);
        }
        if(P.len>minl)
        {
            this.wrd=this.wrd+P.wrd.substring(minl);
        }
        if(Q.len>minl)
        {
            this.wrd=this.wrd+Q.wrd.substring(minl);
        }
    }

    void display()
    {
        System.out.println("The mixed word is "+this.wrd);
    }

    public static void main()
    {
        Mix fw=new Mix();
        fw.feedword();
        Mix sw=new Mix();
        sw.feedword();
        Mix obj=new Mix();
        obj.mix_word(fw,sw);
        obj.display();
    }
}
