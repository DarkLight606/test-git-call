package com.example;

import java.util.Map;

public class Usercode {
    
    public Map<String, Object> handle(Map<String, Object> data) {
        
        // Читаємо вхідний параметр
        String name = (String) data.getOrDefault("name", "World");
        Integer amount = (Integer) data.getOrDefault("amount", 0);
        
        // Додаємо нові параметри
        data.put("greeting", "Hello, " + name + "!");
        data.put("doubled_amount", amount * 2);
        data.put("processed", true);
        data.put("source", "java-git-call");
        
        // Повертаємо data
        return data;
    }
}
