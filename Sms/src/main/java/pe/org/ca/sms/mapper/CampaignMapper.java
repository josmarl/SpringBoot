package pe.org.ca.sms.mapper;


import pe.org.ca.sms.domain.Campaign;
import java.util.List;
import org.apache.ibatis.annotations.Select;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author itecs
 */
public interface CampaignMapper {

    @Select("SELECT * FROM Campaign")
    List<Campaign> findAllCampaigns();
}
