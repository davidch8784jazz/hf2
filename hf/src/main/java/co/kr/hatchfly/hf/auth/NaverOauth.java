package co.kr.hatchfly.hf.auth;

import com.github.scribejava.core.builder.api.DefaultApi20;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;


@Component
public class NaverOauth implements SnsUrls {

    @Value("${naver.service}")
    private String service;

    @Value("${naver.client.id}")
    private String id;

    @Value("${naver.client.secret}")
    private String secret;

    @Value("${naver.redirect.url}")
    private String url;

    @Value("${naver.access.token}")
    private String token;

    @Value("${naver.auth}")
    private String auth;

    @Value("${naver.profile.url}")
    private String profileUrl;

    private DefaultApi20 defaultApi20;

  /*  public NaverOauth(String service, String id, String secret, String url, String token, String auth, String profileUrl) {
        this.service = service;
        this.id = id;
        this.secret = secret;
        this.url = url;
        this.token = token;
        this.auth = auth;
        this.profileUrl = profileUrl;

        if (StringUtils.equalsIgnoreCase(service,"naver")){
        this.defaultApi20 = NaverAPI20.instance();
        }
    }*/

    public String getId() {
        return id;
    }

    public String getSecret() {
        return secret;
    }

    public String getUrl() {
        return url;
    }

    public String getToken() {
        return token;
    }

    public String getAuth() {
        return auth;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public DefaultApi20 getDefaultApi20() {
        return defaultApi20;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id  +
                ", secret=" + secret +
                ", url=" + url +
                ", token=" + token;

    }

}
