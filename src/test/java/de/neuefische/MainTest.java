package de.neuefische;

import org.junit.jupiter.api.Test;

import javax.naming.AuthenticationNotSupportedException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void return_My_Name() {
        //GIVEN
        String someString = "Alex";

        //WHEN
        String actual = Main.name(someString);

        //THEN
        assertEquals("Alex", actual);
    }

    @Test
    void return_My_Name_5_Times_With_Loop() {
        //GIVEN
        String someString = "Alex";
        int i = 0;

        //WHEN
        String actual = Main.nameLoop(someString);

        //THEN
        assertEquals("""
                Alex
                Alex
                Alex
                Alex
                Alex
                """, actual);

    }

    @Test
    void check_Is_Number_bigger_Than_Zero() {
        //GIVEN
        int number = 10;

        //WHEN
        boolean actual = Main.checkNumber(number);

        //THEN
        assertEquals(true, actual);
    }

    @Test
    void create_Square() {
        //GIVEN
        int number = 10;

        //WHEN
        int actual = Main.square(number);

        //THEN
        assertEquals(100, actual);
    }

    /*@Test
    void create_Array_With_Strings() {
        //GIVEN
        String eins = "Eins";
        String zwei = "zwei";
        String drei = "drei";


        //WHEN
        int actual = Main.stringArray(s);

        //THEN
        assertEquals(100, actual);
    }
*/

}




