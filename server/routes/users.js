var express = require('express');
var router = express.Router();

/* GET users listing. */
router.post('/users/auth', function(req, res, next) {
  res.json({id: req.body.id, 
    password: req.body.password
  })
});

module.exports = router;