package com.example.vuejslearning;

import com.example.controllers.MainController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class VueJsLearningApplicationTests {

    @Autowired
    private MainController mainController;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(mainController);
        assertThat(mainController).isNotNull();
    }

}
