package com.rewards.app.service;

import com.rewards.app.dto.CustomerRewardResponse;
import com.rewards.app.repository.TransactionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Unit tests for reward service.
 */
class RewardServiceImplTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private RewardServiceImpl rewardService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnRewardsForAllCustomers() {

        when(transactionRepository.getTransactions())
                .thenReturn(new TransactionRepository().getTransactions());

        List<CustomerRewardResponse> response =
                rewardService.getCustomerRewards();

        Assertions.assertEquals(4, response.size());
    }

    @Test
    void shouldHandleEmptyTransactionList() {

        when(transactionRepository.getTransactions())
                .thenReturn(List.of());

        List<CustomerRewardResponse> response =
                rewardService.getCustomerRewards();

        Assertions.assertTrue(response.isEmpty());
    }
}