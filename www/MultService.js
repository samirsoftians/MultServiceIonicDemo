var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'MultService', 'coolMethod', [arg0]);
};


exports.coolMethod2 = function (arg0, success, error) {
    exec(success, error, 'MultService', 'coolMethod2', [arg0]);
};