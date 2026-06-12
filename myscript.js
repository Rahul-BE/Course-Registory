
function showCourses() {

    fetch('http://localhost:8080/courses')
        .then(response => response.json())
        .then((courses) => {
            const dataTable = document.getElementById('courseTable');

            courses.forEach(course => {
                var row = `<tr>
                    <td>${course.id}</td>
                    <td>${course.trainer}</td>
                    <td>${course.courseName}</td>
                    <td>${course.courseDuration}</td>
                </tr>`

                dataTable.innerHTML += row;
            });
        });
}


function showEnrolledStudents() {

    fetch('http://localhost:8080/courses/registered')
        .then(response => response.json())
        .then((courses) => {
            const dataTable = document.getElementById('enrolledTable');

            courses.forEach(course => {
                var row = `<tr>
                    <td>${course.id}</td>
                    <td>${course.courseName}</td>
                    <td>${course.emailId}</td>
                    <td>${course.name}</td>
                </tr>`

                dataTable.innerHTML += row;
            });
        });
}

