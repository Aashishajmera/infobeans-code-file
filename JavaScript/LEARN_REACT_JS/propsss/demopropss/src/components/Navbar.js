export default function Navbar(props) {
  return (
    <>
      <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand fw-bold" href="#">
            {props.title}
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link" aria-current="page" href="#">
                  {props.home}
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  {props.about}
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  {props.contactUs}
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </>
  );
}

// IT IS WAY TO SET DEFAULT PROPS VALUE

// Navbar.propTypes = {
//   title: PropTypes.string,
// };

// Navbar.defaultProps = {
//   title: "fkjkjk",
// };
