package com.shankar.stockdto;

import java.util.ArrayList;
import java.util.Arrays;

import com.shankar.stockdaoimpl.Floor;
import com.shankar.stockdaoimpl.FloorAPI;

public class FloorDto {
	
	
	public static ArrayList<FloorAPI> getdata(){
		Floor floor=new Floor();
		floor.fetch("https://nepse-data-api.herokuapp.com/data/floorsheet");
		FloorAPI[] floordata=floor.getFloordata();
				
		ArrayList<FloorAPI> al= new ArrayList<>(Arrays.asList(floordata));
		return al;
	}
	
	
}
