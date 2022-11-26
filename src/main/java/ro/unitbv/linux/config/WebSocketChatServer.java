package ro.unitbv.linux.config;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import ro.unitbv.linux.entity.ChatMessage;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
@ServerEndpoint("/chat/{username}")
public class WebSocketChatServer {

    /**
     * Toate sesiunile de chat
     */
    private static Map<String, Session> onlineSessions = new ConcurrentHashMap<>();
    private static HashMap<String, String> users = new HashMap<>();

    private static void sendMessageToAll(String msg) {
        //TODO: add send message method.
        onlineSessions.forEach((id, session) -> {
            try {
                session.getBasicRemote().sendText(msg);
            } catch(IOException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Deschide conexiunea, 1) Adauga sesiunea, 2) Adauga utilizatorul.
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("username") String user) {
        //TODO: add on open connection.
        onlineSessions.put(session.getId(), session);
        users.put(session.getId(), user);
        sendMessageToAll(ChatMessage.jsonStr("ENTER", user, "a intrat în conversație", onlineSessions.size()));
    }

    /**
     * Trimite mesaj, 1) primeste username și sesiunea, 2) trimite mesajul către toți.
     */
    @OnMessage
    public void onMessage(Session session, String jsonStr) {
        //TODO: add send message.
        ChatMessage message = JSON.parseObject(jsonStr, ChatMessage.class);
     sendMessageToAll(ChatMessage.jsonStr("SPEAK", message.getUsername(), message.getMsg(), onlineSessions.size()));
    }

    /**
     * Inchide conexiunea, 1) Șterge conexiunea, 2) actualizează utilizatorul.
     */
    @OnClose
    public void onClose(Session session) {
        //TODO: add close connection.
        onlineSessions.remove(session.getId());
        sendMessageToAll(ChatMessage.jsonStr("LEAVE", "", "a părasit chat-ul", onlineSessions.size()));
    }

    /**
     * Afișează exceptie.
     */
    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

}
