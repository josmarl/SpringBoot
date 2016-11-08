/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.ca.sms.domain.Campaign;
import pe.org.ca.sms.mapper.CampaignMapper;

/**
 *
 * @author itecs
 */
@Service("campaignService")
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    private CampaignMapper campaignMapper;

    @Override
    public List<Campaign> findCampaigns() {
        return campaignMapper.findCampaigns();
    }
}
