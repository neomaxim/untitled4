package main.java.lesson21.hw1;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
public class HelloWorldHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      try (  OutputStream responseBody = exchange.getResponseBody()) {
          String text = "Hello, World";
          exchange.sendResponseHeaders(200,text.getBytes().length);
          responseBody.write(text.getBytes());
      }

    }
}
