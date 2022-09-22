import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Superhero s;
    @BeforeEach
    void setup() {
        s = new Superhero("Oliver Queen", "Green Arrow", "Bueskytte", 8182, 1980, true);
    }

    @Test
    void SuperheroStyrke() {
        double expectedStyrke = 8182.0;
        double actualStyrke = s.getHeltStyrke();
        assertEquals(expectedStyrke, actualStyrke);
    }

    @Test
    void SuperheroMenneske() {
        boolean expectedMenneske = true;
        boolean actualMenneske = s.getMenneske();
        assertEquals(expectedMenneske, actualMenneske);
    }

    @Test
    void SuperheroAlder() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int expectedAlder = 42;
        int actualAlder = year - s.getHeltOprindelse();
        assertEquals(expectedAlder, actualAlder);
    }
}