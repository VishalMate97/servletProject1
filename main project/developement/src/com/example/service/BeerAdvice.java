package com.example.service;

import java.util.*;


public class BeerAdvice{

public List getBrands(String color){

List<String> data = new ArrayList<String>();

if(color.equals("light")){
data.add("light advice 1");
data.add("light advice 2");
}
else if(color.equals("amber")){
data.add("amber advice 1");
data.add("amber advice 2");
}
else if(color.equals("brown")){
data.add("brown advice 1");
data.add("brown advice 2");
}
else{
data.add("dark advice 1");
data.add("dark advice 2");
}

return data;

}

}



