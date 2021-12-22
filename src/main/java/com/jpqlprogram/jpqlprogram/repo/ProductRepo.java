package com.jpqlprogram.jpqlprogram.repo;

import com.jpqlprogram.jpqlprogram.modelClass.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<ProductInfo,Integer> {
    public ProductInfo findByBatchCode(String batchCode);


    @Query(value="select Pr from ProductInfo Pr where Pr.qrcode=:id")
    public List<ProductInfo> findByQrCode(int id);

    @Query(value="select Pr from ProductInfo Pr where Pr.productType=?1")
    public List<ProductInfo> findByProductType(String type);

    @Query(value="select Pr from ProductInfo Pr where Pr.qrcode=:u and Pr.batchCode=:c ")
    public List<ProductInfo> findByQrCodeAndBatchCode(@Param("u") int qrcode, @Param("c") String bc);

    @Query(value="select Pr from ProductInfo Pr where Pr.productType=?1 and Pr.batchCode=?2")
    public List<ProductInfo> findByProductTypeAndBatchCode(String type,String bc);

    @Query(value="select Pr from ProductInfo Pr where Pr.productName like %:n%")
    public List<ProductInfo> findByName(@Param("n") String name);

    @Query(value="select * from product_info where product_type =?1",nativeQuery = true)
    public List<ProductInfo> findByProductTypeNative(String type);

}
