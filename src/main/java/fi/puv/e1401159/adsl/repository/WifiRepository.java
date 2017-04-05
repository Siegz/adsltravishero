package fi.puv.e1401159.adsl.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import fi.puv.e1401159.adsl.model.Wifi;

public interface WifiRepository extends CrudRepository<Wifi, Integer>{
	List<Wifi> findById(int id);
}
