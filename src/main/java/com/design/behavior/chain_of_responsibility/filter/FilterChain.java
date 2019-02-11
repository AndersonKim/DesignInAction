package com.design.behavior.chain_of_responsibility.filter;

/**
 * edited by AndersonKim
 * at 2019/2/11
 */
public interface FilterChain {
    public String doFilter(String request,String response);
}
