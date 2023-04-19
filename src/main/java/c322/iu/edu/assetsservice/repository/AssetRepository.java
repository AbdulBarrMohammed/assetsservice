package c322.iu.edu.assetsservice.repository;


import c322.iu.edu.assetsservice.model.Assets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Assets, Integer> {

}
