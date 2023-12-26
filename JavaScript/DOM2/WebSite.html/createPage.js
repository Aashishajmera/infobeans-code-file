function createHeader() {
  var main_container = document.querySelector(".main-container");
  var header = document.createElement("header");
  header.setAttribute("style", "height:70px; width:100%;");
  header.setAttribute(
    "class",
    "d-flex bg-dark justify-content-between align-items-center"
  );

  var logoDiv = document.createElement("div");
  logoDiv.setAttribute("style", "height: 60px; width: 15%; ");

  logoDiv.setAttribute(
    "class",
    "d-flex justify-content-center align-items-center"
  );

  var menuDiv = document.createElement("div");
  menuDiv.setAttribute("style", "height: 60px; width: 50%;");
  menuDiv.setAttribute(
    "class",
    "d-flex align-items-center justify-content-center"
  );

  var navDiv = document.createElement("div");
  navDiv.setAttribute(
    "style",
    "height: 60px; width: 15%; font-size:19px; color: white;"
  );
  navDiv.setAttribute(
    "class",
    "d-flex align-items-center justify-content-around"
  );

  var logoImg = document.createElement("img");
  logoImg.setAttribute("style", "width: 80%; height: 80%;");
  logoImg.setAttribute("src", "./assits/logo.jpeg");
  logoDiv.appendChild(logoImg);

  var input = document.createElement("input");
  input.setAttribute("type", "text");
  input.setAttribute("placeholder", "Search Something");
  input.setAttribute("style", "height: 50px; width: 70%; border:none;");
  input.setAttribute("class", "p-3 rounded-pill ");
  menuDiv.appendChild(input);

  if (isLoggedIn()) {
    var viewCart = document.createElement("span");
    var signOut = document.createElement("span");
    viewCart.innerHTML = "View Cart";
    signOut.innerHTML = "Sign Out";
    viewCart.setAttribute("style", "cursor: pointer");
    signOut.setAttribute("style", "cursor: pointer");

    viewCart.addEventListener("click", () => {
      viewCartFun();
    });

    signOut.addEventListener("click", () => {
      signOutFun();
    });

    navDiv.appendChild(viewCart);
    navDiv.appendChild(signOut);
  } else {
    // SIGN UP
    var spanSignUp = document.createElement("span");
    spanSignUp.innerHTML = "Sign up";
    spanSignUp.setAttribute("style", "cursor: pointer");

    // event listner in signUp
    spanSignUp.addEventListener("click", () => {
      signUpPage();
    });

    // SIGN IN
    var spanLogin = document.createElement("span");
    spanLogin.innerHTML = "Sign in";
    spanLogin.setAttribute("style", "cursor: pointer");

    // event listner in signIn
    spanLogin.addEventListener("click", () => {
      signInPage();
    });

    navDiv.appendChild(spanSignUp);
    navDiv.appendChild(spanLogin);
  }
  header.appendChild(logoDiv);
  header.appendChild(menuDiv);
  header.appendChild(navDiv);
  main_container.appendChild(header);
}

// =======================================SIGN-UP-PAGE===============================================
function signUpPage() {
  var main_container = document.querySelector(".main-container");
  main_container.innerHTML = "";

  // form div
  var formContainer = document.createElement("div");
  formContainer.setAttribute(
    "style",
    "height: 250px; width: 300px; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); box-shadow: 0px 0px 10px 10px grey; border-radius: 10px; background-color: whitesmoke;"
  );
  formContainer.setAttribute(
    "class",
    "d-flex flex-column  justify-content-center"
  );
  formContainer.setAttribute("id", "formContainer");

  // email input field
  var email = document.createElement("input");
  email.setAttribute("id", "email");
  email.setAttribute("type", "email");
  email.setAttribute("placeholder", "Enter email");
  email.setAttribute(
    "style",
    "width: 100%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px;"
  );

  // password input field
  var password = document.createElement("input");
  password.setAttribute("id", "password");
  password.setAttribute("type", "password");
  password.setAttribute("placeholder", "Password");
  password.setAttribute(
    "style",
    "width: 100%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px;"
  );

  // sign up button:
  var divBtn = document.createElement("div");
  var signUp = document.createElement("button");
  signUp.innerHTML = "Sign Up";
  signUp.setAttribute("class", "btn btn-success m-2");
  signUp.setAttribute("style", "width: 90px;");

  // SIGN UP BUTTON
  signUp.addEventListener("click", () => {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    if (isUserExits(email, password)) {
      window.alert("User alredy exits: ");
    } else {
      var userData = { email: email, password: password };
      var userList = JSON.parse(localStorage.getItem("userList"));
      userList.push(userData);
      localStorage.setItem("userList", JSON.stringify(userList));
      window.alert("Your account successfully created: ");

      sessionStorage.setItem("isLoggedIn", "true");
      sessionStorage.setItem("currentUser", email);
      var main_container = document.getElementsByClassName(".main-container");
      main_container.innerHTML = "";
      var formContainer = document.getElementById("formContainer");
      formContainer.innerHTML = "";
      formContainer.remove();
      createHeader();
      var data = JSON.parse(localStorage.getItem("productList"));
      createCart(data);
    }
  });

  // alredy have account
  var accountAlredy = document.createElement("span");
  accountAlredy.innerHTML = "alredy have account";
  accountAlredy.setAttribute("style", "cursor: pointer;");

  accountAlredy.addEventListener("click", () => {
    signInPage();
  });

  formContainer.appendChild(email);
  formContainer.appendChild(password);
  formContainer.appendChild(divBtn);
  divBtn.appendChild(signUp);
  divBtn.appendChild(accountAlredy);
  main_container.appendChild(formContainer);
}

// IS USER EXITS OR NOT
function isUserExits(email, password) {
  // get data into local storage
  var userData = localStorage.getItem("userList");
  userData = JSON.parse(userData);

  var user = userData.find((user) => {
    return user.email == email;
  });
  return !!user;
}

// ============================================SIGN-IN-PAGE=================================================
function signInPage() {
  var main_container = document.querySelector(".main-container");
  main_container.innerHTML = "";

  // form div
  var formContainer = document.createElement("div");
  formContainer.setAttribute(
    "style",
    "height: 250px; width: 300px; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); box-shadow: 0px 0px 10px 10px grey; border-radius: 10px; background-color: whitesmoke;"
  );
  formContainer.setAttribute(
    "class",
    "d-flex flex-column  justify-content-center"
  );
  formContainer.setAttribute("id", "formContainer");

  // email input field
  var email = document.createElement("input");
  email.setAttribute("id", "email");
  email.setAttribute("type", "email");
  email.setAttribute("placeholder", "Enter email");
  email.setAttribute(
    "style",
    "width: 100%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px;"
  );

  // password input field
  var password = document.createElement("input");
  password.setAttribute("id", "password");
  password.setAttribute("type", "password");
  password.setAttribute("placeholder", "Password");
  password.setAttribute(
    "style",
    "width: 100%; padding: 10px; border-radius: 10px; font-size: 18px; margin-bottom: 10px;"
  );

  // sign up button:
  var btnDiv = document.createElement("div");
  var signIn = document.createElement("button");
  signIn.innerHTML = "Sign In";
  signIn.setAttribute("class", "btn btn-success m-2");
  signIn.setAttribute("style", "width: 90px;");

  // SIGN IN BUTTON
  signIn.addEventListener("click", () => {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    signInFun(email, password);
  });

  // create new account
  var newAccount = document.createElement("span");
  newAccount.innerHTML = "create new account";
  newAccount.setAttribute("style", "cursor: pointer;");

  newAccount.addEventListener("click", () => {
    signUpPage();
  });

  formContainer.appendChild(email);
  formContainer.appendChild(password);
  formContainer.appendChild(btnDiv);
  btnDiv.appendChild(signIn);
  btnDiv.appendChild(newAccount);
  main_container.appendChild(formContainer);
}

// SIGN IN
function signInFun(email, password) {
  var userList = localStorage.getItem("userList");
  userList = JSON.parse(userList);

  var checkUser = userList.find((user) => {
    return user.email == email && user.password == password;
  });

  if (checkUser) {
    window.alert("Sign in successfull");
    sessionStorage.setItem("isLoggedIn", "true");
    sessionStorage.setItem("currentUser", checkUser.email);
    var main_container = document.getElementsByClassName(".main-container");
    main_container.innerHTML = "";
    var formContainer = document.getElementById("formContainer");
    formContainer.innerHTML = "";
    formContainer.remove();
    createHeader();
    var data = JSON.parse(localStorage.getItem("productList"));
    createCart(data);
  } else {
    window.alert("Sign in faild");
  }
}

function isLoggedIn() {
  return !!sessionStorage.getItem("isLoggedIn"); // true or null == false
}

// ========================================SIGN-OUT-PAGE================================================
function signOutFun() {
  window.alert("Sign out successfull");
  sessionStorage.clear();
  var main_container = document.querySelector(".main-container");
  main_container.innerHTML = "";
  createHeader();
  var data = JSON.parse(localStorage.getItem("productList"));
  createCart(data);
}

// ============================================PRODUCT-ITEM=================================================
function getConnection() {
  var productList = {
    products: [
      {
        id: 1,
        title: "iPhone 9",
        description: "An apple mobile which is nothing like apple",
        price: 549,
        discountPercentage: 12.96,
        rating: 4.69,
        stock: 94,
        brand: "Apple",
        category: "smartphones",
        thumbnail: "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/1/1.jpg",
          "https://i.dummyjson.com/data/products/1/2.jpg",
          "https://i.dummyjson.com/data/products/1/3.jpg",
          "https://i.dummyjson.com/data/products/1/4.jpg",
          "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
        ],
      },
      {
        id: 2,
        title: "iPhone X",
        description:
          "SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...",
        price: 899,
        discountPercentage: 17.94,
        rating: 4.44,
        stock: 34,
        brand: "Apple",
        category: "smartphones",
        thumbnail: "https://i.dummyjson.com/data/products/2/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/2/1.jpg",
          "https://i.dummyjson.com/data/products/2/2.jpg",
          "https://i.dummyjson.com/data/products/2/3.jpg",
          "https://i.dummyjson.com/data/products/2/thumbnail.jpg",
        ],
      },
      {
        id: 3,
        title: "Samsung Universe 9",
        description:
          "Samsung's new variant which goes beyond Galaxy to the Universe",
        price: 1249,
        discountPercentage: 15.46,
        rating: 4.09,
        stock: 36,
        brand: "Samsung",
        category: "smartphones",
        thumbnail: "https://i.dummyjson.com/data/products/3/thumbnail.jpg",
        images: ["https://i.dummyjson.com/data/products/3/1.jpg"],
      },
      {
        id: 4,
        title: "OPPOF19",
        description: "OPPO F19 is officially announced on April 2021.",
        price: 280,
        discountPercentage: 17.91,
        rating: 4.3,
        stock: 123,
        brand: "OPPO",
        category: "smartphones",
        thumbnail: "https://i.dummyjson.com/data/products/4/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/4/1.jpg",
          "https://i.dummyjson.com/data/products/4/2.jpg",
          "https://i.dummyjson.com/data/products/4/3.jpg",
          "https://i.dummyjson.com/data/products/4/4.jpg",
          "https://i.dummyjson.com/data/products/4/thumbnail.jpg",
        ],
      },
      {
        id: 5,
        title: "Huawei P30",
        description:
          "Huawei’s re-badged P30 Pro New Edition was officially unveiled yesterday in Germany and now the device has made its way to the UK.",
        price: 499,
        discountPercentage: 10.58,
        rating: 4.09,
        stock: 32,
        brand: "Huawei",
        category: "smartphones",
        thumbnail: "https://i.dummyjson.com/data/products/5/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/5/1.jpg",
          "https://i.dummyjson.com/data/products/5/2.jpg",
          "https://i.dummyjson.com/data/products/5/3.jpg",
        ],
      },
      {
        id: 6,
        title: "MacBook Pro",
        description:
          "MacBook Pro 2021 with mini-LED display may launch between September, November",
        price: 1749,
        discountPercentage: 11.02,
        rating: 4.57,
        stock: 83,
        brand: "Apple",
        category: "laptops",
        thumbnail: "https://i.dummyjson.com/data/products/6/thumbnail.png",
        images: [
          "https://i.dummyjson.com/data/products/6/1.png",
          "https://i.dummyjson.com/data/products/6/2.jpg",
          "https://i.dummyjson.com/data/products/6/3.png",
          "https://i.dummyjson.com/data/products/6/4.jpg",
        ],
      },
      {
        id: 7,
        title: "Samsung Galaxy Book",
        description:
          "Samsung Galaxy Book S (2020) Laptop With Intel Lakefield Chip, 8GB of RAM Launched",
        price: 1499,
        discountPercentage: 4.15,
        rating: 4.25,
        stock: 50,
        brand: "Samsung",
        category: "laptops",
        thumbnail: "https://i.dummyjson.com/data/products/7/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/7/1.jpg",
          "https://i.dummyjson.com/data/products/7/2.jpg",
          "https://i.dummyjson.com/data/products/7/3.jpg",
          "https://i.dummyjson.com/data/products/7/thumbnail.jpg",
        ],
      },
      {
        id: 8,
        title: "Microsoft Surface Laptop 4",
        description:
          "Style and speed. Stand out on HD video calls backed by Studio Mics. Capture ideas on the vibrant touchscreen.",
        price: 1499,
        discountPercentage: 10.23,
        rating: 4.43,
        stock: 68,
        brand: "Microsoft Surface",
        category: "laptops",
        thumbnail: "https://i.dummyjson.com/data/products/8/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/8/1.jpg",
          "https://i.dummyjson.com/data/products/8/2.jpg",
          "https://i.dummyjson.com/data/products/8/3.jpg",
          "https://i.dummyjson.com/data/products/8/4.jpg",
          "https://i.dummyjson.com/data/products/8/thumbnail.jpg",
        ],
      },
      {
        id: 9,
        title: "Infinix INBOOK",
        description:
          "Infinix Inbook X1 Ci3 10th 8GB 256GB 14 Win10 Grey – 1 Year Warranty",
        price: 1099,
        discountPercentage: 11.83,
        rating: 4.54,
        stock: 96,
        brand: "Infinix",
        category: "laptops",
        thumbnail: "https://i.dummyjson.com/data/products/9/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/9/1.jpg",
          "https://i.dummyjson.com/data/products/9/2.png",
          "https://i.dummyjson.com/data/products/9/3.png",
          "https://i.dummyjson.com/data/products/9/4.jpg",
          "https://i.dummyjson.com/data/products/9/thumbnail.jpg",
        ],
      },
      {
        id: 10,
        title: "HP Pavilion 15-DK1056WM",
        description:
          "HP Pavilion 15-DK1056WM Gaming Laptop 10th Gen Core i5, 8GB, 256GB SSD, GTX 1650 4GB, Windows 10",
        price: 1099,
        discountPercentage: 6.18,
        rating: 4.43,
        stock: 89,
        brand: "HP Pavilion",
        category: "laptops",
        thumbnail: "https://i.dummyjson.com/data/products/10/thumbnail.jpeg",
        images: [
          "https://i.dummyjson.com/data/products/10/1.jpg",
          "https://i.dummyjson.com/data/products/10/2.jpg",
          "https://i.dummyjson.com/data/products/10/3.jpg",
          "https://i.dummyjson.com/data/products/10/thumbnail.jpeg",
        ],
      },
      {
        id: 11,
        title: "perfume Oil",
        description:
          "Mega Discount, Impression of Acqua Di Gio by GiorgioArmani concentrated attar perfume Oil",
        price: 13,
        discountPercentage: 8.4,
        rating: 4.26,
        stock: 65,
        brand: "Impression of Acqua Di Gio",
        category: "fragrances",
        thumbnail: "https://i.dummyjson.com/data/products/11/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/11/1.jpg",
          "https://i.dummyjson.com/data/products/11/2.jpg",
          "https://i.dummyjson.com/data/products/11/3.jpg",
          "https://i.dummyjson.com/data/products/11/thumbnail.jpg",
        ],
      },
      {
        id: 12,
        title: "Brown Perfume",
        description: "Royal_Mirage Sport Brown Perfume for Men & Women - 120ml",
        price: 40,
        discountPercentage: 15.66,
        rating: 4,
        stock: 52,
        brand: "Royal_Mirage",
        category: "fragrances",
        thumbnail: "https://i.dummyjson.com/data/products/12/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/12/1.jpg",
          "https://i.dummyjson.com/data/products/12/2.jpg",
          "https://i.dummyjson.com/data/products/12/3.png",
          "https://i.dummyjson.com/data/products/12/4.jpg",
          "https://i.dummyjson.com/data/products/12/thumbnail.jpg",
        ],
      },
      {
        id: 13,
        title: "Fog Scent Xpressio Perfume",
        description:
          "Product details of Best Fog Scent Xpressio Perfume 100ml For Men cool long lasting perfumes for Men",
        price: 13,
        discountPercentage: 8.14,
        rating: 4.59,
        stock: 61,
        brand: "Fog Scent Xpressio",
        category: "fragrances",
        thumbnail: "https://i.dummyjson.com/data/products/13/thumbnail.webp",
        images: [
          "https://i.dummyjson.com/data/products/13/1.jpg",
          "https://i.dummyjson.com/data/products/13/2.png",
          "https://i.dummyjson.com/data/products/13/3.jpg",
          "https://i.dummyjson.com/data/products/13/4.jpg",
          "https://i.dummyjson.com/data/products/13/thumbnail.webp",
        ],
      },
      {
        id: 14,
        title: "Non-Alcoholic Concentrated Perfume Oil",
        description:
          "Original Al Munakh® by Mahal Al Musk | Our Impression of Climate | 6ml Non-Alcoholic Concentrated Perfume Oil",
        price: 120,
        discountPercentage: 15.6,
        rating: 4.21,
        stock: 114,
        brand: "Al Munakh",
        category: "fragrances",
        thumbnail: "https://i.dummyjson.com/data/products/14/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/14/1.jpg",
          "https://i.dummyjson.com/data/products/14/2.jpg",
          "https://i.dummyjson.com/data/products/14/3.jpg",
          "https://i.dummyjson.com/data/products/14/thumbnail.jpg",
        ],
      },
      {
        id: 15,
        title: "Eau De Perfume Spray",
        description:
          "Genuine  Al-Rehab spray perfume from UAE/Saudi Arabia/Yemen High Quality",
        price: 30,
        discountPercentage: 10.99,
        rating: 4.7,
        stock: 105,
        brand: "Lord - Al-Rehab",
        category: "fragrances",
        thumbnail: "https://i.dummyjson.com/data/products/15/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/15/1.jpg",
          "https://i.dummyjson.com/data/products/15/2.jpg",
          "https://i.dummyjson.com/data/products/15/3.jpg",
          "https://i.dummyjson.com/data/products/15/4.jpg",
          "https://i.dummyjson.com/data/products/15/thumbnail.jpg",
        ],
      },
      {
        id: 16,
        title: "Hyaluronic Acid Serum",
        description:
          "L'OrÃ©al Paris introduces Hyaluron Expert Replumping Serum formulated with 1.5% Hyaluronic Acid",
        price: 19,
        discountPercentage: 13.31,
        rating: 4.83,
        stock: 110,
        brand: "L'Oreal Paris",
        category: "skincare",
        thumbnail: "https://i.dummyjson.com/data/products/16/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/16/1.png",
          "https://i.dummyjson.com/data/products/16/2.webp",
          "https://i.dummyjson.com/data/products/16/3.jpg",
          "https://i.dummyjson.com/data/products/16/4.jpg",
          "https://i.dummyjson.com/data/products/16/thumbnail.jpg",
        ],
      },
      {
        id: 17,
        title: "Tree Oil 30ml",
        description:
          "Tea tree oil contains a number of compounds, including terpinen-4-ol, that have been shown to kill certain bacteria,",
        price: 12,
        discountPercentage: 4.09,
        rating: 4.52,
        stock: 78,
        brand: "Hemani Tea",
        category: "skincare",
        thumbnail: "https://i.dummyjson.com/data/products/17/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/17/1.jpg",
          "https://i.dummyjson.com/data/products/17/2.jpg",
          "https://i.dummyjson.com/data/products/17/3.jpg",
          "https://i.dummyjson.com/data/products/17/thumbnail.jpg",
        ],
      },
      {
        id: 18,
        title: "Oil Free Moisturizer 100ml",
        description:
          "Dermive Oil Free Moisturizer with SPF 20 is specifically formulated with ceramides, hyaluronic acid & sunscreen.",
        price: 40,
        discountPercentage: 13.1,
        rating: 4.56,
        stock: 88,
        brand: "Dermive",
        category: "skincare",
        thumbnail: "https://i.dummyjson.com/data/products/18/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/18/1.jpg",
          "https://i.dummyjson.com/data/products/18/2.jpg",
          "https://i.dummyjson.com/data/products/18/3.jpg",
          "https://i.dummyjson.com/data/products/18/4.jpg",
          "https://i.dummyjson.com/data/products/18/thumbnail.jpg",
        ],
      },
      {
        id: 19,
        title: "Skin Beauty Serum.",
        description:
          "Product name: rorec collagen hyaluronic acid white face serum riceNet weight: 15 m",
        price: 46,
        discountPercentage: 10.68,
        rating: 4.42,
        stock: 54,
        brand: "ROREC White Rice",
        category: "skincare",
        thumbnail: "https://i.dummyjson.com/data/products/19/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/19/1.jpg",
          "https://i.dummyjson.com/data/products/19/2.jpg",
          "https://i.dummyjson.com/data/products/19/3.png",
          "https://i.dummyjson.com/data/products/19/thumbnail.jpg",
        ],
      },
      {
        id: 20,
        title: "Freckle Treatment Cream- 15gm",
        description:
          "Fair & Clear is Pakistan's only pure Freckle cream which helpsfade Freckles, Darkspots and pigments. Mercury level is 0%, so there are no side effects.",
        price: 70,
        discountPercentage: 16.99,
        rating: 4.06,
        stock: 140,
        brand: "Fair & Clear",
        category: "skincare",
        thumbnail: "https://i.dummyjson.com/data/products/20/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/20/1.jpg",
          "https://i.dummyjson.com/data/products/20/2.jpg",
          "https://i.dummyjson.com/data/products/20/3.jpg",
          "https://i.dummyjson.com/data/products/20/4.jpg",
          "https://i.dummyjson.com/data/products/20/thumbnail.jpg",
        ],
      },
      {
        id: 21,
        title: "- Daal Masoor 500 grams",
        description:
          "Fine quality Branded Product Keep in a cool and dry place",
        price: 20,
        discountPercentage: 4.81,
        rating: 4.44,
        stock: 133,
        brand: "Saaf & Khaas",
        category: "groceries",
        thumbnail: "https://i.dummyjson.com/data/products/21/thumbnail.png",
        images: [
          "https://i.dummyjson.com/data/products/21/1.png",
          "https://i.dummyjson.com/data/products/21/2.jpg",
          "https://i.dummyjson.com/data/products/21/3.jpg",
        ],
      },
      {
        id: 22,
        title: "Elbow Macaroni - 400 gm",
        description:
          "Product details of Bake Parlor Big Elbow Macaroni - 400 gm",
        price: 14,
        discountPercentage: 15.58,
        rating: 4.57,
        stock: 146,
        brand: "Bake Parlor Big",
        category: "groceries",
        thumbnail: "https://i.dummyjson.com/data/products/22/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/22/1.jpg",
          "https://i.dummyjson.com/data/products/22/2.jpg",
          "https://i.dummyjson.com/data/products/22/3.jpg",
        ],
      },
      {
        id: 23,
        title: "Orange Essence Food Flavou",
        description:
          "Specifications of Orange Essence Food Flavour For Cakes and Baking Food Item",
        price: 14,
        discountPercentage: 8.04,
        rating: 4.85,
        stock: 26,
        brand: "Baking Food Items",
        category: "groceries",
        thumbnail: "https://i.dummyjson.com/data/products/23/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/23/1.jpg",
          "https://i.dummyjson.com/data/products/23/2.jpg",
          "https://i.dummyjson.com/data/products/23/3.jpg",
          "https://i.dummyjson.com/data/products/23/4.jpg",
          "https://i.dummyjson.com/data/products/23/thumbnail.jpg",
        ],
      },
      {
        id: 24,
        title: "cereals muesli fruit nuts",
        description:
          "original fauji cereal muesli 250gm box pack original fauji cereals muesli fruit nuts flakes breakfast cereal break fast faujicereals cerels cerel foji fouji",
        price: 46,
        discountPercentage: 16.8,
        rating: 4.94,
        stock: 113,
        brand: "fauji",
        category: "groceries",
        thumbnail: "https://i.dummyjson.com/data/products/24/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/24/1.jpg",
          "https://i.dummyjson.com/data/products/24/2.jpg",
          "https://i.dummyjson.com/data/products/24/3.jpg",
          "https://i.dummyjson.com/data/products/24/4.jpg",
          "https://i.dummyjson.com/data/products/24/thumbnail.jpg",
        ],
      },
      {
        id: 25,
        title: "Gulab Powder 50 Gram",
        description:
          "Dry Rose Flower Powder Gulab Powder 50 Gram • Treats Wounds",
        price: 70,
        discountPercentage: 13.58,
        rating: 4.87,
        stock: 47,
        brand: "Dry Rose",
        category: "groceries",
        thumbnail: "https://i.dummyjson.com/data/products/25/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/25/1.png",
          "https://i.dummyjson.com/data/products/25/2.jpg",
          "https://i.dummyjson.com/data/products/25/3.png",
          "https://i.dummyjson.com/data/products/25/4.jpg",
          "https://i.dummyjson.com/data/products/25/thumbnail.jpg",
        ],
      },
      {
        id: 26,
        title: "Plant Hanger For Home",
        description:
          "Boho Decor Plant Hanger For Home Wall Decoration Macrame Wall Hanging Shelf",
        price: 41,
        discountPercentage: 17.86,
        rating: 4.08,
        stock: 131,
        brand: "Boho Decor",
        category: "home-decoration",
        thumbnail: "https://i.dummyjson.com/data/products/26/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/26/1.jpg",
          "https://i.dummyjson.com/data/products/26/2.jpg",
          "https://i.dummyjson.com/data/products/26/3.jpg",
          "https://i.dummyjson.com/data/products/26/4.jpg",
          "https://i.dummyjson.com/data/products/26/5.jpg",
          "https://i.dummyjson.com/data/products/26/thumbnail.jpg",
        ],
      },
      {
        id: 27,
        title: "Flying Wooden Bird",
        description:
          "Package Include 6 Birds with Adhesive Tape Shape: 3D Shaped Wooden Birds Material: Wooden MDF, Laminated 3.5mm",
        price: 51,
        discountPercentage: 15.58,
        rating: 4.41,
        stock: 17,
        brand: "Flying Wooden",
        category: "home-decoration",
        thumbnail: "https://i.dummyjson.com/data/products/27/thumbnail.webp",
        images: [
          "https://i.dummyjson.com/data/products/27/1.jpg",
          "https://i.dummyjson.com/data/products/27/2.jpg",
          "https://i.dummyjson.com/data/products/27/3.jpg",
          "https://i.dummyjson.com/data/products/27/4.jpg",
          "https://i.dummyjson.com/data/products/27/thumbnail.webp",
        ],
      },
      {
        id: 28,
        title: "3D Embellishment Art Lamp",
        description:
          "3D led lamp sticker Wall sticker 3d wall art light on/off button  cell operated (included)",
        price: 20,
        discountPercentage: 16.49,
        rating: 4.82,
        stock: 54,
        brand: "LED Lights",
        category: "home-decoration",
        thumbnail: "https://i.dummyjson.com/data/products/28/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/28/1.jpg",
          "https://i.dummyjson.com/data/products/28/2.jpg",
          "https://i.dummyjson.com/data/products/28/3.png",
          "https://i.dummyjson.com/data/products/28/4.jpg",
          "https://i.dummyjson.com/data/products/28/thumbnail.jpg",
        ],
      },
      {
        id: 29,
        title: "Handcraft Chinese style",
        description:
          "Handcraft Chinese style art luxury palace hotel villa mansion home decor ceramic vase with brass fruit plate",
        price: 60,
        discountPercentage: 15.34,
        rating: 4.44,
        stock: 7,
        brand: "luxury palace",
        category: "home-decoration",
        thumbnail: "https://i.dummyjson.com/data/products/29/thumbnail.webp",
        images: [
          "https://i.dummyjson.com/data/products/29/1.jpg",
          "https://i.dummyjson.com/data/products/29/2.jpg",
          "https://i.dummyjson.com/data/products/29/3.webp",
          "https://i.dummyjson.com/data/products/29/4.webp",
          "https://i.dummyjson.com/data/products/29/thumbnail.webp",
        ],
      },
      {
        id: 30,
        title: "Key Holder",
        description:
          "Attractive DesignMetallic materialFour key hooksReliable & DurablePremium Quality",
        price: 30,
        discountPercentage: 2.92,
        rating: 4.92,
        stock: 54,
        brand: "Golden",
        category: "home-decoration",
        thumbnail: "https://i.dummyjson.com/data/products/30/thumbnail.jpg",
        images: [
          "https://i.dummyjson.com/data/products/30/1.jpg",
          "https://i.dummyjson.com/data/products/30/2.jpg",
          "https://i.dummyjson.com/data/products/30/3.jpg",
          "https://i.dummyjson.com/data/products/30/thumbnail.jpg",
        ],
      },
    ],
    total: 100,
    skip: 0,
    limit: 30,
  };

  return productList;
}

function createCart(data) {
  var main_container = document.querySelector(".main-container");

  var cartContainer = document.createElement("div");

  cartContainer.setAttribute(
    "class",
    "d-flex flex-wrap justify-content-around p-2 mt-3"
  );

  for (var product of data.products) {
    var cartDiv = document.createElement("div");
    cartDiv.setAttribute(
      "style",
      "width:30%; height:450px; border:1px solid black; box-shadow: 0px 0px 10px 5px rgb(100, 100, 100);"
    );
    cartDiv.setAttribute("class", "m-3 d-flex flex-column align-items-center");

    // product image
    var productImg = document.createElement("img");
    productImg.setAttribute("src", product.thumbnail);
    productImg.setAttribute("style", "width:100%; height:300px;");

    // create title
    var titleDiv = document.createElement("h2");
    titleDiv.setAttribute(
      "style",
      "color: black; font-size: 18px; font-weight: 800; margin-top: 2px; margin-bottom: -1px"
    );
    titleDiv.innerHTML = product.title;

    // product price
    var priceDiv = document.createElement("div");
    priceDiv.setAttribute("style", "width: 55%;");
    priceDiv.setAttribute(
      "class",
      "d-flex justify-content-between align-items-center"
    );

    // delete price
    // var del = document.createElement("del");
    var deleteprice = document.createElement("span");
    deleteprice.innerHTML = product.price;
    deleteprice.setAttribute(
      "style",
      "color: red; font-size: 26px; font-weight: 700; text-decoration: line-through;"
    );

    // discount price
    var discountPrice = (product.price * product.discountPercentage) / 100;
    var acPrice = (product.price - discountPrice).toFixed(2);

    var discoundPrice = document.createElement("span");
    discoundPrice.innerHTML = "RS." + acPrice;
    discoundPrice.setAttribute(
      "style",
      "color: green; font-size: 25px; font-weight: 700;"
    );

    // product view
    var viewP = document.createElement("p");
    viewP.innerHTML = "view more";
    viewP.setAttribute(
      "style",
      "font-weight: 700; font-size: 18px; color: black; margin: 0"
    );

    // add to cart
    var addToCart = document.createElement("button");
    addToCart.setAttribute("id", "addToCart");
    addToCart.innerHTML = "Add To Card";
    addToCart.setAttribute(
      "style",
      "color: black; font-size: 20px; font-weight: 600; width: 90%; background-color: yellow; margin-top: 5px; padding: 3px; border: none; "
    );

     // add to cart without signUp and singIn
     addToCart.addEventListener("click", () => {
       if (!isLoggedIn()) {
         window.alert("LogIn first: ");
       }else{
          addProductInCart(product);        
       }
     });
 


    cartDiv.appendChild(productImg);
    cartDiv.appendChild(titleDiv);
    priceDiv.appendChild(deleteprice);
    priceDiv.appendChild(discoundPrice);
    cartDiv.appendChild(priceDiv);
    cartDiv.appendChild(viewP);
    cartDiv.appendChild(addToCart);
    cartContainer.appendChild(cartDiv);
  }

  main_container.appendChild(cartContainer);
}

function addProductInCart(product){
  
}