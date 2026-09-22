/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        var n = "Hello World";
        return n;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */