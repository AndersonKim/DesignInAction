package com.design.behavior.template_method.aid;


/**
 * edited by AndersonKim
 * at 2019/1/16
 */
public class BOCVerifyService extends AbstractVerifyService {
    @Override
    protected String getVerifyUrl() {
        return "BOC verify url";
    }

    @Override
    protected String convertVerifyData(String data) {
        return "convert "+data+" to BOC form";
    }


    @Override
    protected String formatReceiveData(String data) {
        return "format BOC "+data+" to inner form";
    }
}
