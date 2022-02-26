package com.spice.communication.mobileinventoryservice.service.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class MobileResponseVO {

    @JsonProperty(value = "mid")
    private Integer mobId;

    @NotNull(message = "Mobile Name Required")
    @JsonProperty(value = "mname")
    private String mobName;

    @NotNull(message = "BrandId Name Required")
    private Integer brandId;

    public MobileResponseVO() {
    }

    public Integer getMobId() {
        return mobId;
    }

    public void setMobId(Integer mobId) {
        this.mobId = mobId;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
