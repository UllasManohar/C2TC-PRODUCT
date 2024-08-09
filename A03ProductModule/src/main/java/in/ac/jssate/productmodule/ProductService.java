package in.ac.jssate.productmodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
}
	//retreive by id
	public Product get(Integer id) {
		return repo.findById(id).get();
		
	}
	//create
	public void save(Product product) {
		repo.save(product);
	}
	//delete by id
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
