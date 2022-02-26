package com.spice.communication.mobileinventoryservice.service;


import com.spice.communication.mobileinventoryservice.service.vo.request.VariantRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.VariantResponseVO;

import java.util.List;

public interface VariantService {


    List<VariantResponseVO> addVariants(List<VariantRequestVO> variantRequestVOList);
}
