package com.hiten.chatbot_backend.service;

import com.hiten.chatbot_backend.response.ApiResponse;

public interface ChatBotService {

    ApiResponse getCoinDetails(String prompt);

    String simpleChat(String prompt);



}
