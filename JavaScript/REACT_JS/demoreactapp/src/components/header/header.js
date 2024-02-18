import { Component } from "react";
import './header.css';
export default class Header extends Component {
  render() {
    return (
      <>
        {/* <!-- header --> */}
        <header>
          {/* <!-- main-header --> */}
          <div className="main-header">
            <h5>SPECTRAL</h5>
            <div className="humber">
              {" "}
              Menu &nbsp;
              <i
                data-bs-toggle="offcanvas"
                data-bs-target="#offcanvasRight"
                aria-controls="offcanvasRight"
                className="fa-solid fa-bars"></i>
            </div>

            <div
              className="offcanvas offcanvas-end"
              tabindex="-1"
              id="offcanvasRight"
              aria-labelledby="offcanvasRightLabel">
              <div className="offcanvas-header">
                <h5 className="offcanvas-title" id="offcanvasRightLabel">
                  MENU
                </h5>
                <button
                  type="button"
                  className="btn-close"
                  data-bs-dismiss="offcanvas"
                  aria-label="Close"></button>
              </div>
              <div className="offcanvas-body">
                <ul>
                  <li>Home</li>
                  <li>About</li>
                  <li>Generic</li>
                  <li>Elements</li>
                  <li>Sign Up</li>
                  <li>Log In</li>
                </ul>
              </div>
            </div>
          </div>
        </header>
      </>
    );
  }
}
