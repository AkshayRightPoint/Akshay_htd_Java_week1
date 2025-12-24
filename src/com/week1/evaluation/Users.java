package com.week1.evaluation;

import java.util.*;

public class Users {
    public static void main(String[] args) {
        List<String> logs = List.of(
                "  u1 | LOGIN | 2024-01-01 10:00 ",
                "u2|LOGIN|2024-01-01 10:05",
                "u1 | LOGOUT | 2024-01-01 10:10",
                "u3 | LOGIN | 2024-01-01 10:15",
                "u2 | LOGIN | 2024-01-01 10:20",
                "u1 | LOGIN | 2024-01-01 10:25"
        );

        Map<String, Integer> map = new HashMap<>();
        for(String log:logs){
            String[] slice = log.split("\\|");

            String userId = slice[0].trim();
            String action = slice[1].trim();

            if(action.equals("LOGIN")){
                map.put(userId, map.getOrDefault(userId, 0)+1);
            }
        }

        List<Map.Entry<String, Integer>> result = new ArrayList<>(map.entrySet());
        result.sort((e1, e2) -> {
            int countCompare = e2.getValue().compareTo(e1.getValue());
            if (countCompare != 0) {
                return countCompare;
            }
            return e1.getKey().compareTo(e2.getKey());
        });

        result.forEach(e ->
                System.out.println(e.getKey() + " -> " + e.getValue())
        );

    }
}
