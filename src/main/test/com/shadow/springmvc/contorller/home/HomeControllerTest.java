package com.shadow.springmvc.contorller.home;

import com.shadow.springmvc.controller.home.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.net.URI;

/**
 * Created by shadow on 17/4/9.
 */
public class HomeControllerTest {

    @Test
    public void home() throws  Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(MockMvcRequestBuilders.get(new URI("/"))) // /home/
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }
}