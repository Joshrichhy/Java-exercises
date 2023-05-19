
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


import javax.swing.JOptionPane;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


    public class CurrencyApi2  {
        public static void main(String[] args) {
            try {
                String apikey = "Ok5w8KSsWBxqUMD3r4bo13ZgoHos0sYttAjCbgNt";
                String url = "https://api.currencyapi.com/v3/latest?apikey=" + apikey;
                URL urlForGetRequest = new URL(url);
                String readLine = null;
                HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
                conection.setRequestMethod("GET");
                int responseCode = conection.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                    StringBuffer response = new StringBuffer();
                    while ((readLine = in.readLine()) != null) {
                        response.append(readLine);
                    }
                    in.close();
                    System.out.println(response.toString());
                    JSONObject jsonObject = new JSONObject(String.valueOf(response));

                } else {
                    throw new Exception("Error in API Call");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }





    }
}
