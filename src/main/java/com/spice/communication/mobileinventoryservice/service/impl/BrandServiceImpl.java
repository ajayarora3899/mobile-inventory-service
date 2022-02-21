package com.spice.communication.mobileinventoryservice.service.impl;

import com.spice.communication.mobileinventoryservice.dao.BrandDao;
import com.spice.communication.mobileinventoryservice.dao.model.Brand;
import com.spice.communication.mobileinventoryservice.service.BrandService;
import com.spice.communication.mobileinventoryservice.service.vo.request.BrandRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.BrandResponseVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.DropdownVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Throwable.class)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private MobileInventoryObjectMapper mobileInventoryObjectMapper;

    @Autowired
    private BrandDao brandDao;

    @Override
    public BrandResponseVO addBrand(BrandRequestVO brandRequestVO) {
        Brand brand = mobileInventoryObjectMapper.convertVoToModel(brandRequestVO);
        brand = brandDao.save(brand);
        BrandResponseVO brandResponseVO = mobileInventoryObjectMapper.convertModelToVo(brand);
        return brandResponseVO;
    }

    @Override
    public List<DropdownVO> fetchBrandsDD() {
        List<Brand> brands = brandDao.findAll();
        List<DropdownVO> dropdownVOList = brands.stream().map(brand -> mobileInventoryObjectMapper.getDropdownVo(brand)).collect(Collectors.toList());
        return dropdownVOList;
    }


}
