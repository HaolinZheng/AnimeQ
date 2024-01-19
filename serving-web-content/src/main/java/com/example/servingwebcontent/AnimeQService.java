package com.example.servingwebcontent;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AnimeQService {

    RestTemplate restTemplate = new RestTemplate();

    public animeQuote getAnimeQuote(){
        animeQuote quote = restTemplate.getForObject(
                "https://animechan.xyz/api/random", animeQuote.class
        );
        return quote;
    }
}
