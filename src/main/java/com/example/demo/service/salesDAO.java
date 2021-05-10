package com.example.demo.service;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public class salesDAO{
	private JdbcTemplate jdbcobj;
	
	public salesDAO(JdbcTemplate jdbcobj) {
		super();
		this.jdbcobj = jdbcobj;
	}
	
	public List<Product> list(){
		String sql = "SELECT * FROM SALES";
		return jdbcobj.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}
	
	public void save(Product product) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcobj);
	    insertActor.withTableName("sales").usingColumns("item", "quantity", "amount");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(product);
	     
	    insertActor.execute(param);
	}
	
	public Product getproduct(int id)
	{
		String sql = "SELECT * FROM SALES WHERE id=?";
		return jdbcobj.queryForObject(sql, BeanPropertyRowMapper.newInstance(Product.class), id);
	}
	
	public void edit(Product product)
	{
		String sql = "UPDATE SALES SET item=:item, quantity:=quantity, amount=:amount WHERE id=:id";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(product);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcobj);
		template.update(sql, param);
	}
}
