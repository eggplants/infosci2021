class Aaa
{
    int xxx;
    void yyy(){  xxx=1;  }
}

public class Bbb extends Aaa
{
    final Aaa finalref= new Aaa();
    final void yyy()
    {
            System.out.println("In method yyy()");
            finalref.xxx=12345;
    }
}
