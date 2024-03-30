package org.example;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance = null;
    protected int num;

    private Logger(){
        this.num = 0;
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.printf("[%s %d] %s", LocalDateTime.now(), ++num, msg);
    }
}
