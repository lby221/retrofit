package retrofit2;

/**
 * Created by baiyuliu on 5/23/17.
 */
public interface LoodahInterceptor {

    // returns authorization header value
    String addAuth();

    // add signature based on string to sign generated
    String addSignature(String stringToSign);

    // set custom user agent
    String setUserAgent();

    // set Loodah endpoint
    String setEndpoint();
}
