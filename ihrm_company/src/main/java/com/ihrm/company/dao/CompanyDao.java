package com.ihrm.company.dao;

import com.ihrm.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: lsm
 * @description:
 * @create: 2019-11-07 22:56
 */
@Repository
public interface CompanyDao extends JpaRepository<Company, String> {
}
