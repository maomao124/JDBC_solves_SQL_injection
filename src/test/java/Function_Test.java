import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Function_Test
{
Function function=new Function();
    @Test
    void find()
    {
        ArrayList<Student> list = function.find();
        for (Student student1 : list)
        {
            System.out.print(student1);
        }
    }

    @Test
    void findById()
    {
        Student student = function.findById(6);
        System.out.println(student);
    }

    @Test
    void insert()
    {

    }

    @Test
    void update()
    {

    }

    @Test
    void testUpdate()
    {

    }

    @Test
    void delete()
    {

    }

    @Test
    void sort()
    {

    }
}