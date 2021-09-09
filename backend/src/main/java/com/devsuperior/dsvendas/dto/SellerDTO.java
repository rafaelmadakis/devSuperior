package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;
import java.util.Objects;

public class SellerDTO implements Serializable {


    private Long id;
    private String name;

    public SellerDTO(){

    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Copiar dados de um entidade para um DTO
     * @param entity
     */
    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerDTO sellerDTO = (SellerDTO) o;
        return Objects.equals(id, sellerDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
