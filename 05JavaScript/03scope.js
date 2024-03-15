var globall_x =1;
console.log("outside of function global_x");

function foo(){
    var local_foo_x=2;
    console.log("inside foo, global foo", globall_x);
    console.log("inside foo, local_foo ", local_foo_x);
}

foo();
console.log('outside of function', local_foo_x);