import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Function_Test
{
    Function function = new Function();

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
        Student student1 = function.findById(6);
        System.out.println(student1);

        Student student = function.findById("500  OR 1=1");
        System.out.println(student);
        student = function.findById("500");
        System.out.println(student);
    }

    @Test
    void insert()
    {
        Student student = new Student(25, "张", "男", 25);
        function.insert(student);
    }

    @Test
    void update()
    {
        Student student = function.findById(25);
        student.setName("张无");
        function.update(student);
    }

    @Test
    void testUpdate()
    {
        Student student = function.findById(25);
        student.setNo(22);
        System.out.println(function.update(student, 25));
    }

    @Test
    void delete()
    {
        System.out.println(function.delete(22));
    }

    @Test
    void sort()
    {
        ArrayList<Student> list = function.sort("sex", "desc");
        for (Student student : list)
        {
            System.out.print(student);
        }
    }
}