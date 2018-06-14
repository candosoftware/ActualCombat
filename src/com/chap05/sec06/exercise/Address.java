package com.chap05.sec06.exercise;
class address1{
	private String country;
    private String provice;
    private String city;
    private String address;
    private String post_code;
    public void setCountry(String country){
   	this.country = country;
   }    
    public String getCountry(){
    	return country;
    }
    public void setProvic(String provice){
    	this.provice = provice;
    }
    public String getProvice(){
    	return this.provice;
    }
    public void setCity(String city){
    	this.city = city;
    }
    public String getCiyt(){
    	return this.city;
    }
    public String setAddress(String address){
    	return this.address;
    }
    public void setPost_code(String post_code){
    	this.post_code = post_code;
    }
    public String getPost_code(){
    	return this.post_code;
    }
  }
public class Address {
    public static void main(String args[]){
    	address1 add = new address1();
    	add.setCity("南岸");
    	add.setCountry("中国");
    	add.setPost_code("410000");
    	add.setProvic("重庆");
    	System.out.println("详细地址是："+add.getCountry()+add.getProvice()+add.getCiyt());
    }
     
}
