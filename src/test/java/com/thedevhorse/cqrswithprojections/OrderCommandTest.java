package com.thedevhorse.cqrswithprojections;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.thedevhorse.cqrswithprojections.command.OrderRequest;
import com.thedevhorse.cqrswithprojections.domain.Status;
import com.thedevhorse.cqrswithprojections.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class OrderCommandTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void givenOrderRequest_whenCreateOrderIsCalled_thenOrderIsPersisted() throws Exception {
        // Given
        OrderRequest orderRequest = new OrderRequest(
                123L,
                Status.IN_PROGRESS
        );

        // When
        mvc.perform(post("/api/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(orderRequest)))
                .andExpect(status().isOk());

        // Then
        assertTrue(orderRepository.findByNumber(123L).isPresent());
    }
}
