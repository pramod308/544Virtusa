var x=document.getElementById("login");
var y=document.getElementById("register");
var z=document.getElementById("btn");
function register()
{
    x.style.left="-400px";
    y.style.left="50px";
    z.style.left="110px";
}
function login()
{
    x.style.left="50px";
    y.style.left="450px";
    z.style.left="0px";
}
var c=0;
function show()
{
    if(c%2==0)
    {
        document.getElementById("pswd").type="text";
    }
    else
    {
        document.getElementById("pswd").type="password";
    }
    c+=1
}
var c1=0;
function show1()
{
    if(c1%2==0)
    {
        document.getElementById("pswd1").type="text";
    }
    else
    {
        document.getElementById("pswd1").type="password";
    }
    c1+=1
}
