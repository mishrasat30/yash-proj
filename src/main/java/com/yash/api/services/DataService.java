package com.yash.api.services;

import com.yash.api.dto.DataResponse;

public interface DataService {
    DataResponse getData(String zmto, String restaurant, String item);
}
