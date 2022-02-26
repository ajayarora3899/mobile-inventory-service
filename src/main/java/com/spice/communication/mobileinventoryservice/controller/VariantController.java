package com.spice.communication.mobileinventoryservice.controller;

import com.spice.communication.mobileinventoryservice.service.VariantService;
import com.spice.communication.mobileinventoryservice.service.vo.request.VariantRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.VariantResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/variants")
public class VariantController {

    @Autowired
    private VariantService variantService;

    @PostMapping("/add")
    public ResponseEntity addVariants(@RequestBody List<VariantRequestVO> variantRequestVOList){
       List<VariantResponseVO> variantResponseVOList =variantService.addVariants(variantRequestVOList);
       return new ResponseEntity(variantResponseVOList, HttpStatus.OK);
    }

}
