package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(AnimeQController.CHUCK)
public class AnimeQController {
    public static final String CHUCK = "/animeq";

    @Autowired
    AnimeQService animeQService;

    @GetMapping
    public String getAnimeQuote(Model model){

        animeQuote q = animeQService.getAnimeQuote();
        model.addAttribute("anime",q.anime());
        model.addAttribute("personaje",q.character());
        model.addAttribute("frase",q.quote());
        return "animeq";
    }

}
