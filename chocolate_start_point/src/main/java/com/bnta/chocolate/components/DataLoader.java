package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateService chocolateService;

    @Autowired
    EstateService estateService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("Charlie's Chocolate Factory", "UK");
        Estate estate2 = new Estate("Zakaria's Chocolate Factory", "Somalia");
        Estate estate3 = new Estate("Tommy's Chocolate Factory", "Vietnam");

        estateService.saveEstate(estate1);
        estateService.saveEstate(estate2);
        estateService.saveEstate(estate3);

        Chocolate chocolate1 = new Chocolate("Malteasers", 80, estate1);
        Chocolate chocolate2 = new Chocolate("Bounty", 50, estate2);
        Chocolate chocolate3 = new Chocolate("Mars Bar", 60, estate3);
        Chocolate chocolate4 = new Chocolate("Milky Way", 85, estate2);
        Chocolate chocolate5 = new Chocolate("Galaxy", 90, estate1);

        chocolateService.saveChocolate(chocolate1);
        chocolateService.saveChocolate(chocolate2);
        chocolateService.saveChocolate(chocolate3);
        chocolateService.saveChocolate(chocolate4);
        chocolateService.saveChocolate(chocolate5);

    }
}
