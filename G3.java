import java.util.*;
class Gen<T>
{
    T obj;
    public Gen(T obj)
    {
        this.obj=obj;
    }

    void display()
    {
        System.out.println("The type of data is : " + obj.getClass().getName());
    }
    public T getObj()
    {
        return obj;
    }

}

public class G3 
{
    public static void main(String args[])
    {
        Gen<Integer> g = new Gen<Integer>(10);
        g.display();
        System.out.println(g.getObj());
        System.out.println("**************************************");
        Gen<String> g1 = new Gen<String>("Pushpak");
        g1.display();
        System.out.println(g1.getObj());
    }
    
}