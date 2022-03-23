package peaksoft.springfinalexamwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.springfinalexamwork.dto.request.CompanyRequest;
import peaksoft.springfinalexamwork.dto.response.CompanyRespons;
import peaksoft.springfinalexamwork.entity.Company;
import peaksoft.springfinalexamwork.mapper.edit.CompanyEditMapper;
import peaksoft.springfinalexamwork.mapper.view.CompanyViewMapper;
import peaksoft.springfinalexamwork.repository.CompanyRepository;
import peaksoft.springfinalexamwork.service.CompanyService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyViewMapper companyViewMapper;
    private final CompanyEditMapper companyEditMapper;
    @Override
    public CompanyRespons saveCompany(CompanyRequest companyRequest) {
        return companyViewMapper.viewCompany(companyRepository.save(companyEditMapper.create(companyRequest)));
    }

    @Override
    public List<Company> findAllCompany() {
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> findByCompanyId(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company getById(Long id) {
        return companyRepository.getById(id);
    }

    @Override
    public Company deleteByIdCompany(Long id) {
        companyRepository.deleteById(id);
        return null;
    }
    @Override
    public CompanyRespons updateCompany(Long id, CompanyRequest companyRequest) {
        Company company=companyRepository.findById(id).get();
        companyEditMapper.Update(company,companyRequest);
        return companyViewMapper.viewCompany(companyRepository.save(company));
    }
}
