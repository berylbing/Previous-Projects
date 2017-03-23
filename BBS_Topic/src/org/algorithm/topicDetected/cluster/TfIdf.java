package org.algorithm.topicDetected.cluster;

public class TfIdf {
public double tfidf(double TFj,double TFm,char position,int flag,double n,double DFt){
	double TWm=0.55;
	double TWj=0;
	double TEj=0;
	double tf=0.5*TFj/TFm+0.4*TWj/TWm+0.4*TEj;
	double idf=Math.log10(n/DFt+0.1);
	if(position=='t')
		TWj=1;
	else if(position=='c')
		TWj=0;
	if(flag==1)
		TEj=0.25;
	else if(flag==0)
		TEj=0;
	return tf*idf;
		
}
//public static void main(String[] args) {
//	Jni_Test Test=new Jni_Test();
//	double z=Test.tfidf(2,45,'c',1,4040,234);
//	System.out.println(z);
//}
}

