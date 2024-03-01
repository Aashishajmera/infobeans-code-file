import { Component } from "react";
import { productList } from "../Productlist";
class Table extends Component {
  constructor() {
    super();
    this.state = {
      productList: productList,
    };
  }

  deleteProduct = (index) => {
    const updateProductList = this.state.productList.filter(
      (product, i) => i != index
    );
    this.setState({ productList: updateProductList });
  };

  editProduct = () => {
    window.alert("Hi i am called: ");
    
  };

  render() {
    return (
      <>
        <div className="container">
          <div className="col-12">
            <table className="table">
              <thead>
                <tr>
                  <th>S.no</th>
                  <th>Title</th>
                  <th>Brand</th>
                  <th>Thumbnail</th>
                  <th>Price</th>
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
              </thead>

              <tbody>
                {this.state.productList.map((product, index) => (
                  <tr>
                    <td>{index + 1}</td>
                    <td>{product.title}</td>
                    <td>{product.brand}</td>
                    <td>
                      <img src={product.thumbnail} width={150} height={120} />
                    </td>
                    <td>{product.price}</td>
                    <td>
                      <button
                        className="btn btn-primary"
                        onClick={this.editProduct}>
                        Edit
                      </button>
                    </td>
                    <td>
                      <button
                        className="btn btn-danger"
                        onClick={() => this.deleteProduct(index)}>
                        Delete
                      </button>
                    </td>
                  </tr>
                ))}

                <tr></tr>
              </tbody>
            </table>
          </div>
        </div>
      </>
    );
  }
}

export default Table;
