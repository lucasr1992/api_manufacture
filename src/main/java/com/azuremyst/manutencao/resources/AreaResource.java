package com.azuremyst.manutencao.resources;


import com.azuremyst.manutencao.domain.Area;
import com.azuremyst.manutencao.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areas")
public class AreaResource {
    @Autowired
    private AreaService areaService;

    @GetMapping
    public List<Area> listarArea(){
        return areaService.listar();
    }

    @GetMapping("/{nomeArea}")
    public Area buscarArea(@PathVariable String nomeArea){
        return areaService.buscarArea(nomeArea);
    }

    @PostMapping
    public Area adicionar(@RequestBody Area area){
        return areaService.adicionar(area);
    }

    @GetMapping("/id/{id}")
    public Area buscaId(@PathVariable Long id){
        return areaService.buscaId(id);
    }

//    eaService.atualizar(areaSlvar);
//        //return@PutMapping("/{nomeArea}")
////    public Area editar(@PathVariable String nomeArea, Area area, @RequestBody Area areaAtt){
////        area.setArea(nomeArea);
////        Area areaSlvar = areaService.buscarArea(area);
////        BeanUtils.copyProperties(areaAtt, areaSlvar, "id", "area");
////        return ar null;
//    }
}
