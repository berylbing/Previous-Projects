package com.ht706.componentLibrary.componentSearch.bean;

import java.util.HashSet;
import java.util.Set;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;


public class FacetTreeNode extends DefaultMutableTreeNode implements TreeNode{
	private Facet facet;

	public void setFacet(Facet facet) {
		this.facet = facet;
	}

	public Facet getFacet() {
		return facet;
	}
	public Set getChildTreeSet(){
		HashSet<FacetTreeNode> ar=new HashSet<FacetTreeNode>();
		ar.add(this);
		for(int i=0;i<this.getChildCount();i++){
			FacetTreeNode tmp=(FacetTreeNode)this.getChildAt(i);
			ar.addAll(tmp.getChildTreeSet());
		}
		return ar;
	}
}
