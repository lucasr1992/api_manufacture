package com.azuremyst.manutencao.services;

import com.azuremyst.manutencao.domain.Area;
import com.azuremyst.manutencao.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    public List<Area> listar(){
        return areaRepository.findAll();
    }

    public Area buscarArea(String area){
        return areaRepository.findByArea(area)
                .orElseThrow(() -> new RuntimeException());
    }

    public Area buscaId(Long id){
        return areaRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Area adicionar(Area area){
        return areaRepository.save(area);
    }

    public Area atualizar(Area area){
        return areaRepository.save(area);
    }

    public Area desativar(Area area){
        area.setStatus("DESATIVADO");
        this.adicionar(area);
        return area;
    }

}
