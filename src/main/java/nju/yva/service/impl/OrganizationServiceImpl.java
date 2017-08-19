package nju.yva.service.impl;

import nju.yva.dao.OrganizationDao;
import nju.yva.model.OrganizationData;
import nju.yva.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
public class OrganizationServiceImpl implements OrganizationService{

    private OrganizationDao organizationDao;

    @Autowired
    public OrganizationServiceImpl(OrganizationDao dao) {
        this.organizationDao = dao;
    }
    @Override
    public boolean addOrganization(OrganizationData organization) {
        return organizationDao.save(organization) != null;
    }

    @Override
    public OrganizationData getOrganization(long organizationId) {
        OrganizationData data = null;
        try {
            data = organizationDao.findOneById(organizationId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public List<OrganizationData> getAllOrganizations() {
        List<OrganizationData> all = null;
        try {
            all = organizationDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    @Override
    public boolean modifyOrganization(OrganizationData modifiedOrganization) {
        if(organizationDao.findOneById(modifiedOrganization.getId()) == null) {
            return false;
        }
        return organizationDao.save(modifiedOrganization) != null;
    }

    @Override
    public boolean deleteOrganization(long id) {
        organizationDao.delete(id);
        return true;
    }
}
