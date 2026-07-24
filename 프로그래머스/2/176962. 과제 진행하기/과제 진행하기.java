import java.util.*;

class Task {
    public String name;
    public int startTime;
    public int remainTime;
    
    public Task(String name, int startTime, int remainTime) {
        this.name = name;
        this.startTime = startTime;
        this.remainTime = remainTime;
    }
}

class Solution {
    public String[] solution(String[][] plans) {
        Task[] tasks = new Task[plans.length];
         
        for(int i = 0; i < tasks.length; i++) {
            tasks[i] = new Task(
                plans[i][0],
                parseToMin(plans[i][1]),
                Integer.parseInt(plans[i][2])
            );
        }
        
        Arrays.sort(tasks,
                    Comparator.comparingInt(task -> task.startTime));
        
        Deque<Task> remainTask = new ArrayDeque<>();
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < tasks.length - 1; i++) {
            Task current = tasks[i];
            Task next = tasks[i + 1];
            
            int availableTime = next.startTime - current.startTime;
            
            if(availableTime >= current.remainTime) {
                availableTime -= current.remainTime;
                answer.add(current.name);
                
                while(availableTime > 0 && !remainTask.isEmpty()) {
                    Task paused = remainTask.pop();
                    
                    if(availableTime >= paused.remainTime) {
                        availableTime -= paused.remainTime;
                        answer.add(paused.name);
                    } else {
                        paused.remainTime -= availableTime;
                        remainTask.push(paused);
                        availableTime = 0;
                    }
                }
            } else {
                current.remainTime -= availableTime;
                remainTask.push(current);
            }   
        }
    
        answer.add(tasks[tasks.length - 1].name);
        
        while(!remainTask.isEmpty()) {
            answer.add(remainTask.pop().name);
        }
        
        return answer.toArray(new String[0]);
    }
    
    private int parseToMin(String time) {
        String[] tmp = time.split(":");
        int hour = Integer.parseInt(tmp[0]);
        int min = Integer.parseInt(tmp[1]);
        
        return hour * 60 + min;
    }
}