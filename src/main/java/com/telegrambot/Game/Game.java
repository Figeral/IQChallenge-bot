package com.telegrambot.Game;

public class Game {
    public Game(){}
    

    public  String GuessNumber(int number){
        int rand=(int) Math.floor(Math.random()*100);
        String result="";
        if (number < rand) {
            result=String.format("Ur value is lower  than answer 🙈  ", rand);
        
        }else if (number > rand) {
            result= String.format("Ur value is higher than answer 😐  ", rand);
           
        }else{
            result="yeah You got it 🥳 🎉";
        }

        return result ;
    }
} 
