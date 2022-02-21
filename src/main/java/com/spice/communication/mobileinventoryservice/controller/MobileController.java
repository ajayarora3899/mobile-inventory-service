package com.spice.communication.mobileinventoryservice.controller;

import com.spice.communication.mobileinventoryservice.dao.model.Mobile;
import com.spice.communication.mobileinventoryservice.service.MobileService;
import com.spice.communication.mobileinventoryservice.service.vo.request.MobileRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.MobileResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/v1/mobiles")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @PostMapping("/addMob")
    public ResponseEntity addMob(@RequestBody MobileRequestVO mobileRequestVO){
        MobileResponseVO mobileResponseVO=mobileService.addMob(mobileRequestVO);
        return new ResponseEntity(mobileResponseVO, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity fetchMob(@RequestParam(name = "bid", required = false) Integer bid){
        List<MobileResponseVO> mobiles=mobileService.fetchMob(bid);
        return new ResponseEntity(mobiles,HttpStatus.OK);
    }
}

