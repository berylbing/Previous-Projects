/**
 * @FileName	IItemFunctionDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao
 * @author 贾乐松
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao;

import java.util.List;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;

/**
 * ItemFunction DAO接口
 * @method 	findAll			列出所有项分类
 * @method 	findById		通过itemFID查询项分类
 * @method 	findByFuncName	通过funcName查询项分类
 * @method 	save			在在数据库创建一个项分类
 * @method 	update			在数据库更新一个项分类
 * @method 	delete			通过itemFID删除一个项分类
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
