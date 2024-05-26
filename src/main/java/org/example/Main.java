package org.example;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;

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
        System.out.println(getWord(5));

    }
    public static String getWord (int length){
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char)ThreadLocalRandom.current().nextInt('a','z'+1));
        }
        return sb.toString();
        // commit1
        // commit2

    }
}