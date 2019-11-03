package com.essa.EssaApp.Service;

import com.essa.EssaApp.Model.CustomerView;
import com.essa.EssaApp.Repository.CustomerViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerViewService {

    @Autowired
    CustomerViewRepository customerViewRepository;

    public List<CustomerView> getCustomerView(){
        return customerViewRepository.findAll();

    }

    public List<CustomerView> getCustomerViewByDate(String dateFrom,String dateTill){
       return  customerViewRepository.findByDate(dateFrom,dateTill);
    }
}
