package com.example.restapi.api.v1.mapper;

import com.example.restapi.api.v1.model.VendorDTO;
import com.example.restapi.domain.Vendor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VendorMapperTest {

    public static final String NAME = "someName";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() {
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    public void vendorDTOToVendor() {
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        Vendor vendor = vendorMapper.vendorDTOToVendor(vendorDTO);

        assertEquals(vendorDTO.getName(), vendor.getName());
    }
}