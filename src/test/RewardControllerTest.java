package com.rewards.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for reward API.
 */
@SpringBootTest
@AutoConfigureMockMvc
class RewardControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnRewardsSuccessfully() throws Exception {

        mockMvc.perform(get("/api/rewards"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldContainCustomerName() throws Exception {

        mockMvc.perform(get("/api/rewards"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].customerName").exists());
    }

    @Test
    void shouldContainTotalRewardPoints() throws Exception {

        mockMvc.perform(get("/api/rewards"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].totalRewardPoints").exists());
    }
}