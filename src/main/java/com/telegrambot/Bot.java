package com.telegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.telegrambot.Game.Game;

public class Bot  extends TelegramLongPollingBot{
String token ="6544277286:AAHSPQdHgM8YIKVQM0fGJzXXN04iudE3pNg";
String username="FizyBot";
    @Override
    public void onUpdateReceived(Update update)  {
    if (update.hasMessage() || update.getMessage().hasText()) {
        SendMessage msg= new SendMessage(); 
        Game game= new Game();    
        msg.setChatId(update.getMessage().getChatId().toString());   
        msg.setText(game.GuessNumber(Integer.parseInt(update.getMessage().getText()))); 
        
        try {
            execute(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

    @Override
    public String getBotToken() {

          return token; 
        }

    @Override
    public String getBotUsername() {
         return username ;   }
    
}
