package com.kodilla.good.patterns.food2door;

public class OrderProcess {

    private OrderInformation orderInformation;
    private ProviderProcess providerProcess;
    private CheckOrder checkOrder;

    public OrderProcess(final OrderInformation orderInformation,final ProviderProcess providerProcess,final CheckOrder checkOrder) {
        this.orderInformation = orderInformation;
        this.providerProcess = providerProcess;
        this.checkOrder = checkOrder;
    }

    public ProviderDto process(final OrderRequest orderRequest) {
        orderInformation.info(orderRequest.getProvider(), orderRequest.getProduct());
        boolean isOrder = providerProcess.process(orderRequest.getProduct());
        checkOrder.check(isOrder);
        return new ProviderDto(orderRequest.getProvider(),orderRequest.getProduct());
        }
}
