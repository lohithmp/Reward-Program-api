package com.rewards.app.service;
     
import com.rewards.app.dto.CustomerRewardResponse;
import com.rewards.app.dto.MonthlyRewardDto;
import com.rewards.app.entity.Transaction;
import com.rewards.app.repository.TransactionRepository;
import com.rewards.app.util.RewardUtil;
import com.rewards.app.exception.ResourceNotFoundException;
import com.rewards.app.service.RewardService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;


import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service implementation for reward calculation.
 */
@Service
public class RewardServiceImpl implements RewardService {

    private final TransactionRepository transactionRepository;

    public RewardServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public CustomerRewardResponse getRewardsByCustomerId(Long customerId) {

        List<Transaction> transactions = transactionRepository.findByCustomerId(customerId);

        if (transactions.isEmpty()) {
            throw new ResourceNotFoundException(
                    "No transactions found for customer id: " + customerId);
        }

        Map<Month, Long> monthlyRewardsMap = transactions.stream()
                .collect(Collectors.groupingBy(
                        transaction -> transaction.getTransactionDate().getMonth(),
                        Collectors.summingLong(transaction ->
                                RewardUtil.calculateRewardPoints(transaction.getAmount()))
                ));

        List<MonthlyRewardDto> monthlyRewards = monthlyRewardsMap.entrySet()
                .stream()
                .map(entry -> new MonthlyRewardDto(
                        entry.getKey().name(),
                        entry.getValue()))
                .toList();

        long totalRewards = monthlyRewards.stream()
                .mapToLong(MonthlyRewardDto::getPoints)
                .sum();

        Transaction transaction = transactions.get(0);

        return new CustomerRewardResponse(
                customerId,
                transaction.getCustomerName(),
                monthlyRewards,
                totalRewards);
    }
}