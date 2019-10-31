package ocp.assessment;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.jupiter.api.Test;

import ocp.assessment.classes.*;
import ocp.assessment.classes.q3.*;

/**
 * Mind errata: https://www.selikoff.net/java-ocp-8-programmer-ii-study-guide/
 */
class Assessment {

	@Test
	void test01StreamThreadPoolCyclicBarrier() {
		// run class separately
		BabyPandaBathManager runMainMethod;
	}

	@Test
	void test02AbstractFinal() {
		Message.main(new String[] {});
	}
	
	@Test
	void test03WontCompileMultipleReasons() {
		Bird bird;
		Tail tail;
	}
	
	@Test
	void test04ProperUseOfgenerics() {
		Box.main(new String[] {});
	}
	
	@Test
	void test05SynchronizedListsConcurrency() {
		List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer> fish = new CopyOnWriteArrayList<>(source);
		/*CopyOnWriteArrayList: java.util.concurrent
		 */
		List<Integer> mammals = Collections.synchronizedList(source);
		Set<Integer> birds = new ConcurrentSkipListSet<>();
		/* ConcurrentSkipListSet: java.util.concurrent
		 */
		birds.addAll(source);
		
		synchronized(new Integer(10)) {
			for(Integer f: fish) fish.add(4); // c1
			for(Integer m: mammals) mammals.add(4); /* c2
													   Runtime exception: Synchronized lists are not safe
			 										  to be used inside an iterator. 
			 										*/
			for(Integer b: birds) birds.add(5); // c3
			System.out.println(fish.size()+" "+mammals.size()+" "+birds.size());
		}
	}
	
	@Test
	void test06ImmutablePattern() {
		Duck duck;
	}
	
	@Test
	void test07Paths() throws IOException {
		SleepBats.main(new String[] {});
	}

	@Test
	void test08Inheritance() {
		Animal animal;
	}
	
	@Test
	void test09ResultSet() {
		CreateStatementArgs stmt;
	}
	
	@Test
	void test10Autoboxing() {
		AssertDemo asrt;
	}
	
}
