package com.geektrust.backend.Services;

import com.geektrust.backend.Entites.Apartment;

public class BillService implements IBillservice{

    protected Apartment apartment;
    private Integer waterConsumptionOfGuests = 0;
    private Integer waterConsumptionOfResident = 0;
    
    WaterConsumptionService waterConsumptionService;
    CalculateCostService calculateCostService;
    
    public BillService(Apartment apartment,WaterConsumptionService waterConsumptionService,CalculateCostService calculateCostService)
    {
        this.apartment = apartment;
        this.waterConsumptionService = waterConsumptionService;
        this.calculateCostService = calculateCostService;
    }
    public Integer calculateBill()
    {
        Integer CostOfGuests = calculateCostService.calculateCostOfGuests();
        Integer CostOfResidents = calculateCostService.CalculateCostOfResidents();        
        return CostOfResidents + CostOfGuests;         
    }
    public Integer calculateWaterConsumption()
    {
        waterConsumptionOfGuests = waterConsumptionService.WaterConsumptionOfGuests();
        waterConsumptionOfResident = waterConsumptionService.WaterConsumptionOfResident();
        Integer totalConsumption = waterConsumptionOfGuests + waterConsumptionOfResident;
        return totalConsumption;
    }
    
    

    
}