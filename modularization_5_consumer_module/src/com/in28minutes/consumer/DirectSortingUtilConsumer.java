package com.in28minutes.consumer;
import java.util.List;
import java.util.logging.Logger;

import com.in28minutes.sorting.algorithm.BubbleSort;
import com.in28minutes.sorting.util.MySortingUtil;

public class DirectSortingUtilConsumer {
	private static Logger logger=Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		BubbleSort ms=new BubbleSort();
        List<String> sorted = ms.sort(List.of("Shreya","Adya","Jaya","Shreshtha"));
        logger.info(sorted.toString());
        //someone can directly access bubblesort
        //however you wanted flow as consumer->mysortingutil->bubblesort
        //You can see that even if we create separate Java projects 
        //and use class path, there is no way I can
        //prevent the consumer from not using the algorithms directly.
        

	}

}
