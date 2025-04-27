package com.icoderman.structural.proxy.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Optional;

public class SecurityProxy implements TwitterService {

    private Optional<TwitterService> service;

    public SecurityProxy() {
        this.service = Optional.empty();
    }

    private void ensureServiceExists() {
        if(this.service.isPresent()) {
            return;
        }
        this.service = Optional.of(new TwitterServiceImpl());
    }

    @Override
    public String getTimeline(String screenName) {
        ensureServiceExists();
        return this.service.get().getTimeline(screenName);
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        throw new ProxyException("It is forbidden to use post functionality");

    }
}
