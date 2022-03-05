package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jenny
 * @date 2022. 2. 27. - 오후 2:46:41
 * @subject 프로그래머스 level2 
 * @content 오픈채팅방
 */
public class 오픈채팅방 {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", 
										"Enter uid4567 Prodo",
										"Leave uid1234",
										"Enter uid1234 Prodo",
										"Change uid4567 Ryan"};
		String[] answer = {};

		List<String> answer_list = new ArrayList<String>();
		Map<String, String> id_nickname = new HashMap<String, String>();

		String[] s = null;
		for (int i = 0; i < record.length; i++) {
			s = new String[3];
			s = record[i].split(" ");
			// record중 들어오거나 변경하는게 있으면 id에 있는 닉네임을 변경해줌.
			if( s[0].equals("Enter") || s[0].equals("Change")) { 
				id_nickname.put(s[1], s[2]);
			}
		}
		
		for (int i = 0; i < record.length; i++) {
			s = new String[3];
			s = record[i].split(" ");
			
			if( s[0].equals("Enter") ) { 
				answer_list.add( id_nickname.get(s[1]) + "님이 들어왔습니다.");
			} else if( s[0].equals("Leave") ) { // 나갈때
				answer_list.add( id_nickname.get(s[1]) + "님이 나갔습니다.");
			}
		}
		
		
		answer = answer_list.toArray(new String[0]);
		System.out.println(Arrays.toString(answer));

	}

}


/* 1. 
List<String> answer_list = new ArrayList<String>();
List<String> id_list = new ArrayList<String>();
Map<String, String> id_nickname = new HashMap<String, String>();

String[] s = null;
for (int i = 0; i < record.length; i++) {
	 s = new String[3];
	 s = record[i].split(" ");
	if( s[0].equals("Enter") ) {
		id_nickname.put(s[1], s[2]);
		System.out.println( id_nickname.get(s[1]) + "님이 들어왔습니다.");
		answer_list.add( id_nickname.get(s[1]) + "님이 들어왔습니다.");
		id_list.add(s[1]);
		if( id_list.contains(s[1]) ) {
			answer_list.set( id_list.indexOf(s[1]), "hello" ); 
		}
	}
	else if( s[0].equals("Leave") ) {
		System.out.println( id_nickname.get(s[1]) + "님이 나갔습니다.");
		answer_list.add( id_nickname.get(s[1]) + "님이 나갔습니다.");
		id_list.add(s[1]);
	}
	else if( s[0].equals("Change") ) {

	}
}
System.out.println(id_list);
System.out.println(answer_list);
//System.out.println(id_nickname);
System.out.println(Arrays.toString(answer));
 */

/* 2번 
String[] s = null;
for (int i = 0; i < record.length; i++) {
	 s = new String[3];
	 s = record[i].split(" ");
	if( s[0].equals("Enter") ) { // 들어올때 
		System.out.println( s[2] + "님이 들어왔습니다.");
		answer_list.add( s[2] + "님이 들어왔습니다.");

		// 만약 이전에 들어온 적이 있다면 
		for(int j = 0; j < id_list.size(); j++) {
			if( s[1].equals(id_list.get(j)) ) {
				String str = answer_list.get(j).substring( id_nickname.get(s[1]).length() );
				answer_list.set(j, s[2] + str);
			}
		}

		id_nickname.put(s[1], s[2]);
		id_list.add(s[1]);

	}
	else if( s[0].equals("Leave") ) { // 나갈때
		System.out.println( id_nickname.get(s[1]) + "님이 나갔습니다.");
		answer_list.add( id_nickname.get(s[1]) + "님이 나갔습니다.");
		id_list.add(s[1]);
	}
	else if( s[0].equals("Change") ) { // 닉네임 변경할때
		//System.out.println( s[1] + "님이 " + id_nickname.get(s[1]) + "으로 변경했습니다.");
		for(int j = 0; j < id_list.size(); j++) {
			if( s[1].equals(id_list.get(j)) ) {
				String str = answer_list.get(j).substring( id_nickname.get(s[1]).length() );
				answer_list.set(j, s[2] + str);
			}
		}
	}
}
 */