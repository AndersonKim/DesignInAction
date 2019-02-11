package com.design.behavior.chain_of_responsibility.filter;

import com.sun.deploy.net.HttpRequest;

/**
 * edited by AndersonKim
 * at 2019/2/6
 */
public interface Filter {
    public String doFilter(String request,String response,FilterChain chain);
}
