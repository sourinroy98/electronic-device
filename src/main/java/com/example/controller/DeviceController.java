package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Device;
import com.example.service.DeviceService;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@PostMapping("/addDevice")
	public Device addDevice(@RequestBody Device device)
	{
		return deviceService.addDevice(device);
	}
	
	@PostMapping("/addDevices")
	public List<Device> addDevices(@RequestBody List<Device> devices)
	{
		return deviceService.addDevices(devices);
	}
	
	@GetMapping("/getDevices")
	public List<Device> getDevices()
	{
		return deviceService.getDevices();
	}

}
