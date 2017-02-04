package main.com.service;

import main.com.dao.CarDAO;
import main.com.entity.IVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<IVehicle> getCars() {
        return carDAO.getCars();
    }
}
