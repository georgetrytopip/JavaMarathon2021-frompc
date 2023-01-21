package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
        public class Task1 {
            public static void main(String[] args) throws FileNotFoundException {
                File text = new File ("C:\\Users\\Админ\\Downloads\\JavaMarathon2021-frompc\\src\\main\\resources\\dushi.txt");
                Scanner scan = new Scanner(text);
                scan.useDelimiter("[.,:;()?!\"\\s–]+");

                Map<Integer, String> map = new HashMap<>();
                int i = 1;

                while(scan.hasNext()){
                    map.put(i-1, scan.next());
                    i++;
                }

                Map<String, Integer> result = new HashMap<String, Integer>();
                for (Map.Entry<Integer,String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    Integer count = result.get(value);
                    if (count == null)
                        result.put(value, (1));
                    else
                        result.put(value, (count+1));
                }


                result = result.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        ));

                System.out.println("Sorted map by values: " + result);

                }
            }

