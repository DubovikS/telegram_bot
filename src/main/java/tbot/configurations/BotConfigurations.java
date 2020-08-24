package tbot.configurations;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import tbot.net.HttpClient;

import java.util.List;

/**
 * Created by sergei.dubovik on 8/24/2020.
 */
public class BotConfigurations extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        String command = update.getMessage().getText();

        if(command.equalsIgnoreCase("/name")){
            System.out.println("command name");
        } else {
            System.out.println("else");
        }
        Long chatId = update.getMessage().getChatId();
        String url = "https://api.telegram.org/bot1349171198:AAF7XjjZ_HBgyvyRjL0T-ThGocXzve6a5hU/sendMessage";
        String data = "HELLO";
        HttpClient.POST(url, data);
    }

    public String getBotUsername() {
        return "IWD_bot";
    }

    public String getBotToken() {
        return "1349171198:AAF7XjjZ_HBgyvyRjL0T-ThGocXzve6a5hU";
    }
}
