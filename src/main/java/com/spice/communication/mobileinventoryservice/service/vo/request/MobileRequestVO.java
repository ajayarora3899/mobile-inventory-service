package com.spice.communication.mobileinventoryservice.service.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class MobileRequestVO {

    @JsonProperty(value = "mid")
    private Integer mobId;

    @NotNull(message = "Mobile Name Required")
    @JsonProperty(value = "mname")
    private String mobName;

    @NotNull(message = "Price Required")
    private Integer price;

    @NotNull(message = "Variant Name Required")
    private String variant;

    @NotNull(message = "BrandId Name Required")
    private Integer brandId;

    public MobileRequestVO() {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
