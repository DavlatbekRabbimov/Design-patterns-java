package davsdd.design.patterns.creationalpatterns.singleton.externalserviceconfig;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public interface IJSONData {
    static void printData(String dataStr) {
        try {
            JSONObject dataObject = new JSONObject(dataStr);
            JSONArray dataArray = dataObject.getJSONArray("data");
            for (int i = 0; i < dataArray.length(); i++) {
                JSONObject data = dataArray.getJSONObject(i);
                System.out.println();
                System.out.println("ID: " + data.getString("id"));
                System.out.println("NAME: " + data.getString("name"));
                System.out.println("RANK: " + data.getString("rank"));
                System.out.println("PRICE_USD: " + data.getString("price_usd"));
                System.out.println("PRICE_BTC: " + data.getString("price_btc"));
            }
        } catch (JSONException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
