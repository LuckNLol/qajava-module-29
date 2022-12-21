import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    @BeforeClass
    void beforeClass(){
    }

    @AfterClass
    void afterClass() {
    }

    @DataProvider(name = "ageData")
    Object[][] dataProvider(){
        return new Object[][] {
                {-1, false},
                {13, false},
                {14, true},
                {15, true},
                {16, true},
                {17, true},
                {18, true},
                {19, false},
                {20, false}
        };
    }

    @Test(dataProvider = "ageData")
    public void personIsTeenager(int age, boolean result){
        System.out.println(result);
        assertEquals(Person.isTeenager(age), result);
    }
}
