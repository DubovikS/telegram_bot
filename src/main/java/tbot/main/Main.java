package tbot.main;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import tbot.configurations.BotConfigurations;

/**
 * Created by sergei.dubovik on 8/24/2020.
 */
public class Main {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new BotConfigurations());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
