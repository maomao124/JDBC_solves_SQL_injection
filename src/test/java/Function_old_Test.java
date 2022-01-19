import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Function_old_Test
{
    Function_old function_old = new Function_old();

    @Test
    void findById()
    {
        Student student = function_old.findById("500  OR 1=1");
        System.out.println(student);
        student = function_old.findById("500");
        System.out.println(student);
    }

    @Test
    void sort()
    {
        ArrayList<Student> list = function_old.sort("no", "desc");
        for (Student student1 : list)
        {
            System.out.print(student1);
        }
    }
}