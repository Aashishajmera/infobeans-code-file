function createHeader() {
  var main_container = document.querySelector(".main-container");

  //    header
  var header = document.createElement("header");
  header.setAttribute(
    "style",
    "height: 15vh; width: 100vw; border: solid 3px black;"
  );

  header.setAttribute(
    "class",
    "d-flex align-items-center justify-content-center"
  );
  //    header-div
  var headerDiv = document.createElement("div");
  headerDiv.setAttribute(
    "style",
    "height: 95%; width: 99%; border: solid 2px red;"
  );
  headerDiv.setAttribute(
    "class",
    "d-flex justify-content-between align-items-center"
  );

  // logoDiv
  var logoDiv = document.createElement("div");
  logoDiv.setAttribute("style", "height: 70%; width: 10%;");
  logoDiv.setAttribute("class", "border border-success");
  var logoImg = document.createElement("img");
  logoImg.setAttribute("style", "height: 100%; width: 100%");
  logoImg.setAttribute("src", "./assets/realLogo.jpg");
  logoImg.setAttribute("class", "img-fluid");

  // menuDiv
  var menuDiv = document.createElement("nav");
  menuDiv.setAttribute("style", "height: 70%; width: 30%;");
  menuDiv.setAttribute("class", "border border-danger d-flex justify-content-center align-items-center");
  var ul = document.createElement("div");
  ul.setAttribute("style", " height: 70%; width: 100%;");
  ul.setAttribute("class", " border border-success d-flex list-inline justify-content-around align-items-center")
  var li1 = document.createElement("li");
  var li2 = document.createElement("li");
  var li3 = document.createElement("li");
  var li4 = document.createElement("li");

  li1.innerHTML = "Home";
  li2.innerHTML = "About";
  li3.innerHTML = "Service";
  li4.innerHTML = "Contact";


  // btnDiv
  var btnDiv = document.createElement("div");
  btnDiv.setAttribute("style", "height: 70%; width: 20%;");
  btnDiv.setAttribute("class", "border border-primary d-flex justify-content-around align-items-center");
    var signUp = document.createElement("div");
    var signIn = document.createElement("div");

    signUp.innerHTML= "Sign Up";
    signIn.innerHTML = "Sign In";




  headerDiv.appendChild(logoDiv);
  logoDiv.appendChild(logoImg);
  headerDiv.appendChild(menuDiv);
  menuDiv.appendChild(ul);
  ul.appendChild(li1);
  ul.appendChild(li2);
  ul.appendChild(li3);
  ul.appendChild(li4);
  headerDiv.appendChild(btnDiv);
  btnDiv.appendChild(signUp);
  btnDiv.appendChild(signIn);
  header.appendChild(headerDiv);
  //    connect header
  main_container.appendChild(header);
}
