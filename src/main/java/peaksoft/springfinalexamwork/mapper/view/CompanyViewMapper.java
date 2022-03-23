package peaksoft.springfinalexamwork.mapper.view;

import org.springframework.stereotype.Component;
import peaksoft.springfinalexamwork.dto.response.CompanyRespons;
import peaksoft.springfinalexamwork.entity.Company;

import java.util.ArrayList;
import java.util.List;
@Component
public class CompanyViewMapper {
    public CompanyRespons viewCompany(Company company){
        if(company==null){
            return null;
        }
        CompanyRespons companyResponse=new CompanyRespons();
        if(companyResponse!=null){
            companyResponse.setId(String.valueOf(company.getId()));
        }
        companyResponse.setCompanyName(company.getCompanyName());
        companyResponse.setLocatedCountry(company.getLocatedCountry());
        return companyResponse;

    }

    public List<CompanyRespons> viewCompanies(List<Company> companies){
        List<CompanyRespons>companyResponses=new ArrayList<>();
        for (Company c:companies
        ) {
            companyResponses.add(viewCompany(c));
        }
        return companyResponses;
    }
}
