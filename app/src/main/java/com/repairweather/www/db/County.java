package com.repairweather.www.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Java on 2017/4/16.
 */

public class County extends DataSupport {

    private String countyName;

    private String weatherId;

    private int cityId;

    private int id;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
