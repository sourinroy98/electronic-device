package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer>{

}
