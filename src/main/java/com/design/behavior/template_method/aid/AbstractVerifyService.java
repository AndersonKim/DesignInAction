package com.design.behavior.template_method.aid;

/**
 * edited by AndersonKim
 * at 2019/1/16
 * 顶层抽象认证的业务逻辑：
 * 1.包装接收到的请求信息后向认证第三方发送认证请求
 * 2.接收到第三方认证成功的回调信息转换后返回给业务系统
 */

public abstract class AbstractVerifyService {

    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：包装接收到的请求信息后向认证第三方发送认证请求
     * 1.接收到的请求包装成指定的格式（可能发生变更点：需要包装成的格式）
     * 2.将指定格式的数据发送给第三方进行认证（可能发生变更点：第三方的地址）
     */
    public final void postDataToVerify(String data){
        String toVerifyData = convertVerifyData(data);
        String verifyUrl=getVerifyUrl();
        sendDataToVerify(toVerifyData,verifyUrl);
    }

    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：获取认证第三方的地址
     */
    protected abstract String getVerifyUrl();

    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：将接收到的请求包装成认证方需要的格式
     */
    protected abstract String convertVerifyData(String data);

    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：向认证第三方的地址发送数据
     */
    protected final void sendDataToVerify(String toVerifyData, String verifyUrl){
        System.out.println("to verified data is : "+toVerifyData);
        System.out.println("upload url is : "+verifyUrl);
    }


    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：接收到第三方认证成功的回调信息转换后返回给业务系统
     * 1.接收第三方的请求后解析成业务系统需要的格式（可能发生变更点：第三方请求中的数据的格式）
     * 2.将认证结果的信息返回给需要的业务系统
     */
    public final void receiveDataFromVerify(String data){
        String formatData=formatReceiveData(data);
        sendDataToInnerSystem(formatData);
    }

    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：格式化从第三方接收到的数据为业务系统需要的格式
     */
    protected abstract String formatReceiveData(String data);

    /**
     * edit by AndersonKim
     * @Date：2019/1/16
     * @Description：将认证结果返回给内部的业务系统
     */
    protected final void sendDataToInnerSystem(String formatData){
        System.out.println("send data to inner system : "+formatData);
    }


}
