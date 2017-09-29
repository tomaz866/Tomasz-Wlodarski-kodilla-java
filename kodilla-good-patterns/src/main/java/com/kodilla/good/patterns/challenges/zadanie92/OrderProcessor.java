package com.kodilla.good.patterns.challenges.zadanie92;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,final OrderService orderService,final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getUser(),orderRequest.getOrder(),orderRequest.getDate());
        if(isOrder) {
            informationService.inform(orderRequest.getUser(), orderRequest.getOrder());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getDate());
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), true);
        } else {
            return new OrderDto(orderRequest.getUser(),orderRequest.getOrder(),false);
        }
    }
}
