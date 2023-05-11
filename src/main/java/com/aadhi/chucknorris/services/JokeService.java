package com.aadhi.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeService {
    ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeService(){
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    public String fetchJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
