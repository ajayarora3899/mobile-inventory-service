package com.spice.communication.mobileinventoryservice.service.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

public class BrandRequestVO {

    @JsonProperty(value = "bid")
    private Integer brandId;

    @NotNull(message = "Brand Name Required")
    @JsonProperty(value = "bname")
    private String brandName;

    public BrandRequestVO() {
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
