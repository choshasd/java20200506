package com.encap.org;

class TakeDrug{
//	public void Atake(ADrug ad)를 넣어줌
	private void Atake(ADrug ad) {
//		ADrug ad = new ADrug();
		ad.take();
	}
	private void Btake(BDrug bd) {
//		BDrug bd = new BDrug();
		bd.take();
	}
	private void Ctake(CDrug cd) {
//		CDrug cd = new CDrug();
		cd.take();
	}
	// 한번에 하기
	public void ABCTake(ADrug ad, BDrug bd, CDrug cd) {
		//ad.take();
		//bd.take();
		//cd.take();
		Atake(ad);
		Btake(bd);
		Ctake(cd);
	}
}
public class MainDrug {
	public static void main(String[] args) {
		TakeDrug td = new TakeDrug();
		ADrug ad = new ADrug();
		BDrug bd = new BDrug();
		CDrug cd = new CDrug();
		
		td.ABCTake(ad, bd, cd);
		//td.Atake(ad);
		//td.Btake(bd);
		//td.Ctake(cd);
	}
}
