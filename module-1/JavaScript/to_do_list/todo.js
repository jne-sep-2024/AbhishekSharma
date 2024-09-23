function getTodo() {

    document.getElementById('addTaskButton').addEventListener('click', function () {

        const taskInput = document.getElementById("newTask");
        const taskValue = taskInput.value;

        //Basically this will check if the input is empty this alert will display on the screen 
        if (taskValue === '') {
            alert("Please enter a task..");
            return;
        }

        //Create new task element
        const taskItem = document.createElement('li');
        taskItem.textContent = taskValue;

        taskItem.addEventListener('click', function () {
            taskItem.classList.toggle('Completed');
        });

        //Add task to the list
        document.getElementById('taskList').appendChild(taskItem);

        //Clear input field
        taskInput.value = "";

        //Remove task on double click
        taskItem.addEventListener('dblclick', function () {
            taskItem.remove();
        });
    });
}

document.addEventListener('DOMContentLoaded', getTodo);