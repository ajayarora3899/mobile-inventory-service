package com.spice.communication.mobileinventoryservice.controller;

import com.spice.communication.mobileinventoryservice.service.BrandService;
import com.spice.communication.mobileinventoryservice.service.vo.request.BrandRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.BrandResponseVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.DropdownVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("/create")
    public ResponseEntity addBrand(@Valid @RequestBody BrandRequestVO brandRequestVO){
        BrandResponseVO brandResponseVO = brandService.addBrand(brandRequestVO);
        return new ResponseEntity(brandResponseVO, HttpStatus.OK);
    }

    @GetMapping("/dropdown")
    public ResponseEntity fetchBrandsDD(){
        List<DropdownVO> dropdownVOList=brandService.fetchBrandsDD();
        return new ResponseEntity(dropdownVOList,HttpStatus.OK);
    }


}
