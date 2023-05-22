

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Files.Json.Currency;
import Files.Json.Deserialization.CurrencyDeserializer;
import org.json.JSONObject;


public class CurrencyApi {
    static Currency currency;
    public static void main(String[] args) {
        String endpoint = "https://api.exchangerate-api.com/v4/latest/NGN";

        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            Scanner scanner = new Scanner(url.openStream());
            String response = scanner.useDelimiter("\\Z").next();
            scanner.close();
            JSONObject data = new JSONObject(response);


            BigDecimal usd = data.getJSONObject("rates").getBigDecimal("USD");
            BigDecimal eur = data.getJSONObject("rates").getBigDecimal("EUR");
            BigDecimal jpy = data.getJSONObject("rates").getBigDecimal("JPY");
            BigDecimal gbp = data.getJSONObject("rates").getBigDecimal("GBP");
            BigDecimal aud = data.getJSONObject("rates").getBigDecimal("AUD");
            BigDecimal cad = data.getJSONObject("rates").getBigDecimal("CAD");
            BigDecimal zar = data.getJSONObject("rates").getBigDecimal("ZAR");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}