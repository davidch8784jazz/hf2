package co.kr.hatchfly.hf.auth;

import com.github.scribejava.core.builder.api.DefaultApi20;
import org.springframework.beans.factory.annotation.Autowired;

public class NaverAPI20 extends DefaultApi20 {

    @Autowired
    NaverOauth naverOauth;

    private NaverAPI20(){
     }

    private static class InstanceHolder{
        private static final NaverAPI20 INSTANCE = new NaverAPI20();
    }

    public static NaverAPI20 instance(){

        return InstanceHolder.INSTANCE;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return naverOauth.getToken();
    }

    @Override
    protected String getAuthorizationBaseUrl() {
        return naverOauth.getAuth();
    }

}
