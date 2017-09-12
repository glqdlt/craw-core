package com.glqdlt;

import java.util.List;

import org.junit.Test;

import com.glqdlt.crawling.stack.jsoup.parsers.PpompuParser;
import com.glqdlt.crawling.target.stack.PpompuCoupon;
import com.glqdlt.crawling.target.stack.PpompuTukga;
import com.glqdlt.data.CrawllingObject;

public class FunctionTest {

	@Test
	public void test_ppompu() {

		List<CrawllingObject> l = new PpompuParser().Doc_Parser(PpompuCoupon.target_url);
		List<CrawllingObject> l_2 = new PpompuParser().Doc_Parser(PpompuTukga.target_url);
		l.forEach(x -> System.out.println(x.toString()));
		System.out.println("=======");
		l_2.forEach(x -> System.out.println(x.toString()));

	}

}
