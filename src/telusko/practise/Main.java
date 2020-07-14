package telusko.practise;



import com.google.gson.Gson;
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
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Main {
    int i;
    private static HttpURLConnection connection;


    public static void main(String[] args) {

        ArrayList<indiavschinesevirus> wewillwin = new ArrayList<>();
        BufferedReader reader;
        String line;
        Gson gson = new Gson();
        StringBuffer responseContent = new StringBuffer();
        Map<String,String> p = new HashMap<String, String>();
        ArrayList<String> r = new ArrayList<>();
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
                    r.add(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                    r.add(line);

                }
                reader.close();
            }


            System.out.println(responseContent.toString());
            String pr = responseContent.toString();
            String[] re = pr.split(",");
            System.out.println(re.length);
            System.out.println();
            for( String q: re )
            {
                System.out.println(q);
                System.out.println();
                String[] m = q.split(":");
                System.out.println();
                for( String l :m)
                {
                    if( l.contains("\"Country\""));
                }
            }



            //parse(responseContent.toString());
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

    public  static void parse(String responseBody){
        int i;
        JSONArray albums = new JSONArray(responseBody);
        for(  i=0;i<albums.length()-1;i++);
        {
            JSONObject album= albums.getJSONObject(i);
            String country= album.getString("Country");
            String  data= album.getString("Date");
            int cases= album.getInt("Cases");
            String status = album.getString("Status");
            System.out.println(country);System.out.println(data);System.out.println(cases);System.out.println(status);
        }
    }
}