package com.example.servingwebcontent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record animeQuote(String anime, String character, String quote) {
}
