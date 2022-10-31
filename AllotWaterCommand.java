package com.geektrust.backend.Commands;

import java.util.List;

import com.geektrust.backend.Ratio;
import com.geektrust.backend.Services.AllotWaterService;

public class AllotWaterCommand implements Icommand {

    AllotWaterService allotWaterService;
    public AllotWaterCommand(AllotWaterService allotWaterService)
    {
        this.allotWaterService = allotWaterService;
    }
    
    @Override
    public void execute(List<String> tokens) {
        
        Integer ApartmentType = Integer.valueOf(tokens.get(1));
        int corporationRatio = Integer.parseInt(tokens.get(2).split(":")[0]);
        int borewellratio = Integer.parseInt(tokens.get(2).split(":")[1]);
        Ratio ratio = new Ratio(Integer.valueOf(corporationRatio),Integer.valueOf(borewellratio));
        allotWaterService.AllotWater(ApartmentType, ratio);
    }
}