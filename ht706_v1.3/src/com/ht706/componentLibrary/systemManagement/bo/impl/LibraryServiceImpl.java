package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
import com.ht706.componentLibrary.systemManagement.bo.ILibraryService;
import com.ht706.componentLibrary.systemManagement.dao.ILibraryDAO;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class LibraryServiceImpl implements ILibraryService {
	private ILibraryDAO libraryDAO;
	



	public void setLibraryDAO(ILibraryDAO libraryDAO) {
		this.libraryDAO = libraryDAO;
	}

	public ILibraryDAO getLibraryDAO() {
		return libraryDAO;
	}

	public List<Library> listAll() {
		// TODO Auto-generated method stub
		return libraryDAO.findAll();
	}
	public Library getById(String string) {
		// TODO Auto-generated method stub
		return libraryDAO.findById(string);
	}

	public void modify(final Library library) {
		// TODO Auto-generated method stub
	
							libraryDAO.update(library);
						
	}

}
