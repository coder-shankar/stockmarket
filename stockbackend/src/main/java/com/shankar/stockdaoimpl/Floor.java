package com.shankar.stockdaoimpl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.shankar.stockdao.ConnectAPI;

public class Floor implements ConnectAPI {
	
	
	private FloorAPI [] floordata ;

	public FloorAPI[] getFloordata() {
		return floordata;
	}
	

	@Override
	public void fetch(String url1) {
		
        URL url=null;
        InputStreamReader reader=null;
		try {
			url = new URL(url1);
			reader = new InputStreamReader(url.openStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
         floordata= new Gson().fromJson(reader, FloorAPI[].class);
		
	}

}
