package com.example.emailverificationapicomp1011g.Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EmailVerificationAPI {

    private final String apikey="92928b756e623357b3bd80e8dc90deae9b0c6e4072a8c70c9ffbc9c7dbcfb86ac016307558928c49dc8d983a5500519a";

    private void checkEmail(String email) throws Exception {

        String url = "https://verifier.meetchopra.com/verify/" + email + "?token=" +apikey;
        URL urlobj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) urlobj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/17.0");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response);
    }

    public static void main(String[] args)
    {
        EmailVerificationAPI ev= new EmailVerificationAPI();
        try
        {
            ev.checkEmail("abc@123.com");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

