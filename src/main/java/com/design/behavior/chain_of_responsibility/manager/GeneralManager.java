package com.design.behavior.chain_of_responsibility.manager;

/**
 * edited by AndersonKim
 * at 2019/1/23
 */
public class GeneralManager  extends FeeHandler {
    @Override
    public String handleFeeRequest(double fee) {
        String result="";
        if(fee>5000){
            if(haveSuccessor){
                return successor.handleFeeRequest(fee);
            }else{
                result="not solution";
            }
        }else{
            result="give out "+fee+" money";
        }
        return result;
    }
}
