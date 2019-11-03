package com.essa.EssaApp.Controller;


import com.essa.EssaApp.DTO.CustomerViewDTO;
import com.essa.EssaApp.Model.CustomerView;
import com.essa.EssaApp.Service.CustomerViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerViewController {

    @Autowired
    CustomerViewService customerViewService;

    @RequestMapping(value = "customers", method = RequestMethod.GET)
    //Get Customers from Database View
    public List<CustomerView> getCustomerView(){
        return customerViewService.getCustomerView();
    }
    @RequestMapping(value = "customers/date", method = RequestMethod.POST)
    public List<CustomerView> getCustomerViewByDate(@RequestBody CustomerViewDTO customerViewDTO){
        return customerViewService.getCustomerViewByDate(customerViewDTO.getDateFrom(), customerViewDTO.getDateTill());
    }
}
