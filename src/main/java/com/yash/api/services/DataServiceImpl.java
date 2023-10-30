package com.yash.api.services;

import com.yash.api.dto.DataResponse;
import com.yash.api.repo.DelPtnrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DelPtnrRepository delPtnrRepository;
    @Override
    public DataResponse getData(String dlptr, String restaurant, String item) {
        DataResponse resp = null;
        List<Object[]> objAr = delPtnrRepository.getData(item, restaurant, dlptr);
        if(objAr != null && !objAr.isEmpty()){
            resp = new DataResponse();
            for (Object[] obj: objAr) {
                resp.setDelPtnr((String) obj[0]);
                resp.setRestaurant((String) obj[4]);
                resp.setItem((String) obj[2]);
                resp.setPrice("Rs. "+String.valueOf((double) obj[3]));
                resp.setImage((String) obj[5]);
            }
        }
        return resp;
    }
}
