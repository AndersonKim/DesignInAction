package com.design.behavior.chain_of_responsibility.filter;

/**
 * edited by AndersonKim
 * at 2019/2/11
 */
public class EncodeFilter implements  Filter {
    public String doFilter(String request, String response, FilterChain chain) {
        if("true".equals(request)){
            System.out.println("encode filter");
            return chain.doFilter(request,response);
        }else{
            return "false";
        }
    }
}
