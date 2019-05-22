package com.sdsoon.model;

import java.io.Serializable;

/**
 * Created By Chr on 2019/5/22.
 */
public class City implements Serializable {

    private static final long serialVersionUID = 2941466866198434112L;

    private Integer cityNum;
    private String cityName;
    private String cityGrade;

    public City(Integer cityNum, String cityName, String cityGrade) {
        this.cityNum = cityNum;
        this.cityName = cityName;
        this.cityGrade = cityGrade;
    }

    public Integer getCityNum() {
        return cityNum;
    }

    public void setCityNum(Integer cityNum) {
        this.cityNum = cityNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityGrade() {
        return cityGrade;
    }

    public void setCityGrade(String cityGrade) {
        this.cityGrade = cityGrade;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityNum=" + cityNum +
                ", cityName='" + cityName + '\'' +
                ", cityGrade='" + cityGrade + '\'' +
                '}';
    }
}
