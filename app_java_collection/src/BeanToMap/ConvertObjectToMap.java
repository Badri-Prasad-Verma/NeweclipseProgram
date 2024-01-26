package BeanToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertObjectToMap {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "Badri"));
		list.add(new Employee(2, "Satish"));
		
		Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Employee::getId,
				Employee::getName));
		
		System.out.println(collect);
	}
}
