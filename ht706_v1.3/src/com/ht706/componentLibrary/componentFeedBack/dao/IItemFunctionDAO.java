/**
 * @FileName	IItemFunctionDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao
 * @author ������
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao;

import java.util.List;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;

/**
 * ItemFunction DAO�ӿ�
 * @method 	findAll			�г����������
 * @method 	findById		ͨ��itemFID��ѯ�����
 * @method 	findByFuncName	ͨ��funcName��ѯ�����
 * @method 	save			�������ݿⴴ��һ�������
 * @method 	update			�����ݿ����һ�������
 * @method 	delete			ͨ��itemFIDɾ��һ�������
 */
public interface IItemFunctionDAO {
	public void save(ItemFunction transientInstance);
	public void delete(ItemFunction persistentInstance);
	public ItemFunction findById(java.lang.Integer id);
	public List<ItemFunction> findByFuncName(Object funcName);
	public List<ItemFunction> findAll();
	public void update(ItemFunction itemFunc);
	public List<ItemFunction> findByNumber(int start, int offset);
}
