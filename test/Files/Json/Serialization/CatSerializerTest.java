package Files.Json.Serialization;

import Files.Json.Cat;
import Files.Json.Deserialization.CatDeserializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {

    Cat cat;
    private LocalDateTime dateOfBirth =     LocalDateTime.now().minusYears(20);
    DateTimeFormatter formatter;

    @BeforeEach
    void setUP(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);


    }
    @Test
    public void testConvertCatToJson(){
        String catJson = CatSerializer.convertCatToJson(cat);
        assertNotNull(catJson);
        System.out.println(catJson);
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"birthday\":"+"\"" +
                formatter.format(dateOfBirth)+"\""+"}", catJson);
    }

    @Test
    public void testConvertJsonToCat(){
        String catJson = "{\"name\":\"Tom\",\"age\":20,\"birthday\":"+"\"" +
                formatter.format(dateOfBirth)+"\""+"}";
      Cat cat =  CatDeserializer.deserializeJsonToCat(catJson);
      assertNotNull(cat);
      assertEquals("Tom", cat.getName());

       assertEquals(20, cat.getAge());
    }

    @Test
    public void testConvertCatToJsonIgnoresNullValues(){
        cat.setName(null);
        String catJson = CatSerializer.convertCatToJson(cat);
        assertNotNull(catJson);
        System.out.println(catJson);
        assertEquals("{\"age\":20,\"birthday\":"+"\"" +
                formatter.format(dateOfBirth)+"\""+"}", catJson);
    }

}