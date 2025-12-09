/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.appui01.ui.components.viewProfile.dto;

import com.ulabs.appui01.common.Util;
import java.time.LocalDateTime;

/**
 *
 * @author manuelguarniz
 */
public class ViewProfileDTO {
    private String username;
    private LocalDateTime lastConection;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getLastConection() {
        return lastConection;
    }

    public void setLastConection(LocalDateTime lastConection) {
        this.lastConection = lastConection;
    }
}
