package com.tamsadan.mbti.oauth.info;

import com.tamsadan.mbti.oauth.domain.ProviderType;
import com.tamsadan.mbti.oauth.info.impl.GoogleOAuth2UserInfo;
import com.tamsadan.mbti.oauth.info.impl.KakaoOAuth2UserInfo;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(ProviderType providerType, Map<String, Object> attributes) {
        switch (providerType) {
            case GOOGLE: return new GoogleOAuth2UserInfo(attributes);
            case KAKAO: return new KakaoOAuth2UserInfo(attributes);
            default: throw new IllegalArgumentException("Invalid Provider Type.");
        }
    }
}

