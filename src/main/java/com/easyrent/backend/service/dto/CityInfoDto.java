package com.easyrent.backend.service.dto;

import lombok.Data;

@Data
public class CityInfoDto
{
    private Integer id;
    private AdministrativeRegionInfoDto region;
    private String name;
}