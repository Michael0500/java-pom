package ru.chitu.listeners;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

// Простая реализация интерфейса ServletRequestListener для
// записи IP-адреса ServletRequest во время инициализации и уничтожения запроса.
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();

        System.out.println("ServletRequest destroyed. Remote IP=" + servletRequest.getRemoteAddr());
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();

        System.out.println("ServletRequest initialized. Remote IP=" + servletRequest.getRemoteAddr());
    }
}