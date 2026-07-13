let planes = document.querySelectorAll(".plane");
let zindex = 0;


planes.forEach(plane =>{
    plane.addEventListener("click", () =>{
        zindex++;
        plane.style.zIndex = zindex;
    })
    
})