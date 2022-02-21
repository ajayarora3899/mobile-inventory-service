package com.spice.communication.mobileinventoryservice.service;

import com.spice.communication.mobileinventoryservice.service.vo.request.MobileRequestVO;
import com.spice.communication.mobileinventoryservice.service.vo.response.MobileResponseVO;

import java.util.List;

public interface MobileService {
    MobileResponseVO addMob(MobileRequestVO mobileRequestVO);

    List<MobileResponseVO> fetchMob(Integer bid);
}
