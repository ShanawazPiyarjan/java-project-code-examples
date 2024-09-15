package com.test.project.test4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapCollections {
	public static void main(String[] args) {
		Map<Integer, Patient> map = new HashMap<>();
		
		map.put(1,  new Patient(1, "Shanawaz", "A+"));
		map.put(2,  new Patient(2, "Rahul", "B+"));
		map.put(3,  new Patient(3, "Kamal", "AB+"));
		map.put(4,  new Patient(4, "Rajni", "B-"));
		
		List<String> list = map.entrySet().stream().filter(e -> e.getValue().getBloodGroup().equals("A+"))
				.map(m -> m.getValue().getId() + " " + m.getValue().getName() +" "+ m.getValue().getBloodGroup()).collect(Collectors.toList());
		
		System.out.println(list);
		
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
	}

}

class Patient {
	private long id;
	private String name;
	private String bloodGroup;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Patient(long id, String name, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + "]";
	}
	
	
}
