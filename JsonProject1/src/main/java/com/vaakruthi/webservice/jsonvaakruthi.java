package com.vaakruthi.webservice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonvaakruthi {
	
	public static void main(String[]args)
	{
		/*
		 * {"customers":[{"name":"vaakruthi","accountnumber":12334556,"mobile"="9326374627","addres":"hyd"},
		 * {"name":"vaakruthi2","accountnumber":129887779,"mobile"="9365674566","addres":"us"}]}
		 * 
		 */
		
		JSONObject customer=new JSONObject();
		JSONArray arrayvalues=new JSONArray();
		JSONObject customervalues1=new JSONObject();
		JSONObject customervalues2=new JSONObject();
		 
		customervalues1.put("name", "vaakruthi");
		customervalues1.put("accountnumber", "12334556");
		customervalues1.put("mobile","9326374627");
		customervalues1.put("addres","hyd");
		
		customervalues2.put("name", "vaakruthi2");
		customervalues2.put("accountnumber", "129887779");
		customervalues2.put("mobile","9365674566");
		customervalues2.put("addres","us");
		 
		
		arrayvalues.add(customervalues1);
		arrayvalues.add(customervalues2);
		customer.put("customer",arrayvalues);
		System.out.println("Json Values:"+customer.toJSONString());
		System.out.println("hii sir");
}
}