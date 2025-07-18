package main.java.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AgeCounting {
    public static void main(String[] args) {
        String urlString = "https://coderbyte.com/api/challenges/json/age-counting";
        String token = "RIVB3L8ZQ";

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;

            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            String json = response.toString();
            String data = json.split("\"data\":")[1].split("\"}")[0];
            String[] entries = data.split(",");
            int count = 0;
            for (String entry : entries) {
                entry = entry.trim();
                if (entry.contains("age=")) {
                    int age = Integer.parseInt(entry.split("age=")[1].trim());
                    if (age >= 50) {
                        count++;
                    }
                }
            }
            String result = token + count;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
