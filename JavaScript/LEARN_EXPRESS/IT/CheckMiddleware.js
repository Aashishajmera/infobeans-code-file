// import express from 'express';
// const app = express();

// app.use((req, res, next) => {
//   console.log('This middleware runs for every request');
//   next();
// });

// app.get('/route1', (req, res) => {
//   res.send('This is route 1');
// });

// app.get('/route2', (req, res) => {
//   res.send('This is route 2');
// });

// app.listen(3000, () => {
//   console.log('Server is running on port 3000');
// });

import express from 'express';
const app = express();
const router = express.Router();

// router.use((req, res, next) => {
//   console.log('This middleware runs for routes within the router');
//   next();
// });
// app.use((req, res, next) => {
//     console.log('This middleware runs for routes within the router');
//     next();
//   });

router.get('/route1', (req, res) => {
  res.send('This is route 1 within the routerrrrr');
});

app.get('/route1', (req, res) => {
    res.send('This is route 1 within the apiiiiii');
  });


app.use(router);


app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
