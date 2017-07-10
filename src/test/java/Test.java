import com.aisino.domain.bean.protocol.User;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * DESCRIPTION：httpclient测试
 *
 * @author LuckyH
 * @create 2017-07-10 16:19
 **/
public class Test {

    public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = null;
            CloseableHttpResponse response = null;
            HttpPost httpPost = new HttpPost("http://127.0.0.1:10080/users/register");// 创建httpPost

            User user =new User();
            user.setAge("1");
            user.setSex("1");
            user.setUsername("1");
            //设置参数
            httpPost.setHeader("contentType","application/json");
            // 执行请求
            //设置参数
            StringEntity stringEntity = new StringEntity("123", "UTF-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            // 创建默认的httpClient实例.
            httpClient = HttpClients.createDefault();
            response = httpClient.execute(httpPost);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
