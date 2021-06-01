package edu.lee;

import com.alibaba.excel.annotation.ExcelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ExcelData {
    @ExcelProperty("id")
    private String userId;

    @ExcelProperty("name")
    private String name;

    @ExcelProperty("company")
    private String company;

    public String toString(){
        return new ReflectionToStringBuilder(this).build();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
