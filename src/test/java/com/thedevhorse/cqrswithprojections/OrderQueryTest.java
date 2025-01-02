package com.thedevhorse.cqrswithprojections;

import com.thedevhorse.cqrswithprojections.domain.Status;
import com.thedevhorse.cqrswithprojections.repository.OrderEntity;
import com.thedevhorse.cqrswithprojections.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class OrderQueryTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private OrderRepository orderRepository;

    @BeforeEach
    public void setUp() {
        OrderEntity orderEntity = new OrderEntity(1234L, Status.IN_PROGRESS);
        orderRepository.save(orderEntity);
    }

    @Test
    void givenOrderNumber_whenGetOrdersByNumberIsCalled_thenOrderResponseIsReturned() throws Exception {
        // Given
        Long number = 1234L;

        // When
        ResultActions result = mvc.perform(get("/api/orders/{number}", number)
                .contentType(MediaType.APPLICATION_JSON));

        // Then
        result.andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value(number))
                .andExpect(jsonPath("$.status").value(Status.IN_PROGRESS.toString()));
    }
}
