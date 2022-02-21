package com.spice.communication.mobileinventoryservice.service.impl;

import com.spice.communication.mobileinventoryservice.dao.model.Brand;
import com.spice.communication.mobileinventoryservice.dao.model.Mobile;
import com.spice.communication.mobileinventoryservice.service.vo.request.BrandRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.request.MobileRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.BrandResponseVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.DropdownVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.MobileResponseVO;
import org.springframework.stereotype.Component;

@Component
public class MobileInventoryObjectMapper {

    public Brand convertVoToModel(BrandRequestVO brandRequestVO) {
        Brand brand = new Brand();
        brand.setBrandId(brandRequestVO.getBrandId());
        brand.setBrandName(brandRequestVO.getBrandName());
        return brand;
    }

    public BrandResponseVO convertModelToVo(Brand brand) {
        BrandResponseVO brandResponseVO=new BrandResponseVO();
        brandResponseVO.setBrandId(brand.getBrandId());
        brandResponseVO.setBrandName(brand.getBrandName());
        return brandResponseVO;
    }

    public DropdownVO getDropdownVo(Brand brand) {
        DropdownVO dropdownVO = new DropdownVO();
        dropdownVO.setKey(brand.getBrandId());
        dropdownVO.setValue(brand.getBrandName());
        return dropdownVO;
    }

    public Mobile convertVoToModel(MobileRequestVO mobileRequestVO){
        Mobile mobile=new Mobile();
        mobile.setMobileId(mobileRequestVO.getMobId());
        mobile.setMobileName(mobileRequestVO.getMobName());
        mobile.setPrice(mobileRequestVO.getPrice());
        mobile.setVariant(mobileRequestVO.getVariant());
        mobile.setBrand(new Brand(mobileRequestVO.getBrandId()));
        return mobile;
    }

    public MobileResponseVO convertModelToVo(Mobile mobile){
        MobileResponseVO mobileResponseVO=new MobileResponseVO();
        mobileResponseVO.setMobId(mobile.getMobileId());
        mobileResponseVO.setMobName(mobile.getMobileName());
        mobileResponseVO.setPrice(mobile.getPrice());
        mobileResponseVO.setVariant(mobile.getVariant());

        Brand brand = mobile.getBrand();
        if(brand != null) {
            mobileResponseVO.setBrandId(brand.getBrandId());
        }

        return mobileResponseVO;
    }
}
