


import java.io.*;
import java.util.*;

enum Status { Todo, Progress, Done }

class Task {
    static int lastId = 0;
    int taskId;
    String desc;
    Status status;

    Task(String desc, Status st) {
        lastId += 1;
        this.taskId = lastId;
        this.desc = desc;
        this.status = st;
    }

    // Convert Task to JSON-like string
    public String toJson() {
        return "{ \"taskId\": " + taskId + 
               ", \"desc\": \"" + desc + "\"" +
               ", \"status\": \"" + status + "\" }";
    }

    // Convert JSON-like string to Task
    public static Task fromJson(String json) {
        String[] parts = json.replace("{", "").replace("}", "").split(",");
        int id = Integer.parseInt(parts[0].split(":")[1].trim());
        String desc = parts[1].split(":")[1].trim().replace("\"", "");
        Status status = Status.valueOf(parts[2].split(":")[1].trim().replace("\"", ""));
        
        Task task = new Task(desc, status);
        task.taskId = id;  // Preserve original ID
        lastId = Math.max(lastId, id);
        return task;
    }
}

class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();
    String fileName = "tasks.json";

    TaskManager() {
        System.out.println("Your task manager is created");
        loadTasks();
    }

    public void addTask(String desc, Status id) {
        Task t = new Task(desc, id);
        tasks.add(t);
        saveTasks();
        System.out.println("Task '" + t.taskId + "' is added");
    }

    public void updateTask(int taskId, Status st) {
        for (Task task : tasks) {
            if (task.taskId == taskId) {
                task.status = st;
                saveTasks();
                System.out.println(task.desc + " has been updated");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.taskId == taskId);
        saveTasks();
        System.out.println("Task " + taskId + " has been removed");
    }

    public void listAllTask() {
        for (Task task : tasks) {
            System.out.println(task.desc);
        }
        System.out.println();
    }

    public void listTask(Status st) {
        for (Task task : tasks) {
            if (task.status == st)
                System.out.println(task.desc);
        }
        System.out.println();
    }

    // Save tasks to JSON file
    private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("[\n");
            for (int i = 0; i < tasks.size(); i++) {
                writer.write(tasks.get(i).toJson());
                if (i < tasks.size() - 1) writer.write(",\n");
            }
            writer.write("\n]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load tasks from JSON file
    private void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line.trim());
            }

            if (json.length() > 2) { // If file is not empty
                String[] jsonTasks = json.toString().replace("[", "").replace("]", "").split("},");
                for (String jsonTask : jsonTasks) {
                    jsonTask = jsonTask.trim();
                    if (!jsonTask.endsWith("}")) jsonTask += "}";
                    tasks.add(Task.fromJson(jsonTask));
                }
            }
        } catch (IOException e) {
            System.out.println("No existing tasks found.");
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("Get a job", Status.Todo);
        tm.addTask("Do something", Status.Done);
        tm.addTask("Be disciplined", Status.Progress);
        tm.addTask("Jump to real world", Status.Todo);

        tm.listAllTask();
        tm.listTask(Status.Todo);
        tm.deleteTask(3);
        tm.updateTask(2, Status.Todo);

        tm.listAllTask();
    }
}






/*
import java.util.*;
import java.io.*;


enum Status { Todo, Progress, Done  };


class Task{

  static int lastId = 0;
  int taskId;
  String desc;
  Status status;

  Task(String desc, Status st){
      lastId += 1;
      this.taskId = lastId;
      this.desc = desc;
      this.status = st;
    }

  // Convert Task to JSON-like string
    public String toJson() {
        return "{ \"taskId\": " + taskId + 
               ", \"desc\": \"" + desc + "\"" +
               ", \"status\": \"" + status + "\" }";
    }

    // Convert JSON-like string to Task
    public static Task fromJson(String json) {
        String[] parts = json.replace("{", "").replace("}", "").split(",");
        int id = Integer.parseInt(parts[0].split(":")[1].trim());
        String desc = parts[1].split(":")[1].trim().replace("\"", "");
        Status status = Status.valueOf(parts[2].split(":")[1].trim().replace("\"", ""));
        
        Task task = new Task(desc, status);
        task.taskId = id;  // Preserve original ID
        lastId = Math.max(lastId, id);
        return task;
    } 

}






class TaskManager{

   ArrayList<Task> tasks = new ArrayList<>();
   
   TaskManager(){
      System.out.println("Your task manager is created");
	   }
   

   public void addTask(String desc,Status id){
        Task t = new Task(desc,id);
	tasks.add(t);
	System.out.println( "Task '" + t.taskId + "' is added");
	   }

   public void updateTask(int taskId, Status st){
          Task t = null;
	  for(int i=0;i<tasks.size();i++){
               if(tasks.get(i).taskId == taskId){
                   t = tasks.get(i);
		   break;
		       }
		  }
	  t.status = st;
	  System.out.println(t.desc + " has been updated");
	   };


   public void deleteTask(int taskId){
	  Task t = null;  
         for(int i=0;i<tasks.size();i++){
               if(tasks.get(i).taskId == taskId){
                   t = tasks.get(i);
                   break;
                       }   
                  }   
         tasks.remove(t);
	 System.out.println(t.desc + " has been removed");
	   }


   public void listAllTask(){
      for(int i=0;i<tasks.size();i++)
	 System.out.println(tasks.get(i).desc);

      System.out.println();	 
	   }

   public void listTask(Status st){
       for(int i=0;i<tasks.size();i++){
	 if(tasks.get(i).status == st)      
          System.out.println(tasks.get(i).desc);
       }
           System.out.println();

	   }


public static void main(String[] args){
     
     TaskManager tm = new TaskManager();
     tm.addTask("Get a job",Status.Todo);
     tm.addTask("do something",Status.Done);
     tm.addTask("be desciplined",Status.Progress);
     tm.addTask("jump to real world",Status.Todo);

     tm.listAllTask();
     tm.listTask(Status.Todo);
     tm.deleteTask(3);
     tm.updateTask(2,Status.Todo);

     tm.listAllTask();


	}



	}


*/
