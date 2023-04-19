package c322.iu.edu.assetsservice.controller;

import c322.iu.edu.assetsservice.model.Assets;
import c322.iu.edu.assetsservice.repository.AssetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assets")
public class AssetController {
    private AssetRepository repository;



    public AssetController(AssetRepository repository) {
        this.repository = repository;

    }

    @GetMapping
    public List<Assets> getAssets(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Assets> getAsset(@PathVariable int id) {

        return repository.findById(id);
    }



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public int create(@RequestBody Assets assets){
        Assets addedLicense = repository.save(assets);
        return addedLicense.getId();
    }

}