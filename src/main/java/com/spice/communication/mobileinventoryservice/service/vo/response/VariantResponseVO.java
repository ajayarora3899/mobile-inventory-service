package com.spice.communication.mobileinventoryservice.service.vo.response;

public class VariantResponseVO {

    private Integer variantId;

    private Integer mobileId;

    private Integer ram;

    private Integer storage;

    private Integer totalPiece;

    private Integer availablePiece;

    private Integer price;

    public VariantResponseVO() {
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public Integer getMobileId() {
        return mobileId;
    }

    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getTotalPiece() {
        return totalPiece;
    }

    public void setTotalPiece(Integer totalPiece) {
        this.totalPiece = totalPiece;
    }

    public Integer getAvailablePiece() {
        return availablePiece;
    }

    public void setAvailablePiece(Integer availablePiece) {
        this.availablePiece = availablePiece;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
