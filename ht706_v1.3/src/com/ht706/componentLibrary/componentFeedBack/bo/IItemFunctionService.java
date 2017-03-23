/**
 * @FileName	IItemFunctionService.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo
 * @author 贾乐松
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo;

import java.util.List;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;

/**
 * ItemFunction Service接口
 * @method 	listAllItemFunction	列出所有项分类
 * @method 	getItemFunctionById	通过itemFID查询项分类
 * @method 	create				创建一个项分类
 * @method 	modify				修改一个项分类
 * @method 	deleteById			通过itemFID删除一个项分类
 */
public interface IItemFunctionService {
	public List<ItemFunction> listAll();
	public ItemFunction getItemFunctionById(int itemFId);
	public void create(ItemFunction itemFunction);
	public void modify(ItemFunction itemFunction);
	public void deleteById(int itemFID);
	public List<ItemFunction> findByNumber(int start, int offset);

}
