package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Device;
import com.example.repository.DeviceRepository;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	public Device addDevice(Device device)
	{
		return deviceRepository.save(device);
	}
	
	public List<Device> addDevices(List<Device> devices)
	{
		return deviceRepository.saveAll(devices);
	}
	
	public List<Device> getDevices()
	{
		return deviceRepository.findAll();
	}

}
