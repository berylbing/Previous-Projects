package com.ht706.componentLibrary.util.security;

import org.springframework.security.util.AntUrlPathMatcher;

public class MyAntUrlPathMatcher extends AntUrlPathMatcher {
    @Override
	public boolean pathMatchesUrl(Object path, String url) {
    	boolean b=super.pathMatchesUrl(path, url);
    	//if(b) System.out.print("*********************** true");
    	//System.out.println("--------path "+path+"-----url "+url);
    	return b;
    }
}
