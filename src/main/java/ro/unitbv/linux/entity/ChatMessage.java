package ro.unitbv.linux.entity;


import com.alibaba.fastjson.JSON;
/**
 * WebSocket mesaj
 */
public class ChatMessage {
    private String type;
    private String username;
    private String msg;
    private int onlineCount;


    public ChatMessage(String type, String username, String msg, int onlineCount) {
        this.type = type;
        this.username = username;
        this.msg = msg;
        this.onlineCount = onlineCount;
    }

    public static String jsonStr(String type, String username, String msg, int onlineCount) {
        return JSON.toJSONString(new ChatMessage(type, username, msg, onlineCount));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
