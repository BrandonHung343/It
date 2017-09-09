package com.example.wurf;

import android.graphics.Bitmap;

/**
 * Created by joshDurham on 9/8/17.
 */

public class Product {

    String productName;
    int productId;
    String producer;
    int producerId;
    String market;
    int marketId;
    String submarket;
    int submarketId;
    double price;
    int elo;
    String description;
    Bitmap image;
    
    public Product(String productName, int productId, String producer, int producerId, String market, int marketId, String submarket, int submarketId, double price, int elo, String description, Bitmap image){
        productName = this.productName;
        productId = this.productId;
        producer = this.producer;
        producerId = this.producerId;
        market = this.market;
        marketId = this.marketId;
        submarket = this.submarket;
        submarketId = this.submarketId;
        price = this.price;
        elo = this.elo;
        description = this.description;
        image = this.image;
    }

    public String getProductName(){
        return productName;
    }

    public int getProductId(){
        return productId;
    }

    public String getProducer(){
        return producer;
    }

    public int getProducerId(){
        return producerId;
    }

    public


}
