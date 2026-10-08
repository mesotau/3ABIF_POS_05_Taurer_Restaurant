

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestRestaurant{
    
    // "Roma", -80, true
    @Test
    public void test_setSitzplaetze_unter(){
    
        Restaurant r;
        r = new Restaurant("Roma", -80, true);
        //Fehler
        assertEquals(0, r.getSitzplaetze());
    }
    
    // "Akropolis", 60, true
    @Test
    public void test_setSitzplaetze_okay(){
    
        Restaurant r;
        r = new Restaurant("Akropolis", 60, true);
        assertEquals(60, r.getSitzplaetze());
    }
    
    // "Steakhouse", 1100, false
    @Test
    public void test_setSitzplaetze_ueber(){
    
        Restaurant r;
        r = new Restaurant("Steakhouse", 1100, false);
        //Fehler
        assertEquals(0, r.getSitzplaetze());
    }
}