/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.appui01.lib.router;

import java.util.HashMap;

/**
 *
 * @author manuelguarniz
 */
public class Router {
    private static Router instance;
        
    public EventManager events;
    
    private Router() {
        events = new EventManager(new HashMap<>());
    }
    
    public static Router route() {
        if (instance == null) {
            instance = new Router();
        }
        return instance;
    }
    
    public void on(String eventType, String action) {
        events.notify(eventType, action, null);
    }
    public void on(String eventType, String action, Object data) {
        events.notify(eventType, action, data);
    }
}
