package com.example.demo;

import com.example.demo.domain.MeetingData;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JSONException {
		SpringApplication.run(DemoApplication.class, args);

		ArrayList<MeetingData> array = new ArrayList<MeetingData>();


		System.out.println("Type your event name " );
		Scanner in = new Scanner(System.in);
		String eventName = in.nextLine();
		JSONArray jsonArray = new JSONArray();
		JSONObject obj = new JSONObject();
		JSONObject objItem =  new JSONObject();

		UUID id = UUID.randomUUID();
		objItem.put("id", id);

		System.out.println("Event name " + eventName);

		System.out.println("Type your name " );
		String responsiblePerson = in.nextLine();
		objItem.put("name", responsiblePerson);

		System.out.println("Type your description " );
		String description = in.nextLine();
		objItem.put("description", description);

		System.out.println("Type your category " );
		String category = in.nextLine();
		objItem.put("category", category);

		System.out.println("Type your type " );
		String type = in.nextLine();
		objItem.put("type", type);

		System.out.println("Type your start date " );
		float startDate = Float.parseFloat(in.nextLine());
		objItem.put("startDate", startDate);

		System.out.println("Type your end date " );
		float endDate = Float.parseFloat(in.nextLine());
		objItem.put("endDate", endDate);



		obj.put("eventdata", objItem);
		jsonArray.put(obj);








		try (FileWriter file = new FileWriter("your path")) {
			file.write(jsonArray.toString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + jsonArray);
		} catch(Exception e){
			System.out.println(e);

		}
	}

}
