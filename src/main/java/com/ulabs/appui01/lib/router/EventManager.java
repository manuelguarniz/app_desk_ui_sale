/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.appui01.lib.router;

import java.util.Map;

/**
 *
 * @author manuelguarniz
 */
public class EventManager {
    private Map<String, EventListener> listeners;

    public EventManager(Map<String, EventListener> listeners) {
        this.listeners = listeners;
    }
    
    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }
    
    public void unsubscribe(String eventType, EventListener listener) {
        listeners.remove(eventType, listener);
    }
    
    public void notify(String eventType, String action, Object data) {
        for (Map.Entry<String, EventListener> listener : listeners.entrySet()) {
            if (listener.getKey().equalsIgnoreCase(eventType)) {
                listener.getValue().update(action, data);
            }
        }
    }
}
