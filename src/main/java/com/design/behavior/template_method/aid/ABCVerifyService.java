package com.design.behavior.template_method.aid;


/**
 * edited by AndersonKim
 * at 2019/1/16
 */
public class ABCVerifyService extends AbstractVerifyService {
    @Override
    protected String getVerifyUrl() {
        return "ABC verify url";
    }

    @Override
    protected String convertVerifyData(String data) {
        return "convert "+data+" to ABC form";
    }


    @Override
    protected String formatReceiveData(String data) {
        return "format ABC "+data+" to inner form";
    }
}
