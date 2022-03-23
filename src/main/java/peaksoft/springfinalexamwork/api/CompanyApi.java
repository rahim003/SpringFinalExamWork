package peaksoft.springfinalexamwork.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import peaksoft.springfinalexamwork.dto.request.CompanyRequest;
import peaksoft.springfinalexamwork.dto.response.CompanyRespons;
import peaksoft.springfinalexamwork.entity.Company;
import peaksoft.springfinalexamwork.service.CompanyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CompanyApi {
    private final CompanyService companyService;

    @Autowired
    public CompanyApi(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/users")
    public List<Company> findAllCompany() {
        return companyService.findAllCompany();
    }

    @PostMapping("/save/company")
    public CompanyRespons saveCompany(@RequestBody CompanyRequest companyRequest) {
        return companyService.saveCompany(companyRequest);
    }

    @DeleteMapping("/{id}")
    public Company deleteByIdCompany(@PathVariable("id") Long id) {
        return companyService.deleteByIdCompany(id);
    }

    @GetMapping("/{id}")
    public Optional<Company> findById(@PathVariable("id") Long id) {
        return companyService.findByCompanyId(id);
    }

    @PatchMapping("/update/{id}")
    public CompanyRespons companyRespons(@PathVariable("id") Long id, @RequestBody CompanyRequest companyRequest) {
        return companyService.updateCompany(id, companyRequest);
    }

}
