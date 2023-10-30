package com.yash.api.repo;

import com.yash.api.entities.DelPtnr;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DelPtnrRepository extends CrudRepository<DelPtnr, Integer> {

    @Query(value = "SELECT d.name, r.code, i.name, ip.price, r.name, i.image FROM del_ptnr d, restaurant r, restaurant_del_ptnr_comb rd, item i, item_price ip WHERE d.code = ?3 and i.code = ?1 and r.code = ?2 and ip.item_id = i.id and rd.id = ip.restaurant_del_ptnr_comb_id and r.id = rd.restaurant_id and d.id = rd.del_ptnr_id", nativeQuery = true)
    List<Object[]> getData(String first, String second, String third);
}
