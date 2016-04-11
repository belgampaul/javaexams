package io.ikka.exams.parsers.wiley;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author ikka
 * @date: 09.04.2016.
 */
public class DownloadWebApp {

  public static final String TMP_APP = "./tmp/app";

  public static void main(String[] args) {
    URL resource = DownloadWebApp.class.getClassLoader().getResource("com.wiley.sybextestbank/src.html");

    if (resource != null) {
      String webSiteRoot = "http://sybextestbanks.wiley.com";
      saveFiles(resource.getFile(), webSiteRoot, TMP_APP);
    }
  }

  private static void saveFiles(String file, String webSiteRoot, String destDir) {
    Document parse;
    try {
      parse = Jsoup.parse(new File(file), StandardCharsets.UTF_8.name());
      Elements script = parse.select("script");

      for (Element element : script) {
      }

      script.parallelStream().forEach(element -> {
        String src = element.attr("src");

        if (src.length() != 0) {
          URL url = null;
          try {
            url = new URL(webSiteRoot + src);

            try (InputStream is = url.openStream()) {  // throws an IOException
              byte[] buffer = new byte[is.available()];
              //noinspection ResultOfMethodCallIgnored
              is.read(buffer);

              String pathname = destDir + src;
              File targetFile = new File(pathname);
              File targetDir = new File(targetFile.getParent());
              //noinspection ResultOfMethodCallIgnored
              targetDir.mkdirs();
              try (OutputStream outStream = new FileOutputStream(targetFile)) {
                outStream.write(buffer);
              }
            } catch (IOException e) {
              e.printStackTrace();
            }
          } catch (MalformedURLException e) {
            e.printStackTrace();
          }
        }
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
