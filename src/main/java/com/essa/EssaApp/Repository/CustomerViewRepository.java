package com.essa.EssaApp.Repository;

import com.essa.EssaApp.Model.CustomerView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerViewRepository extends JpaRepository<CustomerView, Long> {
    @Query(value = "select * from CUSTOMER_VIEW where CREATED_DATE BETWEEN :dateFrom and :dateTill",
            nativeQuery = true)
    public List<CustomerView> findByDate(@Param("dateFrom") String dateFrom, @Param("dateTill") String dateTill);

}
