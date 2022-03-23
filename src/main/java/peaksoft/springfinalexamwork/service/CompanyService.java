package peaksoft.springfinalexamwork.service;

import org.springframework.stereotype.Service;
import peaksoft.springfinalexamwork.dto.request.CompanyRequest;
import peaksoft.springfinalexamwork.dto.response.CompanyRespons;
import peaksoft.springfinalexamwork.entity.Company;

import java.util.List;
import java.util.Optional;

@Service
public interface CompanyService {
    CompanyRespons saveCompany(CompanyRequest companyRequest);
    List<Company>findAllCompany();
    Optional<Company> findByCompanyId(Long id);
    Company getById(Long id);
    Company deleteByIdCompany(Long id);
    CompanyRespons updateCompany(Long id,CompanyRequest companyRequest);
    //void updateCompany(Company company);
}
