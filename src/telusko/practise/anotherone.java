package telusko.practise;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.net.*;
import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;

public class anotherone {
    int i;
    private static HttpURLConnection connection;

    public static void main(String[] args) {

        ArrayList<indiavschinesevirus> wewillwin = new ArrayList<>();
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            URL url = new URL("https://api.covid19api.com/live/country/india/status/confirmed");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(50000);
            connection.setReadTimeout(50000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader((connection.getErrorStream())));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

            //System.out.println(responseContent.toString());
            //parse(responseContent.toString());
            String responseBody = responseContent.toString();
            JSONArray albums = new JSONArray(responseBody);
            for( int i = 0 ; i <albums.length();i++)
            {
                JSONObject album= albums.getJSONObject(i);
                String country= album.getString("Country");
                String  data= album.getString("Date");
                int cases= album.getInt("Cases");
                String statuses = album.getString("Status");
                wewillwin.add(new indiavschinesevirus(country,data,cases,statuses));

            }
            for( indiavschinesevirus e : wewillwin)
            {
                System.out.println(e);

            }
        } catch (MalformedInputException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }

        /*HttpClient client = HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder().uri(URI.create("https://api.covid19api.com/live/country/india/status/confirmed")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(Main::parse)
                .join();*/
    }

}
