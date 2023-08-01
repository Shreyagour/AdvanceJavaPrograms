package com.in28minutes.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.in28minutes.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
	private static Logger logger=Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil ms=new MySortingUtil();
        List<String> sorted = ms.sort(List.of("Shreya","Adya","Jaya","Shreshtha"));
        logger.info(sorted.toString());

	}

}
