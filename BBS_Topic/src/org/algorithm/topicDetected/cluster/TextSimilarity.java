package org.algorithm.topicDetected.cluster;

public class TextSimilarity {
	public double sim(double[] D1,double[] D2,int N)
	{
		 int j;
		 double similarity;
		 double sum2=0;
		 double sum=0;
		 double sum1=0;
		 for(j=0;j<N;j++)
		{
		 sum+=D1[j]*D2[j];
		 sum1+=D1[j]*D1[j];
		 sum2+=D2[j]*D2[j];
		}
	if(sum1*sum2==0 && (sum2-sum1)!=0)
		similarity=0;
	else if(sum1*sum2==0 && (sum2-sum1)==0)
		 similarity=1;
	else
		similarity=sum/Math.sqrt(sum1*sum2);
	return similarity;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TextSimilarity t = new TextSimilarity();
//	double[] d1 = new double[]{1,2,3};
//	double[] d2 = new double[]{1,2,4};
//	System.out.println(t.sim(d1, d2, 3));
	}
}
