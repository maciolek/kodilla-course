package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private SalesService salesService;
    private SalesRepository salesRepository;

    public ProductOrderService(final InformationService informationService, final SalesService salesService, final SalesRepository salesRepository) {
        this.informationService = informationService;
        this.salesService = salesService;
        this.salesRepository = salesRepository;
    }

    public void process(final SaleRequest saleRequest) {

        boolean isSold = salesService.sale(saleRequest.getUser(), saleRequest.getDateOfSale(), saleRequest.getProduct());

        if (isSold) {
            informationService.inform(saleRequest.getUser(), saleRequest.getProduct(), saleRequest.getDateOfSale());
            salesRepository.createSaleProduct(saleRequest.getUser(), saleRequest.getProduct(), saleRequest.getDateOfSale());
        }
    }
}
