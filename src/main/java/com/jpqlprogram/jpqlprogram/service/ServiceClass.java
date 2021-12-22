package com.jpqlprogram.jpqlprogram.service;

import com.jpqlprogram.jpqlprogram.modelClass.ProductInfo;
import com.jpqlprogram.jpqlprogram.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {

    @Autowired
    ProductRepo productRepo;

    public ProductInfo findByBatchCode(String batchCode)
    {
        return productRepo.findByBatchCode(batchCode);
    }

    public List<ProductInfo> save(List<ProductInfo> productInfo) {
       return productRepo.saveAll(productInfo);
    }

    public List<ProductInfo> findByQrCode(int id)
    {
        return this.productRepo.findByQrCode(id);
    }

    public List<ProductInfo> findByProductType(String name)
    {
        return this.productRepo.findByProductType(name);
    }
    public List<ProductInfo> findByQrCodeAndBatchCode(int qrcode,String batchCode)
    {
        return this.productRepo.findByQrCodeAndBatchCode(qrcode,batchCode);
    }
    public List<ProductInfo> findByProductTypeAndBatchCode(String productType,String batchCode)
    {
        return this.productRepo.findByProductTypeAndBatchCode(productType,batchCode);
    }
    public List<ProductInfo> findByName(String name)
    {
        return this.productRepo.findByName(name);
    }

    public List<ProductInfo> findByProductTypeNative(String type)
    {
        return this.productRepo.findByProductTypeNative(type);
    }





}
