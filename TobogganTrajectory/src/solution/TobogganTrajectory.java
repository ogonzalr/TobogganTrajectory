/**
 * 
 */
package solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Omega_skull
 *
 */
public class TobogganTrajectory {

	/**
	 * 
	 */
	public TobogganTrajectory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/Users/Omega_skull/Desktop/TestProjects/map_forest.txt";
		List<String> list = new ArrayList<>();
		
		try(Stream <String> stream =  Files.lines(Paths.get(path))){
			 
			 list = stream.collect(Collectors.toList());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		int trees = 0;
        int x = 0;
        for(int y = 0; y < list.size(); y++) {
            if(list.get(y).charAt(x%list.get(y).length()) == '#')  	
                trees++;
            x += 3;
        }
        
		System.out.println(trees);      
			
	}
}
