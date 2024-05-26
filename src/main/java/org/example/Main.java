package org.example;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL connection = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
// forgot to add a smile =)
        try (InputStream in = connection.openStream()) {
            Files.write(Path.of("Picture.jpg"), in.readAllBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Приложение завершило работу");
    }
}