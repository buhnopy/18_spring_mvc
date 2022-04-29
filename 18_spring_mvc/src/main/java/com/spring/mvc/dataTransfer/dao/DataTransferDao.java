package com.spring.mvc.dataTransfer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dataTransfer.dto.ProductDto;

@Repository		// 해당 클래스가 dao임을 스프링 빈에 등록한다.
public class DataTransferDao {

	@Autowired
	private SqlSession sqlSession;
	
	/*
	 * 
	 * # Mapper To Dao
	 * 
	 *  - 한개의 데이터를 조회할 경우       .selectOne() 메서드를 사용한다.
	 *  - 한개 이상의 데이터를 조회할 경우  .selectList() 메서드를 사용하며 반환데이터는 List로 처리할 수 있다.
	 *      주의) Mapper 파일에서 반환타입(resultType)이 List가 아니고
	 *            selectList() 메서드로 List를 처리한다.
	 *  
	 *  - insert쿼리를 사용할 경우 .insert() 메서드를 사용한다.
	 *  - update쿼리를 사용할 경우 .update() 메서드를 사용한다.
	 *  - delete쿼리를 사용할 경우 .delete() 메서드를 사용한다.
	 *  
	 * */
	
	public void selectData1() {
		
		System.out.println("\n selectData1 \n");
	
		int result = sqlSession.selectOne("dataTransfer.select1");
		System.out.println("selectData1 : " + result);
		
	}
	
	public void selectData2() {
		
		System.out.println("\n selectData2 \n");
		
		List<ProductDto> productList = sqlSession.selectList("dataTransfer.select2");
		for (ProductDto productDto : productList) {
			System.out.println(productDto);
			System.out.println();
		}
		
	}
	
	public void selectData3() {
		
		System.out.println("\n selectData3 \n");
		
		List<Map<String,Object>> productList = sqlSession.selectList("dataTransfer.select3");
		for (Map<String,Object> productMap : productList) {
			System.out.println(productMap);
			System.out.println();
		}
		
	}
	
	public void selectData4() {
		
		System.out.println("\n selectData4 \n");
		List<ProductDto> productList = sqlSession.selectList("dataTransfer.select4");
		for (ProductDto productDto : productList) {
			System.out.println(productDto);
			System.out.println();
		}
		
	}
	
	public void selectData5() {
		
		System.out.println("\n selectData5 \n");
		
		List<Map<String,Object>> productList = sqlSession.selectList("dataTransfer.select5");
		for (Map<String,Object> productMap : productList) {
			System.out.println(productMap);
			System.out.println();
		}
		
	}
	
	
	
}
