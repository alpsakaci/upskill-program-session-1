package com.example.session1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void sayHello_NoParamsGiven_ReturnHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8"))
                .andExpect(content().string("Hello world."))
                .andReturn();
    }

    @Test
    void sayHello_NameParamGiven_ReturnGreetingMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/Annie")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8"))
                .andExpect(content().string("Hello, Annie."))
                .andReturn();
    }

    @Test
    void sayHello_NameParamGivenWithAllLettersUppercase_ReturnGreetingMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/BART")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8"))
                .andExpect(content().string("HELLO, BART!"))
                .andReturn();
    }

    @Test
    void sayHello_NameParamGivenWithMoreThanOneNames_ReturnGreetingMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/Annie,Bart")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8"))
                .andExpect(content().string("Hello, Annie and Bart."))
                .andReturn();
    }

    @Test
    void sayHello_NameParamGivenWithMoreThanOneNamesAndAllLettersUppercase_ReturnGreetingMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/ANNIE,BART")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8"))
                .andExpect(content().string("HELLO, ANNIE AND BART!"))
                .andReturn();
    }
}
