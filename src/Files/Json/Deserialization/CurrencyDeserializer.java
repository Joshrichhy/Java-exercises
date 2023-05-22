package Files.Json.Deserialization;
import Files.Json.Currency;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;

public class CurrencyDeserializer {
    public static Currency deserializeJsonToCurrency(JSONObject Json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(Json.getString("rates"), Currency.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
