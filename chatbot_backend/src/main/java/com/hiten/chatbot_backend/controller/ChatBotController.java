package com.hiten.chatbot_backend.controller;

import com.hiten.chatbot_backend.dto.PromptBody;
import com.hiten.chatbot_backend.response.ApiResponse;
import com.hiten.chatbot_backend.service.ChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai/chat")
public class ChatBotController {


    private final ChatBotService chatBotService;




    public ChatBotController(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }


    @PostMapping
    public ResponseEntity<ApiResponse> getCoinDetails(@RequestBody PromptBody prompt) throws Exception {

        chatBotService.getCoinDetails(prompt.getPrompt());


        ApiResponse response= new ApiResponse();
        response.setMessage(prompt.getPrompt());


        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("/simple")
    public ResponseEntity<String> simpleChatHandler(@RequestBody PromptBody prompt) throws Exception {

        String response =chatBotService.simpleChat(prompt.getPrompt());





        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
