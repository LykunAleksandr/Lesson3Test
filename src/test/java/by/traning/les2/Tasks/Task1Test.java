package by.traning.les2.Tasks;

import static org.junit.Assert.*;

public class Task1Test {

    @org.junit.Test
    public  void isEquelT1 (){
        boolean actual = Task1.isEquel(new int[] {1, 2, 3, 4});
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public  void isEquelT2 (){
        boolean actual = Task1.isEquel(new int[] {2, 3, 4, 1});
        boolean expected = true;
        assertEquals(expected, actual);
    }


}