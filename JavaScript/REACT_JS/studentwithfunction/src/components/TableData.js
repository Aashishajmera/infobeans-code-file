
export default function Tabledata(props) {
    let {studentList, deleteRecord, defaultBranch} = props;
  return (
    <>
      <div className="container mt-5">
        <table className="table">
          <thead>
            <tr>
              <th>S.no</th>
              <th>Roll Number</th>
              <th>Name</th>
              <th>Branch</th>
              <th>Mobile</th>
              <th>Delete</th>
            </tr>
          </thead>
          <tbody>
            {studentList.filter((student)=>student.branch === defaultBranch && defaultBranch === 'ALL')
            .map((student, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{student.roll}</td>
                <td>{student.name}</td>
                <td>{student.branch}</td>
                <td>{student.mobile}</td>
                <td>
                  <button className="btn btn-danger" onClick={()=>deleteRecord(student.roll)}>Delete</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}
