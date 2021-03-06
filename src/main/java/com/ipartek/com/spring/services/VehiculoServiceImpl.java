package com.ipartek.com.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.com.spring.domain.Vehiculo;
import com.ipartek.com.spring.repository.VehiculoDAO;

@Service("vehiculoService")
public class VehiculoServiceImpl implements VehiculoService {

	private static final long serialVersionUID = 1L;

	@Autowired
	private VehiculoDAO vehiculoDAO;

	@Override
	public List<Vehiculo> getAll() {
		ArrayList<Vehiculo> list = (ArrayList<Vehiculo>) vehiculoDAO.getAll();
		return list;
	}

}
