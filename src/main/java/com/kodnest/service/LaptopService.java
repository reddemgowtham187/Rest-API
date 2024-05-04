package com.kodnest.service;

import java.util.List;


import com.kodnest.entity.Laptop;

public interface LaptopService {

	List<Laptop>getLaptop();

	Laptop getLaptop(int id);

	void postLaptop(Laptop laptop);

	void deleteLaptop(int lid);

	void updateLaptop(int lid, Laptop laptop);
}
