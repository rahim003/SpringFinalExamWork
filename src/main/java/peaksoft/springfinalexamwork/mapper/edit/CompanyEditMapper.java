package peaksoft.springfinalexamwork.mapper.edit;

import org.springframework.stereotype.Component;
import peaksoft.springfinalexamwork.dto.request.CompanyRequest;
import peaksoft.springfinalexamwork.entity.Company;
@Component
public class CompanyEditMapper {
    public Company create(CompanyRequest companyRequest){
        if(companyRequest==null){
            return null;
        }
        Company company=new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());
        return company;
    }

    public void Update(Company company,CompanyRequest companyRequest){
        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());

    }
}
