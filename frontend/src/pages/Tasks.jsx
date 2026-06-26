import { useState } from "react";

export default function Tasks() {
  const [tasks, setTasks] = useState([]);

  async function loadTasks() {
    const response = await fetch("http://localhost:8081/api/tasks");
    const data = await response.json();

    setTasks(data);
  }

  async function loadTodayTasks() {
    const response = await fetch("http://localhost:8081/api/tasks/today");
    const data = await response.json();

    setTasks(data);
  }

  return (
    <div>
      <h1>Tasks</h1>

      <button onClick={loadTasks}>Load Tasks</button>
      <button onClick={loadTodayTasks}>Load Today's Tasks</button>

      <ul>
        {tasks.map((task) => (
          <li key={task.id}>{task.title}</li>
        ))}
      </ul>
    </div>
  );
}
