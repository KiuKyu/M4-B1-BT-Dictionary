package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary implements IDictionary {
    static Map<String, String> map = new HashMap<>();

    static {
        map.put("안녕하세요", "hello");
        map.put("xinchao", "hello");
    }

    @Override
    public String search(String keyword) {
        return map.get(keyword);
    }
}
