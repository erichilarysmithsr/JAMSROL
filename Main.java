package com.caosreaxson;

import java.lang.Object;
import com.caosreaxson.Jmol;
import com.caosreaxson.Fasta;
import com.caosreaxson.CancerLocator;
import com.caosreaxson.APITest;
import com.caoreaxson.VaccinePipeline;


import com.squareup.okhttp.*;

class caosreaxsonMain {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    \"collection\":\"patientSymptoms\",\n    \"database\":\"Rasa\",\n    \"dataSource\":\"CAOS\",\n    \"projection\": {\"_id\": 1}\n\n}");
        Request request = new Request.Builder()
          .url("https://data.mongodb-api.com/app/data-hgnct/endpoint/data/v1/action/findOne")
          .method("POST", body)
          .addHeader("Content-Type", "application/json")
          .addHeader("Access-Control-Request-Headers", "*")
          .addHeader("api-key", "<API_KEY>")
          .build();
        Response response = client.newCall(request).execute();
    }
}
