// Post.html
// To call sidebar and navbar on every page
// Fetch sidebar
document.addEventListener("DOMContentLoaded", function () {

    fetch('sidebar.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('sidebar').innerHTML = data;
        });

    // Fetch navbar
    fetch('navbar.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('navbar').innerHTML = data;
        });
});

let updateRowId = null;

function getPost() {

    let todo = document.getElementById('todo_list');
    let duedate = document.getElementById('due_date');
    let status = document.getElementById('status');

    let resultBody = document.getElementById("resultBody");

    //This is also not working
    // if (updateRowId !== null) {

    //     //trying to get id by row_Id here


    //     let rows = resultBody.getElementsByTagName('tr');

    //     for (const row of rows) {

    //         if (row.getAttribute('data_id') === updateRowId.toString()) {

    //             //Adding element at the index position
    //             row.children[0].textContent = todo.value;
    //             row.children[1].textContent = duedate.value;
    //             row.children[2].textContent = status.value;

    //             //Reassiging the value as empty string
    //             todo.value = "";
    //             duedate.value = "";
    //             status.value = "";
    //             updateRowId = null;
    //             return;

    //         }
    //     }
    // }




    // Created a new row
    let newRow = document.createElement("tr");

    // Created cells for the todo, due_date, status, and delete button for update also
    let todoCell = document.createElement("td");
    let duedateCell = document.createElement("td");
    let statusCell = document.createElement("td");
    let deleteCell = document.createElement("td");
    let updateCell = document.createElement("td");

    // Set the content of each cell
    todoCell.textContent = todo.value;
    duedateCell.textContent = duedate.value;
    statusCell.textContent = status.value;


    //Timestamp as an unique id
    let rowId = Date.now();
    newRow.setAttribute('data_id', rowId);

    //Created update button
    let updateButton = document.createElement("button");
    updateButton.textContent = "Update";
    updateButton.onclick = function () {

        //Populate input fields with current row data
        todo.value = todoCell.textContent;
        duedate.value = duedateCell.textContent;
        status.value = statusCell.textContent;

        //remove the data from row
        resultBody.removeChild(newRow);
        updateRowId = rowId;
    };

    //Append update button to update cell
    updateCell.appendChild(updateButton);


    // Create delete button
    let deleteButton = document.createElement("button");
    deleteButton.textContent = "Delete";
    deleteButton.onclick = function () {
        resultBody.removeChild(newRow);
    };

    // Append delete button to delete cell
    deleteCell.appendChild(deleteButton);

    // Append cells to the row
    newRow.appendChild(todoCell);
    newRow.appendChild(duedateCell);
    newRow.appendChild(statusCell);
    newRow.appendChild(deleteCell);
    newRow.appendChild(updateCell);

    // Empty input fields after adding a task
    todo.value = "";
    duedate.value = "";
    status.value = "";

    // Add the row to the table body
    resultBody.appendChild(newRow);

}

// This is not working
// let updateRowId = null;
// function updateFunction() {

//     if (updateRowId === null) {
//         console.log("Nothing to update");
//         return;

//     }

//     //Reassining the data
//     let todo = document.getElementById('todo_list');
//     let duedate = document.getElementById('due_date');
//     let status = document.getElementById('status');
//     let resultBody = document.getElementById("resultBody");

//     let rows = resultBody.getElementById('tr');

//     for (const row of rows) {
//         if (row.getAttribute('data_id') === updateRowId.toString()) {

//             //Adding element at the index position
//             row.children[0].textContent = todo.value;
//             row.children[1].textContent = duedate.value;
//             row.children[2].textContent = status.value;

//             //Reassiging the value as empty string
//             todo.value = "";
//             duedate.value = "";
//             status.value = "";
//             updateRowId = null;
//             return;

//         }

//         console.log('Row is not found');

//     }

// }

