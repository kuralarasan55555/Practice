function factorial(){
    let n=document.getElementById("num").value;
    var  f=1;
    var i;
    var c=0,f1=n;
    if(n<=170){
    for(i=1;i<=n;i++){
        f=f*i;
    }
    const d=BigInt(f);
    document.getElementById("demo").value=d;
   }
   else{
    var s="";
    for(i=1;i<=n;i++){
        f=f*i;
        s=s+f;
    }
    document.getElementById("demo").value=s;
   }

    }
    