async function getUser() {

    await fetch("https://jsonplaceholder.typicode.com/users")

        .then(res => {
            if (!res.ok) {
                throw new Error('Network error');
            }
            return res.json();

        })
        .then(data => {

            if (data.length > 0) {

                const temp = document.getElementById('table');

                let headerRow = `<tr>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>PHONE</th>
                </tr>`;

                temp.innerHTML += headerRow;

                data.forEach(itemData => {

                    row =
                        `
                    <tr>
                    <td>${itemData.id}</td>
                    <td>${itemData.name}</td>
                    <td>${itemData.email}</td>
                    <td>${itemData.phone}</td>
                    </tr>
                    `;

                    temp.innerHTML += row;
                });
                console.log(itemData);

            }
        })

        .catch(error => {
            console.log("Error", error);
        });
}

//getUser();