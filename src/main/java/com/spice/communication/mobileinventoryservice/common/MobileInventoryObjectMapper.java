package com.spice.communication.mobileinventoryservice.common;

import com.spice.communication.mobileinventoryservice.common.constant.Constants;
import com.spice.communication.mobileinventoryservice.common.constant.Constants.RAM;
import com.spice.communication.mobileinventoryservice.common.constant.Constants.STORAGE;
import com.spice.communication.mobileinventoryservice.dao.model.Brand;
import com.spice.communication.mobileinventoryservice.dao.model.Mobile;
import com.spice.communication.mobileinventoryservice.dao.model.Variant;
import com.spice.communication.mobileinventoryservice.service.vo.request.BrandRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.request.MobileRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.request.VariantRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.BrandResponseVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.DropdownVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.MobileResponseVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.VariantResponseVO;
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
        mobile.setBrand(new Brand(mobileRequestVO.getBrandId()));
        return mobile;
    }

    public MobileResponseVO convertModelToVo(Mobile mobile){
        MobileResponseVO mobileResponseVO=new MobileResponseVO();
        mobileResponseVO.setMobId(mobile.getMobileId());
        mobileResponseVO.setMobName(mobile.getMobileName());

        Brand brand = mobile.getBrand();
        if(brand != null) {
            mobileResponseVO.setBrandId(brand.getBrandId());
        }

        return mobileResponseVO;
    }

    public Variant convertVoToModel(VariantRequestVO variantRequestVO){
        Variant variant = new Variant();
        variant.setVariantId(variantRequestVO.getVariantId());
        variant.setAvailablePiece(variantRequestVO.getAvailablePiece());
        variant.setPrice(variantRequestVO.getPrice());
        variant.setRam(searchRam(variantRequestVO.getRam()));
        variant.setTotalPiece(variantRequestVO.getTotalPiece());
        variant.setStorage(searchStorage(variantRequestVO.getStorage()));
        variant.setMobile(new Mobile(variantRequestVO.getMobileId()));
        return variant;
    }

    public VariantResponseVO convertModelToVo(Variant variant) {
    VariantResponseVO variantResponseVO = new VariantResponseVO();
    variantResponseVO.setVariantId(variant.getVariantId());
    variantResponseVO.setAvailablePiece(variant.getAvailablePiece());
    variantResponseVO.setPrice(variant.getPrice());
    variantResponseVO.setTotalPiece(variant.getTotalPiece());
    variantResponseVO.setMobileId((variant.getMobile().getMobileId()));
    variantResponseVO.setRam(searchRam(variant.getRam()));
    variantResponseVO.setStorage(searchStorage(variant.getStorage()));
    return variantResponseVO;

    }

    public String searchRam(Integer code) {
        for (RAM ram : RAM.values()) {
            if (ram.getCode().intValue() == code.intValue()) {
                return ram.getDesc();
            }
        }
        return null;
    }

    public String searchStorage(Integer code){
        for(STORAGE storage:STORAGE.values()){
            if(storage.getCode().intValue()==code.intValue()){
                return storage.getDesc();
            }
        }
        return null;
    }

    public  Integer searchRam(String desc){
        for (RAM ram: RAM.values()){
            if(ram.getDesc().equals(desc)){
                return ram.getCode();
            }
        }
        return null;
    }

    public Integer searchStorage(String desc){
        for(STORAGE storage:STORAGE.values()){
            if(storage.getDesc().equals(desc)){
                return storage.getCode();
            }
        }
        return null;
    }




}
