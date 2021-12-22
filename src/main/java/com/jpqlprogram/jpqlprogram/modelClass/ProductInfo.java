package com.jpqlprogram.jpqlprogram.modelClass;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="product_info")
@NamedQuery(name="ProductInfo.findByBatchCode",query="select Pr from ProductInfo Pr where Pr.batchCode=?1")
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int qrcode;

    @Column(name="productName")
    private String productName;

    @Column(name="productType")
    private String productType;

    @Column(name="batchCode",unique = true)
    private String batchCode;

    @JsonFormat(pattern="yyyy-mm-dd")
    @Column(name="manufacturingDate")
    private Date manufacturingDate;

    @JsonFormat(pattern="yyyy-mm-dd")
    @Column(name="expireDate")
    private Date expireDate;

    public ProductInfo()
    {

    }



    public ProductInfo(int qrcode, String productName, String productType, String batchCode, Date manufacturingDate, Date expireDate) {
        this.qrcode = qrcode;
        this.productName = productName;
        this.productType = productType;
        this.batchCode = batchCode;
        this.manufacturingDate = manufacturingDate;
        this.expireDate = expireDate;
    }

    public int getQrcode() {
        return qrcode;
    }

    public void setQrcode(int qrcode) {
        this.qrcode = qrcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
