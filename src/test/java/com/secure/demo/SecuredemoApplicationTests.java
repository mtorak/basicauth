package com.secure.demo;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.Base64;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SecuredemoApplicationTests {

  @Test
  void contextLoads() throws IOException {

    String encoding = Base64.getEncoder().encodeToString(("user" + ":" + "password").getBytes());
    String authHeader = "Basic " + encoding;

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
        .url("http://localhost:8080/employees")
        .get()
        .addHeader("Authorization", authHeader)
        .build();

    Response response = client.newCall(request).execute();
    log.info("Response: {}", response.body().string());
  }

}
