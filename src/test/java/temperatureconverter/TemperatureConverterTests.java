package temperatureconverter;

import org.junit.*;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class TemperatureConverterTests {
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void UnitTest(){
        systemInMock.provideLines("add 12","111",",1", "abc", ";c", "C","20");
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals('C', temperatureConverter.getUnit());
    }
    @Test
    public void TemperatureTest(){
        systemInMock.provideLines("C", ".04","O","q1", "add","20");
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(20.0,temperatureConverter.getTemperature(),0.001);
    }
}