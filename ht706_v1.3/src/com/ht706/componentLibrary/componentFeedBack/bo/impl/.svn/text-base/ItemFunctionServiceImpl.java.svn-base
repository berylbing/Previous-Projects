/**
 * @FileName	ItemFunctionServiceImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo.impl
 * @author 贾乐松
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo.impl;

import java.util.List;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;
import com.ht706.componentLibrary.componentFeedBack.bo.IItemFunctionService;
import com.ht706.componentLibrary.componentFeedBack.dao.IItemFunctionDAO;

/**
 * ItemFunction Service接口的实现类
 * @param	itemFunctionDAO		ItemFunctionDAO对象
 * @method 	listAllItemFunction	列出所有项分类
 * @method 	getItemFunctionById	通过itemFID查询项分类
 * @method 	create				创建一个项分类
 * @method 	modify				修改一个项分类
 * @method 	deleteById			通过itemFID删除一个项分类
 */
public class ItemFunctionServiceImpl implements IItemFunctionService {
	
	private IItemFunctionDAO itemFunctionDAO;
	
	public IItemFunctionDAO getItemFunctionDAO() {
		return itemFunctionDAO;
	}

	public void setItemFunctionDAO(IItemFunctionDAO itemFunctionDAO) {
		this.itemFunctionDAO = itemFunctionDAO;
	}

	public ItemFunction getItemFunctionById(int itemFId) {
		
		return itemFunctionDAO.findById(itemFId);
	}

	public List<ItemFunction> listAll() {

		List<ItemFunction> itemFunctionList = itemFunctionDAO.findAll();
		
		return itemFunctionList;
	}

	public void create(ItemFunction itemFunction) {
			
		itemFunctionDAO.save(itemFunction);
	}

	public void modify(ItemFunction itemFunction) {
		
		itemFunctionDAO.update(itemFunction);
	}

	public void deleteById(int itemFID) {

		ItemFunction itemFunc = itemFunctionDAO.findById(itemFID);
		itemFunctionDAO.delete(itemFunc);					
	
	}

	public List<ItemFunction> findByNumber(int start, int offset) {

		return itemFunctionDAO.findByNumber(start, offset);
	}

}
