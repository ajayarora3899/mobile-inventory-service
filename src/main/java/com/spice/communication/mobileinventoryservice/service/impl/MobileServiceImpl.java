package com.spice.communication.mobileinventoryservice.service.impl;

import com.spice.communication.mobileinventoryservice.common.MobileInventoryObjectMapper;
import com.spice.communication.mobileinventoryservice.dao.MobileDao;
import com.spice.communication.mobileinventoryservice.dao.model.Mobile;
import com.spice.communication.mobileinventoryservice.service.MobileService;
import com.spice.communication.mobileinventoryservice.service.vo.request.MobileRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.MobileResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Throwable.class)
public class MobileServiceImpl implements MobileService {

    @Autowired
    MobileDao mobileDao;

    @Autowired
    MobileInventoryObjectMapper mobileInventoryObjectMapper;

    @Override
    public MobileResponseVO addMob(MobileRequestVO mobileRequestVO) {
        Mobile mobile= mobileInventoryObjectMapper.convertVoToModel(mobileRequestVO);
        mobile=mobileDao.save(mobile);
        MobileResponseVO mobileResponseVO=mobileInventoryObjectMapper.convertModelToVo(mobile);
        return mobileResponseVO;
    }

    @Override
    public List<MobileResponseVO> fetchMob(Integer bid) {
        List<Mobile> mobiles = null;

        if(bid != null) {
            mobiles = mobileDao.findAllByBrandId(bid);
        } else {
            mobiles = mobileDao.findAll();
        }

        List<MobileResponseVO> mobileResponseVOList=mobiles.stream().map(mobile -> mobileInventoryObjectMapper.convertModelToVo(mobile)).collect(Collectors.toList());
        return mobileResponseVOList;
    }
}
