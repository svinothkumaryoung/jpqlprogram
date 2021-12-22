package com.jpqlprogram.jpqlprogram.controller;

import com.jpqlprogram.jpqlprogram.modelClass.ProductInfo;
import com.jpqlprogram.jpqlprogram.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ControllerClass {

    @Autowired
    ServiceClass serviceClass;

    @PostMapping("/saveData")
    public List<ProductInfo> saveData(@RequestBody List<ProductInfo> productInfo)
    {
       return  serviceClass.save(productInfo);
    }



    @GetMapping("/findbatchCode/{batchCode}")
    public ProductInfo findByBatchCode(@PathVariable ("batchCode") String batchCode)
    {
        return serviceClass.findByBatchCode(batchCode);
    }

    @GetMapping("/findByQrCode/{id}")
    public List<ProductInfo> findByBatchCode(@PathVariable ("id") int id)
    {
        return serviceClass.findByQrCode(id);
    }

    @GetMapping("/findByProductType/{type}")
    public List<ProductInfo> findByProductType(@PathVariable ("type") String type)
    {
        return serviceClass.findByProductType(type);
    }

    @GetMapping("/findByQrCodeBatchCode/{code}/{batchCode}")
    public List<ProductInfo> findByQrCodeAndBatchCode(@PathVariable ("code") int code,
                                                      @PathVariable ("batchCode") String bc)
    {
        return serviceClass.findByQrCodeAndBatchCode(code,bc);
    }

    @GetMapping("/findByProductTypeBatchCode/{type}/{batchCode}")
    public List<ProductInfo> findByProductTypeAndBatchCode(@PathVariable ("type") String type,
                                                      @PathVariable ("batchCode") String bc)
    {
        return serviceClass.findByProductTypeAndBatchCode(type,bc);
    }

    @GetMapping("/findByNameLike/{name}")
    public List<ProductInfo> findByName(@PathVariable ("name") String name)
    {
        return serviceClass.findByName(name);
    }
    @GetMapping("/findByProductTypeNative/{type}")
    public List<ProductInfo> findByProductTypeNative(@PathVariable ("type") String type)
    {
        return serviceClass.findByProductTypeNative(type);
    }


}
