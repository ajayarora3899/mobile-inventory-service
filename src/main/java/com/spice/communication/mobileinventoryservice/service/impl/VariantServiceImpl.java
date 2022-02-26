package com.spice.communication.mobileinventoryservice.service.impl;

import com.spice.communication.mobileinventoryservice.common.MobileInventoryObjectMapper;
import com.spice.communication.mobileinventoryservice.dao.VariantDao;
import com.spice.communication.mobileinventoryservice.dao.model.Variant;
import com.spice.communication.mobileinventoryservice.service.VariantService;
import com.spice.communication.mobileinventoryservice.service.vo.request.VariantRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.VariantResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VariantServiceImpl implements VariantService {

    @Autowired
    VariantDao variantDao;

    @Autowired
    MobileInventoryObjectMapper mobileInventoryObjectMapper;

    @Override
    public List<VariantResponseVO> addVariants(List<VariantRequestVO> variantRequestVOList) {
        List<VariantResponseVO> variantResponseVOList =new ArrayList<>();
        for(VariantRequestVO variantRequestVO: variantRequestVOList) {
            Variant variant = mobileInventoryObjectMapper.convertVoToModel(variantRequestVO);
           variant = variantDao.save(variant);
           VariantResponseVO variantResponseVO= mobileInventoryObjectMapper.convertModelToVo(variant);
           variantResponseVOList.add(variantResponseVO);
        }
        return variantResponseVOList;
    }
}
