import java.util.HashMap;
import java.util.Iterator;

//완주하지 못한 선수
//https://programmers.co.kr/learn/courses/30/lessons/42576
public class java_42576 {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};

        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        //participant1      completion1      leo
        //participant2      completion2      vinko
        //participant3      completion3      mislav
        System.out.println(solution(participant1, completion1));
        System.out.println(solution(participant2, completion2));
        System.out.println(solution(participant3, completion3));
    }

    public static String solution(String[] participant, String[] completion) {
        //참조해서 푼 문제..
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String pPerson: participant){
            map.put(pPerson, map.containsKey(pPerson) ? map.get(pPerson) + 1 :1);
        }
        for(String cPerson: completion){
            map.put(cPerson, map.get(cPerson) -1);
        }

        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
            }
        }


        //포문.. 효율성 0점..
//        int deffrentCount = 0;
//        if(participant.length > 1){
//            for(int i=0; i<participant.length; i++){
//                deffrentCount = 0;
//                for(int j=0; j<completion.length; j++){
//                    if(participant[i].equals(completion[j]) == false){
//                        ++deffrentCount;
//                    }else{
//                        completion[j] = "";
//                        break;
//                    }
//                }
//
//                if(deffrentCount == completion.length){
//                    answer = participant[i];
//                    break;
//                }
//            }
//        }else{
//            answer = participant[0];
//        }

        return answer;
    }
}
