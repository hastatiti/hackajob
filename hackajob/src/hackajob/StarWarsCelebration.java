package hackajob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StarWarsCelebration {
	public static void main(String[] args) throws IOException {
		String theURL =  "https://www.bbc.co.uk/";
		URL requestURL = new URL(theURL);
		HttpURLConnection conn = (HttpURLConnection) requestURL.openConnection(); // connection
		JsonParser jp = new JsonParser(); // from gson
		JsonElement root = jp.parse(new InputStreamReader((InputStream) conn.getContent())); // Convert the input
		JsonObject rootobj = root.getAsJsonObject();
	}
}
