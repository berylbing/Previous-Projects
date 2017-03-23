/**
 * @FileName	ItemFunctionForm.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.actionForm
 * @author 贾乐松
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.actionForm;

import org.apache.struts.action.ActionForm;

/**
 * ItemFunction 处理页面传参的Form类
 * @param	funcName		项分类名称
 * @param	description		项分类描述
 */
public class ItemFunctionForm extends ActionForm {

	private String funcName;
	private String description;
		
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFuncName() {
		return funcName;
	}
	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
	
}
