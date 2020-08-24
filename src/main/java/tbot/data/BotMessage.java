package tbot.data;

/**
 * Created by sergei.dubovik on 8/24/2020.
 */
public class BotMessage {

    private final int chatId;
    private final String text;

    public BotMessage(int chatId, String text) {
        this.chatId = chatId;
        this.text = text;
    }

    public int getChatId() {
        return chatId;
    }

    public String getText() {
        return text;
    }

    public void send(){

    }
}
