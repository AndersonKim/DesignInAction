package com.design.behavior.strategy.share.path;

import com.design.behavior.strategy.share.content.ShareImage;
import com.design.behavior.strategy.share.content.ShareLink;

public class WeixinShare implements ShareImage, ShareLink {
    @Override
    public String shareImage() {
        return null;
    }

    @Override
    public String shareLink() {
        return null;
    }
}
