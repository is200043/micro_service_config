/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business.promotion;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chonlakornpunphopthaworn
 */
@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    PromotionRespository promotionRespository;

    @GetMapping("/{promotionCode}")
    public Map<String, Object> getPromotion(@PathVariable String promotionCode) {
        Map<String, Object> result = new HashMap<>();
        Promotion promotion = promotionRespository.findByCode(promotionCode);
        if (promotion != null) {
            result.put("valid", true);
            result.put("discount", promotion.getDiscount());
        } else {
            result.put("valid", false);
        }
        return result;
    }
}
