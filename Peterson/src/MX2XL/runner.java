package MX2XL;

import java.util.ArrayList;

public class runner {

	public static void main(String[] args) throws InterruptedException {
		sbNet firstTarget = new sbNet();
		firstTarget.firstUrl();
//		ArrayList<String> chapters = firstTarget.firstUrl(); 

//		System.out.println("------------------------------SB net chapters-----------------------------");
//		for (int i = 0; i < chapters.size(); i++) {
//			System.out.println(chapters.get(i));
//		} 
  
//		HMHNet secondTarget = new HMHNet();
//		ArrayList<String> items = secondTarget.secondUrl();
//		System.out.println("--------------------------------HMHNet chapters-------------------------------");
//		for (int i = 0; i < items.size(); i++) {
//			System.out.println(items.get(i));
//		}

//		System.out.println("---------------------------- matching the titles ----------------------------");
//		for (int i = 0; i < chapters.size(); i++) {
//			String name_in_siteBuilder = chapters.get(i);
//			String name_in_MyLab = items.get(i);
//			if (name_in_siteBuilder.contains(name_in_MyLab)) {
//				System.out.println(name_in_MyLab + " is matched");
//			} else {
//				System.err.println(name_in_MyLab + " is not matched");
//			}
//		}
		

	}

}
