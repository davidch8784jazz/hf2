package co.kr.hatchfly.hf.auth;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

public class SNSLogin {

    private OAuth20Service oAuth20Service;

    public SNSLogin(NaverOauth naverOauth){
        this.oAuth20Service = new ServiceBuilder(naverOauth.getId())
                .apiSecret(naverOauth.getSecret())
                .callback(naverOauth.getUrl())
                .scope(naverOauth.getProfileUrl())
                .build(naverOauth.getDefaultApi20());
    }

    public String getNaverAuthURL() {

        return this.oAuth20Service.getAuthorizationUrl();
    }
}
