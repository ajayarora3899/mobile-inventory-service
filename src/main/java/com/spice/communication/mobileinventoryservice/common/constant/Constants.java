package com.spice.communication.mobileinventoryservice.common.constant;

public class Constants {

    public enum RAM {
        TWO(1,"2GB"),
        FOUR(2,"4GB"),
        SIX(3,"6GB");

        private Integer code;
        private String desc;

        RAM(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    public enum STORAGE{
        SIXTYFOUR(1,"64GB"),
        ONETWENTYEIGHT(2,"128GB"),
        TWOFIFTYSIX(3,"256GB");

        private Integer code;
        private String desc;


        STORAGE(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}

