package com.spice.communication.mobileinventoryservice.service;

import com.spice.communication.mobileinventoryservice.service.vo.request.BrandRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.BrandResponseVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.DropdownVO;

import java.util.List;

public interface BrandService {
    BrandResponseVO addBrand(BrandRequestVO brandRequestVO);

    List<DropdownVO> fetchBrandsDD();
}
