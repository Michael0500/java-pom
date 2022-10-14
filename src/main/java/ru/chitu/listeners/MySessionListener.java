package ru.chitu.listeners;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

// Простая реализация регистрации событий, когда сеанс создается или уничтожается.
@WebFilter
public class MySessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        System.out.println("Session Created:: ID=" + sessionEvent.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        System.out.println("Session Destroyed:: ID=" + sessionEvent.getSession().getId());
    }
}