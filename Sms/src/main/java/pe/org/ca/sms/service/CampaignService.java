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
@Service
public class CampaignService {

    @Autowired
    CampaignMapper campaignMapper;

    public synchronized List<Campaign> findAllCampaigns() {
        return campaignMapper.findAllCampaigns();
    }
}
