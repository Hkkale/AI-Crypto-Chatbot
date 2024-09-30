package com.hiten.chatbot_backend.service;

import com.hiten.chatbot_backend.response.ApiResponse;

public interface ChatBotService {

    ApiResponse getCoinDetails(String prompt) throws Exception;

    String simpleChat(String prompt);



}
